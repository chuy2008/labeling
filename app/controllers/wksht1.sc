package controllers

object wksht1
{
   val listOfFiles = Array("filee1", "filee2", "filee3", "filee4", "filee5")
                                                  //> listOfFiles  : Array[String] = Array(filee1, filee2, filee3, filee4, filee5)
                                                  //| 
                                                  
   val vv = for (ii <- listOfFiles) yield ii -> ii//> vv  : Array[(String, String)] = Array((filee1,filee1), (filee2,filee2), (fil
                                                  //| ee3,filee3), (filee4,filee4), (filee5,filee5))
 
   vv(1)                                          //> res0: (String, String) = (filee2,filee2)
   


   val ww = (listOfFiles(0) -> listOfFiles(0),
         	   listOfFiles(1) -> listOfFiles(1),
         	   listOfFiles(2) -> listOfFiles(2),
         	   listOfFiles(3) -> listOfFiles(3),
         	   listOfFiles(4) -> listOfFiles(4)
           )                                      //> ww  : ((String, String), (String, String), (String, String), (String, String
                                                  //| ), (String, String)) = ((filee1,filee1),(filee2,filee2),(filee3,filee3),(fil
                                                  //| ee4,filee4),(filee5,filee5))

   val iii = (5, 6, 7, 8)                         //> iii  : (Int, Int, Int, Int) = (5,6,7,8)
   iii                                            //> res1: (Int, Int, Int, Int) = (5,6,7,8)
                                                  
   
   val xs = Map("a" -> List(11,111), "b" -> List(22,222)).flatMap(_._2)
                                                  //> xs  : scala.collection.immutable.Iterable[Int] = List(11, 111, 22, 222)
   

   val ys = Map("a" -> List(1 -> 11,1 -> 111), "b" -> List(2 -> 22,2 -> 222)).flatMap(_._2)
                                                  //> ys  : scala.collection.immutable.Map[Int,Int] = Map(1 -> 111, 2 -> 222)
   ys                                             //> res2: scala.collection.immutable.Map[Int,Int] = Map(1 -> 111, 2 -> 222)
   
   


}