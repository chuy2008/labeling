package controllers

object wksht1
{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(113); 
   val listOfFiles = Array("filee1", "filee2", "filee3", "filee4", "filee5");System.out.println("""listOfFiles  : Array[String] = """ + $show(listOfFiles ));$skip(102); 
                                                  
   val vv = for (ii <- listOfFiles) yield ii -> ii;System.out.println("""vv  : Array[(String, String)] = """ + $show(vv ));$skip(11); val res$0 = 
 
   vv(1);System.out.println("""res0: (String, String) = """ + $show(res$0));$skip(253); 
   


   val ww = (listOfFiles(0) -> listOfFiles(0),
         	   listOfFiles(1) -> listOfFiles(1),
         	   listOfFiles(2) -> listOfFiles(2),
         	   listOfFiles(3) -> listOfFiles(3),
         	   listOfFiles(4) -> listOfFiles(4)
           );System.out.println("""ww  : ((String, String), (String, String), (String, String), (String, String), (String, String)) = """ + $show(ww ));$skip(27); 

   val iii = (5, 6, 7, 8);System.out.println("""iii  : (Int, Int, Int, Int) = """ + $show(iii ));$skip(7); val res$1 = 
   iii;System.out.println("""res1: (Int, Int, Int, Int) = """ + $show(res$1));$skip(127); 
                                                  
   
   val xs = Map("a" -> List(11,111), "b" -> List(22,222)).flatMap(_._2);System.out.println("""xs  : scala.collection.immutable.Iterable[Int] = """ + $show(xs ));$skip(97); 
   

   val ys = Map("a" -> List(1 -> 11,1 -> 111), "b" -> List(2 -> 22,2 -> 222)).flatMap(_._2);System.out.println("""ys  : scala.collection.immutable.Map[Int,Int] = """ + $show(ys ));$skip(6); val res$2 = 
   ys;System.out.println("""res2: scala.collection.immutable.Map[Int,Int] = """ + $show(res$2))}
   
   


}
