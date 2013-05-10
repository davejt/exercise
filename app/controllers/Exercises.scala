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

  def category(cat: String) = {
    val result = Json.toJson(Exercise.searchByCategory(cat))
    Ok(result).as(json)
  }
}
