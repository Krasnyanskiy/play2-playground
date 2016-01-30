package modules

import play.api.{Configuration, Environment}
import play.api.inject.{Binding, Module}
import repository.{JobRepositoryImpl, JobRepository}

/**
  * @author Alexander Krasniansky
  */
class WiringModule extends Module {
  def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = {
    Seq(bind[JobRepository].to[JobRepositoryImpl])
  }
}
