package repository

import javax.inject.Inject

import model.TranslationResult
import play.Play
import play.api.Configuration
import play.api.libs.json.Json
import play.api.libs.json.Json.{arr, obj}
import play.api.libs.ws.{WS, WSResponse}

import scala.concurrent.Future
import scala.util.{Failure, Success}

import scala.concurrent.ExecutionContext.Implicits.global
import play.api.Play.current

/**
  * @author Alexander Krasniansky
  */
sealed trait TranslateRepository {
  //
  // todo
  //      change Seq[String] to TranslationResult
  //      and fix serialization errors
  //
  def translate(phrase: String): Future[Seq[String]]
}

class YandexTranslateRepository extends TranslateRepository {

  def translate(searchPhrase: String): Future[Seq[String]] = {
    //
    // todo
    //      find out another way to set url in properties
    //      (with interpolation?)
    //
    val url =
      s"https://translate.yandex.net/api/v1.5/tr.json/translate?" +
        s"key=${prop("yandex.translate.key")}&" +
        s"format=${prop("yandex.translate.format")}&" +
        s"lang=${prop("yandex.translate.destLang")}&" +
        s"text=$searchPhrase"

    WS.url(url).withFollowRedirects(true).get().map {
      resp => (resp.json \ "text").as[Seq[String]]
    }
  }

}


