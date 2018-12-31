package LangCode;

public class KotlinCode {
    public static String variables(){
        return "Kotlin Variables" +
                "```kotlin\n" +
                "var or val variableName: variableType = variableValue // var being a variable and val being a constant(a variable that cannot change)\n\n" +
                "Examples:\n" +
                "var age : Int = 18\n" +
                "val birthYear : Int = 2000\n" +
                "//the other traditional java way is also accepted\n" +
                "var or val varName = value\n\n" +
                "Example:\n" +
                "var country = \"Mexico\"\n" +
                "val name = \"Ben\"\n" +
                "Types:\n" +
                "Int ➜ integer (whole number, positive or negative)\n" +
                "Double ➜ number with decimals (positive or negative)\n" +
                "Bool ➜ true or false\n" +
                "String ➜ a word or phrase, surrounded by \"\"\n" +
                "```";
    }
    public static String operators(){
        return "Kotlin operators" +
                "```kotlin\n" +
                "+ ➜ Addition, returns addition. \"++\" increases value by 1\n" +
                "- ➜ Subtraction, returns subtraction. \"--\" decreases value by 1\n" +
                "/ ➜ Division, returns division\n" +
                "* ➜ Multiplication,returns product of multiplication of numbers or variables\n" +
                "** ➜ Exponent, returns number before it to the power of number after it\n" +
                "% ➜ Modulo, divides and returns the remainder\n" +
                "< ➜ less than, checks if the value before it is smaller than the one after it. Returns boolean\n" +
                "> ➜ greater than, checks if value before it is greater than the one after it. Returns boolean\n" +
                "!= ➜ \"!\" means NOT, checks if the value or variable before it is NOT equal to the one after it. Returns boolean\n" +
                "== ➜ checks if value or variable before it is equal to the one on the right. Returns boolean\n" +
                "=== ➜ checks for equal value AND equal type. Returns boolean\n" +
                "!== ➜ checks for not equal value OR not equal type\n" +
                ">= ➜ checks is value or variable before it is EQUAL TO  or GREATER THAN the one after it. Returns boolean\n" +
                "<= ➜ checks is value or variable before it is EQUAL TO  or LESS THAN the one after it. Returns boolean\n" +
                "&& ➜ means \"AND\"\n" +
                "|| ➜ means \"OR\"\n" +
                ".. ➜ creates a range ➜➜ for(i in 1..10)//equivalent of 1 <= i && i <= 10" +
                "```";
    }
    public static String ifStatements(){
        return "Kotlin if-statements" +
                "```kotlin\n" +
                "if(boolean statement){\n" +
                "   //what to do if boolean is true\n" +
                "}else if(boolean statement){\n" +
                "   //what to do if first boolean is false and this one is true\n" +
                "}else{\n" +
                "   //what to do when all other booleans are false\n" +
                "}\n\n" +
                "Example:\n" +
                "var a : Int = 5\n" +
                "if(a > 0){\n" +
                "   println(\"a is greater than 0\")//this will println because 5 is greater than 0\n" +
                "}else if(a < 0){\n" +
                "   println(\"a is smaller than 0\")\n" +
                "}else{\n" +
                "   println(\"a is not valid\")\n" +
                "}\n" +
                "```";
    }
    public static String whenStatements(){
        return "Kotlin when-statements" +
                "```kotlin\n" +
                "//when statements in kotlin are the equivalent of switch statements on other languages\n" +
                "when(variableToCheck){\n" +
                "   someValue1 -> println(\"what happens when variableToCheck has this value\")\n\n" +
                "   someValue2 -> println(\"what happens when variableToCheck has this value\")\n\n" +
                "   someValue3 -> println(\"what happens when variableToCheck has this value\")\n\n" +
                "   //when statements can also have else statements in them, the condition can also be ranges, there can be multiple conditions for one block, etc." +
                "}\n\n" +
                "Example:\n\n" +
                "var x = 3\n" +
                "when(x){\n" +
                "   1 -> println(\"value of x is 1\")\n" +
                "   2 -> println(\"value of x is 2\")\n" +
                "   3 -> println(\"value of x is 3\")\n" +
                "   in 4..10 -> println(\"value of x is in between 4 and 10\")\n" +
                "   else -> println(\"value of x is none of these numbers\")\n" +
                "}\n" +
                "//obviously, when statements don't only have to have println statements, you can also do operations and lots of other things\n" +
                "```\n" +
                "More on when statements: https://superkotlin.com/kotlin-when-statement/";
    }
    public static String loops(){
        return "Kotlin loops" +
                "```kotlin\n" +
                "for (item in collection) {\n" +
                "    // body of loop\n" +
                "}\n" +
                "//the collection in a for loop can also be a range i.e. 1..10\n\n" +
                "Example:\n" +
                "for(i in 0..10){\n" +
                "   println(i)//will println every number from 0 to 10\n" +
                "}\n\n" +
                "var languages  = arrayOf(\"Ruby\", \"Koltin\", \"Python\", \"Java\")\n" +
                "for (language in languages.indices){//the .indices refers to all the elements in the \"languages\" array\n" +
                "   println(language)//will print all languages is the \"languages\" array\n" +
                "}\n\n" +
                "while (booleanExpression) {\n" +
                "    // codes inside body of while loop\n" +
                "}\n\n" +
                "Example:\n" +
                "var i = 1\n" +
                "while(i < 10){\n" +
                "   println(i)//will print from 1 to 10\n" +
                "   i++\n" +
                "}\n" +
                "```";
    }
    public static String functions(){
        return "Functions:\n" +
                "```kotlin\n" +
                "fun functionName(arguments) : returnType {//you have to specify the type of the arguments, argumentName : type\n" +
                "   //function body\n" +
                "   return something\n" +
                "}\n\n" +
                "//another way to make a function if your function is very short:\n" +
                "fun functionName(arguments) : Int = //do something with arguments\n\n" +
                "//if function returns nothing, put \"Unit\" instead of void, or nothing at all\n\n" +
                "Examples:\n" +
                "fun sayHello(name : String) : String {\n" +
                "   println(\"Hello \" + name)\n" +
                "}\n" +
                "fun add(a : Int, b : Int) : Int = a + b\n\n" +
                "//Calling the functions:\n" +
                "println(sayHello(\"Ben\"))//will print \"Hello Ben\"\n" +
                "println(add(5, 7))//5 takes place of a, 7 takes place of b, so it prints 12\n\n" +
                "//calling them and making them goes inside the main function" +
                "```";
    }
    public static String objects(){
        return "Classes and Objects:\n" +
                "```kotlin\n" +
                "//defining a class:\n" +
                "class ClassName{\n" +
                "   var characteristic1 = value\n" +
                "}\n" +
                "//making an object of this class:\n" +
                "var objectName = ClassName()//this goes wherever you want to make a new object from thi class\n" +
                "//we can now access characteristic1:\n" +
                "objectName.characteristic1\n\n" +
                "//if you're going to have multiple objects with the same characteristics, make a class with a constructor:\n" +
                "class ClassName(characteristic1: type, characteristic2: type){\n" +
                "   var char1 = characteristic1\n" +
                "   var char2 = characteristic2\n" +
                "   fun printChar () : Unit{ //returns nothing\n" +
                "       println(\"char1\")\n" +
                "   }\n" +
                "}\n\n" +
                "//making an object with constructor:\n" +
                "var obj = ClassName(value1, value2)\n\n" +
                "Examples:\n" +
                "class Ben{\n" +
                "   var name = \"Ben\"\n" +
                "   var age = 18\n" +
                "}\n" +
                "var ben = Ben()\n" +
                "println(ben.name)//will print Ben because thats the value of the name variable\n\n" +
                "class Person(name : String, age : Int){\n" +
                "   var name = name\n" +
                "   var age = age\n" +
                "   fun info() { //also returns nothing\n" +
                "       println(\"name is \" + name + \", age is \" + age)\n" +
                "   }\n" +
                "}\n\n" +
                "//Making a new Person object:\n" +
                "var ben = Person(\"Ben\", 18)\n" +
                "ben.info()//will print \"name is Ben, age is  18\"\n" +
                "```";
    }
}