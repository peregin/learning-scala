import sbt.Keys.libraryDependencies

scalaVersion := "2.13.4"
val scalazVersion = "7.3.2"

organization := "study"
name := "learning-scala"
developers := List(Developer("peregin", "Levente Fall", "velocorner.com@gmail.com", new URL("http://velocorner.com")))

version := "1.0.0-SNAPSHOT"

javacOptions ++= List("-source", "1.8", "-target", "1.8")
scalacOptions ++= List("-target:jvm-1.8", "-feature", "-deprecation", "-language:implicitConversions", "utf-8")

libraryDependencies += "org.scalaz" %% "scalaz-core" % scalazVersion

