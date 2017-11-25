package main

import javafx.stage.Stage

import GUI.Gui
import rules.Rules

object ParseProgram extends Rules{

  def main(args:Array[String]): Unit ={

    val gui = new Gui()
    println("input:"+args(0))
    gui.printGUI(parseAll(program,args(0)).toString)

    //Fare un metodo che prende in ingresso  parseAll(program,args(0)) e stampa l'interfaccia grafica

  }

}


