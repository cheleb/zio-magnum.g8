// scalafmt: { maxColumn = 120, style = defaultWithAlign }

addSbtPlugin("org.scalameta"  % "sbt-scalafmt"        % "2.5.4")
addSbtPlugin("com.github.sbt" % "sbt-ci-release"      % "1.11.1")
addSbtPlugin("com.eed3si9n"   % "sbt-assembly"        % "2.3.1")
addSbtPlugin("com.github.sbt" % "sbt-native-packager" % "1.11.1")
addSbtPlugin("com.github.sbt" % "sbt-dynver"          % "5.1.1")
addSbtPlugin("com.github.sbt" % "sbt-unidoc"          % "0.6.0")
addSbtPlugin("com.github.sbt" % "sbt-ghpages"         % "0.8.0")

addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8" % "0.17.0")

libraryDependencies += {
  "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
}
