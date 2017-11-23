package main

import rules.Rules

object ParseProgram extends Rules{

  def main(args:Array[String]): Unit ={

    println("input:"+args(0))
    println(parseAll(program,args(0)))

  }

}
