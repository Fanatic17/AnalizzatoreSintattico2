package Translate

import GUI.Gui
import main.ParseProgram.{parseAll, program}

import scala.collection.mutable.ListBuffer

class traduce extends App {

  def onTranslateTree(input: String): Unit = {

    //Strutture di appoggio per salvare i dati.
    var stringaRitorno = new ListBuffer[String]()
    var appoggio= ""
    val valori: List[Number]=List()
    var ident_pos_help: Int=0;
    var ident_position = 0
    val somestring=String.valueOf(input)
    val newstring=somestring.slice(15,somestring.length);
    val index=newstring.indexOf("{")
    val index2=newstring.indexOf("parsed:")


    //Inizio programma
    if(index>=0 && index2>=0) {
      /*println("\n"+ "Inizio programma con"+index)*/
      val array=newstring.split("Some");
      //For loop per ogni elemento dello split
      for(x <- array) {
        println("\n"+x)
        appoggio=""
        //Controllo sulla dichiarazione.
        if(x.contains("i, n, t,")) {
          //Controllo sulla posizione iniziale dell'identificatore.
          var index_int=x.indexOf("i, n, t")
          var index_let=x.indexOf("a")
          println("Index:" +index_int)
          ident_position=index_int+9;
          println("ID: "+ident_position+" /LETT_ID: "+x.charAt(ident_position));
          println("elemento succ: "+x.charAt(ident_position+1))
          //Se è singolo ho )
          //Se è composto ho ,
          if(x.charAt(ident_position+1)==')') {
            //Identificatore semplice 1 lettera
            println("ID ad 1 Lettera")
            println("IDENTIFICATORE: " +x.charAt(ident_position))
            stringaRitorno+=(x.charAt(ident_position).toString)
            var num=x.charAt(ident_position+7)
            println("valore: "+num)
            //Salva il numero/////////////////////////////////////////////////////////////////
          }
          else{
            //Identificatore composto
            println("ID Composite")
            ident_pos_help=ident_position+3
            while(x.charAt(ident_pos_help)!=')') {
              println(ident_pos_help+":"+ x.charAt(ident_pos_help))
              appoggio=appoggio+x.charAt(ident_pos_help)
              ident_pos_help=ident_pos_help+1;
            }
            //Checking
            require(appoggio.length>0)
            //Aggiungo l'identificatore composto
            println("IDENTIFICATORE COMP: " + x.charAt(ident_position)+appoggio)
            stringaRitorno+=((x.charAt(ident_position)+appoggio).toString)
            var s=x.charAt(ident_pos_help+6)
            println("valore: "+s)
            //Got the number;
            //Salva il valore//////////////////////////////////////////////////////////////////////////////
          }


        }
      }



    }else println("ERROR, something didn't go well!")
  }
}
