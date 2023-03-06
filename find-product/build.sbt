ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "Test"
libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.15" % "test"

lazy val root = (project in file("."))
  .settings(
    name := "find-product"
  )
