val Versions = new {
  val zio = "2.1.20"
  val testcontainers = "0.43.0"
  val munit = "1.1.1"
  val postgresDriver = "42.7.7"
  val magnum = "2.0.0-M2"
}

// give the user a nice default project!
inThisBuild(
  Seq(
    organization := "$organization$",
    scalaVersion := "$scalaVersion$",
    run / fork := true
  )
)

lazy val root = (project in file(".")).settings(
  name := "$name$"
)

libraryDependencies ++= Seq(
  "dev.cheleb" %% "zio-magnum" % "$zioMagnumVersion$",
  "com.dimafeng" %% "testcontainers-scala-munit" % Versions.testcontainers % Test,
  "com.dimafeng" %% "testcontainers-scala-postgresql" % Versions.testcontainers % Test,
  "org.postgresql" % "postgresql" % Versions.postgresDriver,
  "ch.qos.logback" % "logback-classic" % "1.5.21",
  "dev.zio" %% "zio-logging-slf4j" % "2.5.0",
  "dev.zio" %% "zio-test" % Versions.zio % Test,
  "dev.zio" %% "zio-test-sbt" % Versions.zio % Test,
  "ch.qos.logback" % "logback-classic" % "1.5.21" % Test
)
