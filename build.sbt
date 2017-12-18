name := "jafama"

version := "2.1-SNAPSHOT"

scalaVersion := "2.12.4"

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature",
  "-Xfatal-warnings")


libraryDependencies += "junit" % "junit" % "4.12" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
