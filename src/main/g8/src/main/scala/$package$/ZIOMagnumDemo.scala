package $package$

import zio.*

import com.augustnagro.magnum.*
import com.augustnagro.magnum.ziomagnum.*
import javax.sql.DataSource

@SqlName("users")
@Table(PostgresDbType, SqlNameMapper.CamelToSnakeCase)
case class User(@Id id: Int, name: String) derives DbCodec

object ZIOMagnumDemo extends zio.ZIOAppDefault:

  given SqlLogger = SqlLogger.Default

  val repo = Repo[User, User, Int]

  private val program: RIO[DataSource, Unit] = for
    _ <- repo
      .zInsert(User(0, "Alice"))
      .tapError(err => zio.Console.printLineError(s"Insert error: $err"))
      .ignore
    _ <- sql"SELECT * FROM users"
      .zStream[User]()
      .runForeach(user => zio.Console.printLine(user))
  yield ()

  override def run = program
    .provide:
      // Provide necessary layers, e.g., database connection, logging, etc.
      Scope.default >>> dataSourceLayer(
        "jdbc:postgresql://localhost:5432/$dbName$",
        "$dbUsername$",
        "$dbPassword$"
      )
