package Basics

enum class color (val rgb :Int)
{
    RED(0xff000),
    GREEN(0x00ff00),
    BLUE(0X0000FF),
    YELLOW(0XFFFF00);
    fun containsRed() = (this.rgb and 0xff000 !=0)



}
fun main()
{
    val red = color.RED
    println(red)
    println(color.RED.ordinal)
    println(red.containsRed())
}
