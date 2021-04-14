package Basics


class Nullable {

}
fun main()
{
    val name : String = "hi there"
    val s2 :String ? = "this string may be null or not"
    val num : Int = 27
    var author = setOf<String>("author1","author2")
    var writer = setOf<String>("author1","author2")

    println(author == writer)// it will compare elements irrespective of order
    println(author === writer)// it will not compare elements but compare references(address)
    var authors = listOf<String>("author1","author2")
    var writers = listOf<String>("author1","author2")
    println(authors == writers)

   //s2?.length//here the complier gets confused to accept it as nullable or not
    //name.length
    println(name.length)
    println(s2?.length)
    println(s2!!.length)

}