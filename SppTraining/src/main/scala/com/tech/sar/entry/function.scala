package com.tech.sar.entry

object function {
    def add(a:Int=14,b:Int=15):Int={
    return a+b
    
  }
  def sub(x:Int,y:Int):Int={
    return x-y
    
  }
  
    def main(args:Array[String]):Unit={
    val add1 = (z:Int,t:Int) => z+t
    println(add1(10,20))
    println(add(10))
    println(sub(20,10))
    println(add(36,89))
    
  }
  
}