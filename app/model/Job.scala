package model

import model.JobStatus.JobStatus

/**
  * @author Alexander Krasniansky
  */
case class Job(id: Int, status: JobStatus, data: Seq[String])

object JobStatus extends Enumeration {
  type JobStatus = Value
  val OK, FAILED, RUNNING, STOPPED = Value
}

