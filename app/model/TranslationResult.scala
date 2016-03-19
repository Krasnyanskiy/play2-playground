package model

/**
  * @author Alexander Krasniansky
  */
case class TranslationResult(
  lang: String,
  text: Seq[String],
  code: Int
)

