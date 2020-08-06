val myName = "Elvucis" //string is implicit
println(myName)
myName.length
myName(0)
myName(1)
5 > 2*2
res2 > res3
"E" > "l"
"V" > "L"
"L".getClass
'L'.getClass
'l'.toInt
'E'.toInt
'ā'.toInt
'č'.toInt
'a'.toInt
'A'.toInt
'Ā'.toInt
val c = 'ā'
println(c)
myName.take(3)
val first3 = myName.take(3)
println(first3)
val last3 = myName.drop(3)
last3
val myFood = "potatoes"
myFood.slice(3,7) // notice that index 7 is not included
myFood(7)
//first real chaining example
myFood.toUpperCase.take(6).slice(1,4)
myFood.toUpperCase.slice(1,4)

//equality
4 == 2*2
val a = 4
a == 4
a == 20

myFood == "pasta"
myFood == "potatoes"

val myOtherFood = "potatoes"

myFood == myOtherFood

//building a string from other strings
//string interpolation makes it easy to build strings from other strings
println(s"My name is $myName and I like $myFood")

// bez s priekšā nestrādās
val myNumber = 77
val myPI = 3.14159
println(s"My name is $myName and I like $myFood since $myNumber.")

println(s"My pie is tasty and is round $myPI")

myFood.foreach(println) // really concise way of doing domethg to each character

myFood.toUpperCase.foreach(println)

val otherFood = "potata"

myFood intersect otherFood
myFood diff otherFood
myFood.distinct // all unique

res36+res37
// below makes it easier no to miss any whitespace
s"$res36   *  $res37"
s"$res36$res37"

myFood.count(_ == 'o')

val myMagic = "abrakadabra"
myMagic.count(_ =='a')

myMagic.replace("abra", "oxxo")
myMagic.indexOf('b')

myMagic.indexOf("aka")
