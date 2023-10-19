val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "$name$",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
    libraryDependencies += "org.typelevel" %% "cats-effect" % "3.5.2",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
