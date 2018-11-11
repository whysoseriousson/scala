package com.learn.lectures.part1Basics

object ValuesVariablesTypes extends App {
  val x:Int=45
  val y = 98 // type is inferred automatically
  println(x)
  //x=2
  /*
  * reassignment to val is not possible because vals are immutable .
  * similar to java final variables
  * Compile can infer types
  * */

  val aString : String = "Hello" // String types
  val aboolean : Boolean = false //  Boolean types
  val cChar : Char = 'a' // char declared as string literals
  val aInt : Int = 90 // Integer types
  val aShort:Short = 7867 // Short types
  val aLong :Long = 389424989 //Long types
  val aFlot : Float =90.34f // float types
  val aDouble :Double =90.09 // Double types

  var abc : Int = 4
  /*
  Variables can be reassigned and are like non final variables in java
  The are used to have side effects in functional programming.
  FP involves less of side effects
  * */


}
