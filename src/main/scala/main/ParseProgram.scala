package main

import javafx.stage.Stage

import GUI.Gui
import Translate.traduce
import rules.Rules

import scala.collection.mutable.ListBuffer

object ParseProgram extends Rules{
  def main(args:Array[String]): Unit ={

    val gui = new Gui()
    println("input:"+args(0))
    var s=gui.printGUI(parseAll(program,args(0)).toString)
    val traduttore=new traduce()
    traduttore.onTranslateTree(s)


  }

}


