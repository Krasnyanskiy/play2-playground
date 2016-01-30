package repository

import javax.inject.{Singleton, Inject}

import model.{JobStatus, Job}
import play.api.inject.ApplicationLifecycle

/**
  * @author Alexander Krasniansky
  */
sealed trait JobRepository {
  def getJobById(jobId: Int): Job
}

class JobRepositoryImpl @Inject()(lifecycle: ApplicationLifecycle) extends JobRepository {
  def getJobById(jobId: Int) =
    Job(jobId, JobStatus.OK, Seq("The", "status", "is", "Okay"))
}
