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
  val listOfFiles = Array("filee1", "filee2", "filee3", "filee4", "filee5")
  val stringForm = Form("filee" -> optional(text))
  
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
    Ok(views.html.radioButtonOption(nameForm, listOfFiles))  
  }
  
  def chooseFileByRadioButtonss = Action
  {
    Ok(views.html.radioButtonOptionn(nameForm, listOfFiles))  
  }  
  
  def radioButtonSelected = Action
  {
    implicit request => nameForm.bindFromRequest.value map { testus =>
           Ok(views.html.testpost(testus.name))
    }getOrElse(NotFound("Tester Not Found")): play.api.mvc.Result    
  }

/*  
  def radioButtonSelectedd = Action
  {
    implicit request => request.body.asFormUrlEncoded map {tt => 
      Ok("Got: " + tt("group1").head)
//      Ok(views.html.showw(tt))  
    }getOrElse(NotFound("Tester Not Found")): play.api.mvc.Result
  }
 *
 *  
 */  
  
  def ooo = 
  {
    println("llll")
  } 
  
  def radioButtonSelectedd = Action
  {
    implicit request => request.body.asFormUrlEncoded map { tt =>
      Ok(views.html.showw(tt("group1").head))    
    }getOrElse(NotFound("Tester Not Found")): play.api.mvc.Result
  }
      
      
//      val maybeFoo = request.body.asText // returns an Option[String]
//       Ok(views.html.testpost(maybeFoo) getOrElse 0
//  }
      
//      stringForm.bindFromRequest.value map { testus =>
//           Ok(views.html.testpost(testus))
//    }getOrElse(NotFound("Tester Not Found")): play.api.mvc.Result    
//  }

  
}