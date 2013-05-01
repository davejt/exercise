package models

import play.api.libs.json._

case class Exercise( name: String, category: String )

object Exercise {

  // Test data
  val exercises = List(Exercise("bench press", "chest"),
                       Exercise("back squat", "legs"))

  def all(): List[Exercise] = exercises

  implicit object ExerciseFormat extends Format[Exercise] {

    def reads(json: JsValue) = Exercise(
      (json \ "name").as[String],
      (json \ "category").as[String]
    )

    def writes(exercise: Exercise) = JsObject(Seq(
      "name" -> JsString(exercise.name),
      "category" -> JsString(exercise.category)
    ))
  }

}
