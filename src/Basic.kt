class Basic {
}
fun main(){
    var a = 1
    var name ="himni $a is himani present"
    var age =21
    //var sentence = "${name.replace("himani","bindu")}"
    //println(name)

    //fun maxofnum(a: Int , b : Int) :Int{

        //if( a> b) return a
      //  else return b;
    //}
    //println(maxofnum(10,30))
    val items = listOf("himani","harshi","div","chandu")
    for ( item in items)
    {
        println(item)
    }
    //for(index in items.indices)
    {
    //    println("item at $index is ${items[index]}")
    }
     var index = 0
    while(index < items.size)
    {
        println("${items[index]} is at $index")
        index++
    }
    for(x in 100 downTo 0 step 20)
    {
        println(x)
    }
   when{
       "himani" in items -> println("she is frome ece")
       "geetha" in items -> println("she is from cse")
   }

}