package com.learn.lectures.part1Basics

object Expressions extends App {
  val x = 1+2 // expressions which is getting evaluated and compiler deduces its type
  println(x)
  // Math operations + - * / & | >> <<
  println(x==8)// expressions evaluated to true and false
  // == != >= <=
  println(!(1==5))

  var avariable = 3
  avariable+=4
  println(avariable)
  // instructions /// tell compute to do something as we do in imperative language
  // expressions (in FP we use expressions )

  val aCondition = true
  val aConditionValue = if(aCondition) 3 else 5
  println(aConditionValue)

  // If is an expression in scala unlike statements in imperative programming ...

  var i =0
  var aWhile =while (i<10){
    println(i)
    i+=1
  } // Scala also supports looping like imperative programming
  //Side effects are expressions in scala which returns unit

  val aCodeBlock = {
    var abc =2
    var xyz = "asdas"
    true
  } // the type of the block is the type returned by its last expression
    // values appearing in the block are not visible outside the block.
}

