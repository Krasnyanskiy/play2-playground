import play.Play
import play.Play.application

/**
  * @author Alexander Krasniansky
  */
package object repository {

  def prop(key: String) = application().configuration().getString(key)

}
