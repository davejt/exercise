package controllers

import play.api._
import play.api.mvc._

import play.api.libs.json.Json

object Application extends Controller {

  private val json = Map("exercises" -> "/exercises")

  def index = Action {
    Ok(Json.toJson(json))
  }
}
