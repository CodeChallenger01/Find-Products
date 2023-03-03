class FindProduct {
  val arr:Array[Int]= Array(1, 2, 3, 4, 5)
  var result= 1

  //method to product the element of array
  def product(){
    for(a<-arr){
      result = result*a
    }
    println("Product of element of Array is :" +result)
  }
}

//Singleton Object
object Main extends App {
  val res=new FindProduct()
  res.product()
}