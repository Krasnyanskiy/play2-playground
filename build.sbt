name := "play2-playground"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.5"

javacOptions ++= Seq("-source", "1.8")

libraryDependencies ++= Seq(
  //
  // misc
  //
  "junit" % "junit" % "4.11" excludeAll ExclusionRule(organization = "junit"),
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  ws,
//
  // db
  //
  "com.h2database" % "h2" % "1.3.166",
  "com.typesafe.slick" %% "slick" % "1.0.0",
  //
  // js
  //
  "org.webjars" %% "webjars-play" % "2.4.0",
  "org.webjars" % "bootstrap" % "3.3.4",
  "org.webjars" % "jquery" % "2.2.0",
  "org.webjars" % "underscorejs" % "1.6.0-3"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)