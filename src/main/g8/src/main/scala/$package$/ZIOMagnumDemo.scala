package $package$

import zio.*

import com.augustnagro.magnum.*
import com.augustnagro.magnum.ziomagnum.*
import javax.sql.DataSource

@SqlName("users")
@Table(PostgresDbType, SqlNameMapper.CamelToSnakeCase)
case class User(@Id id: Int, name: String) derives DbCodec

object ZIOMagnumDemo extends zio.ZIOAppDefault:

  val repo = Repo[User, User, Int]

  private val program: RIO[DataSource, Unit] = repo.zInsert(User(0, "Alice"))

  override def run = program
    .provide:
      // Provide necessary layers, e.g., database connection, logging, etc.
      Scope.default >>> dataSourceLayer(
        "jdbc:postgresql://localhost:5432/$dbName$",
        "$dbUsername$",
        "$dbPassword$"
      )
