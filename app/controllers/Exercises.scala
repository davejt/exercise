package controllers

import play.api._
import play.api.mvc._

import play.api.libs.json.Json

import models.Exercise

object Exercises extends Controller {

  def index() = Action {

    val json = Json.toJson(Exercise.all)
    Ok(json).as("application/json")
  }
}
