package Basics

data class User (var name: String, var id :Int)
fun main()
{
    val user = User(name="himani", id =41)
    val seconduser = User(name="himani",id= 42)
    println(user)
    user.id = 42
    println(seconduser.name)
    println(user == seconduser)
    println(user.hashCode())
    println(seconduser.hashCode())
}