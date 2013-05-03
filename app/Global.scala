import play.api._

import models._

object Global extends GlobalSettings {

  override def onStart(app: Application) {
    SeedData.load()
  }
}

object SeedData {

  def load () = println("Loading the data")

}

