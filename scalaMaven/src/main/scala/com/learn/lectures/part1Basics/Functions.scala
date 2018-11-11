package com.learn.lectures.part1Basics

object Functions extends App {
  def aFunction(a: String , b: Int) : String = a + " " + b

  println(aFunction("helllo", 3))
  var aFunc =aFunction _
  println(aFunc("asdsad",23))

  def aParameterLessFunction() = 34

  println(aParameterLessFunction())

  println(aParameterLessFunction)

  def aRepeatedFunction(inputString:String,no:Int) : String ={
    if(no==1) inputString
    else inputString + aRepeatedFunction(inputString,no-1)
  }

  println(aRepeatedFunction("hello",3))
}
