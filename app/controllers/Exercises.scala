package controllers

import play.api._
import play.api.mvc._

import play.api.libs.json.Json

import models.Exercise

object Exercises extends Controller {

  val json = "application/json"

  def index() = Action {
    val result = Json.toJson(Exercise.all)
    Ok(result).as(json)
  }

  /** Search by category */
  def category(cat: String) = Action {
    val result: Option[List[Exercise]] = Exercise.searchByCategory(cat)
    result match {
      case None    => NotFound("Not found").as(json)
      case Some(v) => Ok(Json.toJson(v)).as(json)
    }
  }

  def startsWith(letter: String) = Action {
    val result = Exercise.nameStartsWith(letter)
    result match {
      case None    => NotFound("Not found").as(json)
      case Some(v) => Ok(Json.toJson(v)).as(json)
    }
  }
}
