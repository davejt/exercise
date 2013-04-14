package models

import play.api.libs.json._

case class Exercise(id: Long, name: String, category_ids: List[Int]) {

  // implicit object ExerciseFormat extends Format[Exercise] {
  //   def writes(): JsValue = JsObject(Seq(
  //       "name" -> JsString("test")
  //   ))
  // }
}

object Exercise {

  val exercises = List(Exercise(1, "bench press", List()),
                       Exercise(2, "back squat", List()))

  def all(): Map[String, String] = Map("exercise" -> "name")

}
