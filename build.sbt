name := "jafama"

version := "2.1-SNAPSHOT"

scalaVersion := "3.0.2"

scalacOptions ++= Seq(
  "-rewrite",
  "-source:3.0-migration")


libraryDependencies += "junit" % "junit" % "4.12" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
