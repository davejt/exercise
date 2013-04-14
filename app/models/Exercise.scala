package models

import play.api.libs.json._

case class Exercise(id: Long, name: String) {

  implicit object ExerciseFormat extends Format[Exercise] {

    def reads(json: JsValue) = Exercise(
      (json \ "id").as[Long],
      (json \ "name").as[String]
    )

    def writes(exercise: Exercise) = JsObject(Seq(
      "id" -> JsNumber(exercise.id),
      "name" -> JsString(exercise.name)
    ))
  }
}

object Exercise {

  // Test data
  val exercises = List(Exercise(1, "bench press"),
                       Exercise(2, "back squat"))

  def all(): List[Exercise] = exercises

}
