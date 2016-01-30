package controllers

import play.api.mvc.{Action, Controller}

/**
  * @author Alexander Krasniansky
  */
object MainController extends Controller {

  def index = Action {
    Ok(views.html.index("Yo!", (42, "Success")))
  }

}
