resolvers in ThisBuild += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"
resolvers in ThisBuild += "Typesafe Simple Repository" at "https://repo.typesafe.com/typesafe/simple/maven-releases/"

// to generate dependency graph of the libraries
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.10.0-RC1")

// check latest updates form maven
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.4.3")

// scala formatter
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.2")

