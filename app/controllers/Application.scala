package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Form
import play.api.data.Forms.{mapping, text, optional}
import play.api.data.format.Formats._
//import play.api.libs.functional.syntax._
//import play.api.libs.json._
//import play.api.libs.json.Writes._

object Application extends Controller {
  
  val nameForm = Form(mapping("name" -> optional(text))(Tester.apply)(Tester.unapply) )
//  val formm = Form("name" -> text)
  
  def index = Action {
    Ok(views.html.index())
  }
  
  def chooseFile = Action
  {
    Ok(views.html.viewfiles(nameForm))  
  }
  
  def selectFile = Action
  {    
     Ok(views.html.testpost(Option("no hay grade")))  
  }
  
  def massageFile = Action{      
    implicit request => nameForm.bindFromRequest.value map { testus =>
           Ok(views.html.testpost(testus.name))
    }getOrElse(NotFound("Tester Not Found")): play.api.mvc.Result
  }      
   
  def chooseFileByRadioButtons = Action
  {
    Ok(views.html.radioButtonOption(nameForm))  
  }
  
  def radioButtonSelected = Action
  {
    implicit request => nameForm.bindFromRequest.value map { testus =>
           Ok(views.html.testpost(testus.name))
    }getOrElse(NotFound("Tester Not Found")): play.api.mvc.Result    
  }
  
}