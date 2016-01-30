name := "play2-playground"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" excludeAll ExclusionRule(organization = "junit")
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)