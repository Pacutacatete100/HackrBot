package LangCode;

public class GoCode {
    public static String variables(){
        return "Go variables:\n" +
                "```go\n" +
                "var varName = value//for variables\n" +
                "const constName = value//for constants\n" +
                "varName := value//quick way\n\n" +
                "Example:\n\n" +
                "var age = 18\n" +
                "const name = \"Ben\"\n" +
                "job := \"Engineer\"" +
                "```";
    }
    public static String operators(){
        return "Go operators:\n" +
                "```go\n" +
                "+ ➜ Addition, returns addition. \"++\" increases value by 1\n" +
                "- ➜ Subtraction, returns subtraction. \"--\" decreases value by 1\n" +
                "/ ➜ Division, returns division\n" +
                "* ➜ Multiplication,returns product of multiplication of numbers or variables\n" +
                "% ➜ Modulo, divides and returns the remainder\n" +
                "< ➜ less than, checks if the value before it is smaller than the one after it. Returns boolean\n" +
                "> ➜ greater than, checks if value before it is greater than the one after it. Returns boolean\n" +
                "!= ➜ \"!\" means NOT, checks if the value or variable before it is NOT equal to the one after it. Returns boolean\n" +
                "== ➜ checks if value or variable before it is equal to the one on the right. Returns boolean\n" +
                ">= ➜ checks is value or variable before it is EQUAL TO  or GREATER THAN the one after it. Returns boolean\n" +
                "<= ➜ checks is value or variable before it is EQUAL TO  or LESS THAN the one after it. Returns boolean\n" +
                "&& ➜ means \"AND\"\n" +
                "|| ➜ means \"OR\"\n\n" +
                "Examples:\n\n" +
                "int x = 4\n" +
                "x += 3; // adds 3 to the value of x\n" +
                "x *= 4; // multiplies the value of x by 4\n" +
                "int z = x + 5;//value of z will be 12 because 4 (x) + 5 = 12\n" +
                "boolean checker = x > 7 //value will be false because 4 (x) is not greater than 7\n" +
                "```";
    }
    public static String ifStatements(){
        return "Go if statements:\n" +
                "```go\n" +
                "if(boolean_expression 1) {\n" +
                "   /* Executes when the boolean expression 1 is true */\n" +
                "} else if( boolean_expression 2) {\n" +
                "   /* Executes when the boolean expression 2 is true */\n" +
                "} else if( boolean_expression 3) {\n" +
                "   /* Executes when the boolean expression 3 is true */\n" +
                "} else {\n" +
                "   /* executes when the none of the above condition is true */\n" +
                "}\n\n" +
                "Example:\n\n" +
                "if( a == 10 ) {\n" +
                "   /* if a is 10 then print the following */\n" +
                "   fmt.Println(\"Value of a is 10\")\n" +
                "} else if( a == 20 ) {\n" +
                "   /* if a is 20 */\n" +
                "   fmt.Printline(\"Value of a is 20\")\n" +
                "} else if( a == 30 ) {\n" +
                "   /* if a is 30  */\n" +
                "   fmt.Println(\"Value of a is 30\")\n" +
                "} else {\n" +
                "   /* if none of the conditions is true */\n" +
                "   fmt.Println(\"None of the values is matching\")\n" +
                "}\n" +
                "fmt.Println(\"Exact value of a is: \" + a)\n" +
                "```";
    }
    public static String switchStatements(){
        return "Go switch statement:\n" +
                "```go\n" +
                "switch variable{\n" +
                "   case variableValue1 :\n" +
                "      //what to do if value of variable meets this value\n" +
                "   case variableValue2 :\n" +
                "      //what to do if value of variable meets this value\n" +
                "   \n" +
                "   //you can have any number of case statements \n\n" +
                "   default : //Optional \n" +
                "      //what to do if variable value meets no other case\n" +
                "}\n\n" +
                "Example:\n\n" +
                "var grade = \"B\"\n" +
                "switch grade {\n" +
                "   case \"A\":\n" +
                "       fmt.Println(\"Excellent\")\n" +
                "   case \"B\":\n" +
                "       fmt.Println(\"Very well\")//this will be the output because the value of grade is \"B\"\n" +
                "   case \"C\",\"D\":\n" +
                "       fmt.Println(\"Better do better\")\n" +
                "   default:\n" +
                "       fmt.Println(\"not a valid grade\")\n" +
                "}\n" +
                "```";
    }
    public static String loops(){
        return "Go loops:\n" +
                "```go\n" +
                "for condition ||  ( init; condition; increment ) {\n" +
                "   //statement(s)\n" +
                "}\n\n" +
                "Examples:\n\n" +
                "var i = 0;\n" +
                "for i <= 10 {//example with condition (equivalent to a while loop)\n" +
                "   fmt.Println(i)\n" +
                "   i++\n" +
                "}\n\n" +
                "for j := 7; j <= 10; j++ {//this creates a variable with value 0, and while the value does not meet the condition on the middle, it increases the value by 1\n" +
                "    fmt.Println(j)\n" +
                "}\n" +
                "```";
    }
    public static String functions(){
        return "Go functions:\n" +
                "```go\n" +
                "func functionName (parameters parameterTypes) returnType { \n" +
                "   //body of the function\n" +
                "}\n\n" +
                "Examples:\n\n" +
                "func addNumbers (a, b int){\n" +
                "   return a + b\n" +
                "}\n" +
                "//calling the function:\n" +
                "var x = addNumbers(5, 7)//sets the value of x to what the addNumbers function returns with the parameters passed in (5, 7)\n" +
                "//the value will be 12\n" +
                "func sayHi(name string){\n" +
                "   fmt.Println(\"Hello, I am \" + name)\n" +
                "}\n" +
                "//calling the function\n" +
                "sayInfo(14, \"Anna\")//will print \"your name is Anna and you are 14\n" +
                "```";
    }
    public static String structs(){
        return "Go structs:\n" +
                "```go\n" +
                "type StructName struct{\n" +
                "   property1 propertyType\n" +
                "   property2 propertyType\n" +
                "   property3 propertyType\n" +
                "}\n" +
                "//making functions for the structure type:\n" +
                "func (varName StructName) functionName (parameters) returnType {\n" +
                "   //function body\n" +
                "}\n" +
                "//this method now belongs to the StructName type\n\n" +
                "//making a new structure:\n" +
                "var name = StructName{value1, value2, value3}\n\n" +
                "Example:\n\n" +
                "type Person struct{\n" +
                "   name string\n" +
                "   age int\n" +
                "}\n" +
                "func (p Person) sayHello(){//this function now belongs to the Person type\n" +
                "   fmt.Println(\"Hello, I am \" + p.name + \" and I am \" + p.age + \" years old\")\n" +
                "}\n\n" +
                "//making structures:\n" +
                "var Bob Person\n" +
                "Bob.name = \"Bob\"\n" +
                "Bob.age = 20\n" +
                "Bob.sayHello()//will print \"Hello, I am Bob and I am 20 years old\"" +
                "//OR\n" +
                "Ben := Person{\"Ben\", 18}//you can also put the name of the variable before the value to make it more legible: {name: \"Bob\", age: 18}\n" +
                "```";
    }
}
