name := """play-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.twitter4j" % "twitter4j-core" % "4.0.4" withSources() withJavadoc(),
  "org.twitter4j" % "twitter4j-async" % "4.0.4" withSources() withJavadoc(),
  "org.twitter4j" % "twitter4j-stream" % "4.0.4" withSources() withJavadoc(),
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.0-RC1" % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
