package global

import play.api._

import scala.io.Source._

import models._

object Global extends GlobalSettings {

  val exercises = SeedData.exerciseModels

  override def onStart(app: Application) {

  }
}

object SeedData {

  val data = "data/exercises"

  // Loads all the exercises from data
  def loadExercises (): List[String]  = fromFile(data).getLines.toList

  def exerciseModels(): List[Exercise] = {
    val exercises = loadExercises()
    exercises.map { exercise =>
      val parts = exercise.split(",").map(_.trim)
      Exercise(parts.head, parts.last)
    }
  }

}

