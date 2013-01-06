import sbt.Defaults._

sbtPlugin := true

name := "playdown"

version := "1.0-SNAPSHOT"

organization := "com.ketalo"

 libraryDependencies <++= (scalaVersion, sbtVersion) { 
   case (scalaVersion, sbtVersion) => Seq(
    sbtPluginExtra("play" % "sbt-plugin" % "2.1-09092012" % "provided", "0.12", scalaVersion)
   )
}