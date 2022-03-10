fun main(){
 name()

 var reminder=modulus(23,7)
 println(reminder)

 var show=statement("lavyne",23)
 println(show)
var everycharacter=count("kenya")
 println(everycharacter)

}

 fun name(){
  var word="codeHive"
  println(word[4].toString()+word[5]+word[6]+word[7])
 }

fun modulus(x:Int,y:Int):Int{
 var result=x % y
 return result
}
fun statement(p:String,z:Int):String{
 var say="Hi, my name is $p and I am $z years old."
         return say

}
fun count(name:String):Int{
 var z=name.length
 return z

}
