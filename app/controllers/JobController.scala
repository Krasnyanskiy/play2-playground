package controllers

import javax.inject.Inject

import play.api.mvc.{Action, Controller}
import repository.JobRepository

/**
  * @author Alexander Krasniansky
  */
class JobController @Inject()(jobRepository: JobRepository) extends Controller {

  def job(jobId: Int) = Action {
    Ok(views.html.job(jobRepository.getJobById(jobId)))
  }

}