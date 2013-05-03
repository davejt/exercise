package models

import play.api.libs.json._
import play.api.libs.functional.syntax._

case class Exercise( name: String, category: String )

object Exercise {

  // Test data
  val exercises = List(Exercise("bench press", "chest"),
                       Exercise("back squat", "legs"))

  def all(): List[Exercise] = exercises

  implicit val exerciseReads: Reads[Exercise] = (
    (__ \ "name").read[String] and
    (__ \ "category").read[String]
  )(Exercise.apply _)

  implicit val exerciseWrites = Json.writes[Exercise]

  // Json.toJson(Exercise("name", "category"))

}
