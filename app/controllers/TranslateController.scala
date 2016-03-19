package controllers

import javax.inject.Inject

import model.TranslationResult
import play.api.libs.ws.{WSResponse, WS}
import play.api.mvc.{AnyContent, Action, Controller}
import play.inject.ApplicationLifecycle
import repository.TranslateRepository

import scala.concurrent.Future
import scala.util.{Success, Failure}

import scala.concurrent.ExecutionContext.Implicits.global
import play.api.Play.current

/**
  * @author Alexander Krasniansky
  */
class TranslateController @Inject()(translateRepo: TranslateRepository)
  extends Controller {

  def translate(phrase: String) = Action async {
    translateRepo translate phrase map {
      result => Ok(views.html.translate(result))
    }
  }

}
