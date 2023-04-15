val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "ls",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.13" % Test
  )
