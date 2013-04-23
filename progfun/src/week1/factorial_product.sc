package week1

object factorial_product {
  def sum_product(f: Int => Int, p: Boolean)(a: Int, b: Int): Int = {
 		if(a > b) lowest(p)
 		else f(a) * sum_product(f, p)(a+1, b)
 		
 		def lowest(p: Boolean): Int =
 			if(p) 0 else 1
  }
  sum_product(x => x*x, false)(3,4)
  
  def fact(n: Int) =
  	sum_product(n => n, false)(1, n)
  	
  fact(4)
}