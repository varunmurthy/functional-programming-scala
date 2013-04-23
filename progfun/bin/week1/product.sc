package week1

object product {
  def product(f: Int => Int)(a: Int, b: Int): Int = {
 		if(a > b) 1
 		else f(a) * product(f)(a+1, b )
  }                                               //> product: (f: Int => Int)(a: Int, b: Int)Int
  product(x => x*x)(3,4)                          //> res0: Int = 144
  
  def fact(n: Int) =
  	product(n => n)(1, n)                     //> fact: (n: Int)Int
  	
  fact(4)                                         //> res1: Int = 24
}