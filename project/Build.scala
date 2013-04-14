import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "exercise"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "org.scalatest" % "scalatest_2.10.0-M7" % "2.0.M4-2.10.0-M7-B1" % "test"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here
    )

}
