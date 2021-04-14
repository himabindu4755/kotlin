class `WhenThen` {

}
fun main()
{
    println(describe( 1))
    println(describe("hello"))
    println(describe("himani"))

}
 fun describe(ob : Any): String {
     return when(ob)
     {
         1 -> "one"
         "hello" -> "saying hello"
         "how r u" ->"iam 5n u"
         "something " ->"unknown"


         else -> "bye"
     }
 }