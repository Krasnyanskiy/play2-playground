package modules

import play.api.{Configuration, Environment}
import play.api.inject.{Binding, Module}
import repository.{YandexTranslateRepository, TranslateRepository, JobRepositoryImpl, JobRepository}

/**
  * @author Alexander Krasniansky
  */
class WiringModule extends Module {

  def bindings(env: Environment, config: Configuration) = Seq(
    bind[JobRepository].to[JobRepositoryImpl],
    bind[TranslateRepository].to[YandexTranslateRepository]
  )

}
