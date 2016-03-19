package repository

import javax.inject.{Singleton, Inject}

import model.Job
import play.api.inject.ApplicationLifecycle

/**
  * @author Alexander Krasniansky
  */
sealed trait JobRepository {
  def getJobById(id: Int): Job
}

//
// fixme:
//        remove 'lifecycle' or use it
//
class JobRepositoryImpl @Inject()(lifecycle: ApplicationLifecycle)
  extends JobRepository {
  def getJobById(id: Int) = Job(id, "Alibaba", "Okay")
}
