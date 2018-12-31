package LangCode;

import java.util.ArrayList;

public class CppCode {
    public static String variables(){
        return "C++ variables:\n" +
                "```cpp\n" +
                "varType varName = value;\n" +
                "//in c++, you have to specify the type of variable it is, there are 6 main data types (types of variables)\n" +
                "bool ➜ //true or false\n" +
                "char ➜ //a single character, surrounded by ''\n" +
                "int ➜ //a whole number(negative or positive)\n" +
                "float ➜  //a number with decimal places\n" +
                "double ➜ //a number with decimal places, more precise than a float\n" +
                "string ➜ //a word or phrase, surrounded by \"\"\n\n" +
                "Examples:\n\n" +
                "int age = 18;\n" +
                "string name = \"Ben\";\n" +
                "char lastInitial = 'O';\n" +
                "double gpa = 3.5;\n" +
                "bool isAlive = true" +
                "```";
    }
    public static String operators(){
        return "C++ operators:\n" +
                "```cpp\n" +
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
        return "C++ if statements:\n" +
                "```cpp\n" +
                "if(booleanExpression) {\n" +
                "   // statement(s) will execute if the boolean expression is true\n" +
                "} else if(booleanExpression2){\n" +
                "  // statement(s) will execute if booleanExpression2 is true\n" +
                "} else {\n" +
                "   // executes when the none of the above condition is true.\n" +
                "}\n\n" +
                "Example:\n\n" +
                "int a = 12;\n" +
                "if(a > 10){\n" +
                "   cout<<\"a is greater than 10\"<< endl;\n" +
                "}else if(a < 10){\n" +
                "   cout<<\"a is smaller than 10\"<< endl;\n" +
                "}else{\n" +
                "   cout<<\"a is 10 or invalid\"<< endl;\n" +
                "} //this will print \"a is greater than 10\"\n" +
                "```";
    }
    public static String switchStatements(){
        return "C++ switch statement:\n" +
                "```cpp\n" +
                "switch(expression) {\n" +
                "   case constant-expression  :\n" +
                "      statement(s);\n" +
                "      break; //optional\n" +
                "   case constant-expression  :\n" +
                "      statement(s);\n" +
                "      break; //optional\n" +
                "  \n" +
                "   // you can have any number of case statements.\n" +
                "   default : //optional\n" +
                "      statement(s);\n" +
                "}\n\n" +
                "Example:\n\n" +
                "char grade = 'A';\n" +
                "switch(x){\n" +
                "   case 'A':\n" +
                "       cout<<\"excellent\"<<endl\n" +
                "       break;\n" +
                "   case 'B':\n" +
                "       cout<<\"nice\"<<endl\n" +
                "       break;\n" +
                "   case 'C':\n" +
                "       cout<<\"passing\"<<endl\n" +
                "       break;\n" +
                "   case 'D':\n" +
                "       cout<<\"bad\"<<endl\n" +
                "       break;\n" +
                "   case 'F':\n" +
                "       cout<<\"Oh no!\"<<endl\n" +
                "       break;\n" +
                "}//will print \"excellent\" because the value of grade is 'A' and that's what it prints in that case\n" +
                "```";
    }
    public static String loops(){
        return "C++ loops:\n" +
                "```cpp\n" +
                "While loops:\n" +
                "while(condition) {\n" +
                "   //statement(s) to do while condition is true;\n" +
                "}\n\n" +
                "For loops:\n" +
                "for ( init; condition; increment ) {\n" +
                "   //statement(s) to execute until condition is true;\n" +
                "}\n\n" +
                "Examples:\n\n" +
                "int i = 0;\n" +
                "while(i > 10){\n" +
                "   cout<< i <<endl;//will print the value of i, t will print from 0 to 10\n" +
                "   i++;//increases the value of i by 1\n" +
                "}\n\n" +
                "for(int i = 0; i < 10; i++){\n" +
                "   cout<< i <<endl;//will print from 0 to 10\n" +
                "   //i starts at 10, and until i is equal to 10, it prints the value of i and increases it by 1" +
                "}\n\n" +
                "```";
    }
    public static String functions(){
        return "C++ functions:\n" +
                "```cpp\n" +
                "returnType functionName( parameters ) {\n" +
                "   //body of the function\n" +
                "   return //(if necesssary)\n" +
                "}\n" +
                "//returnType can be of any data types\n\n" +
                "//if the function doesn't return anything, then the returnType is \"void\"\n\n" +
                "//the parameters are values passed into the function when called, the function will do something with these parameters\n\n" +
                "//returning something means it returns the functions creates a value of its specified return type\n\n" +
                "//you can then set this value to a variable or simply print it\n\n" +
                "Examples:\n\n" +
                "int addNumbers(int a, int b){\n" +
                "   return a + b;\n" +
                "   //returns the addition of the values passed in of a and b\n" +
                "}\n" +
                "void printName(string name){\n" +
                "   cout<< name <<endl;\n" +
                "   //this function does not return anything, therefore it cannot be set to a value;\n" +
                "}\n\n" +
                "//calling the functions:\n" +
                "int result = addNumbers(5, 7);//this makes variable result and sets its value to whatever addNumbers returns with the numbers passed in (12)\n\n" +
                "printName(\"Ben\");//will only print Ben\n" +
                "```";
    }
    public static String objects(){
        return "C++ objects:\n" +
                "```cpp\n" +
                "class ClassName{\n" +
                "private:\n" +
                "   propertyType property1;\n" +
                "   propertyType property2;\n" +
                "   propertyType property3;\n" +
                "public:\n" +
                "   returnType someMethod1(parameters){\n" +
                "       //body of method\n" +
                "   }\n" +
                "   returnType someMethod1(parameters){\n" +
                "       //body of method\n" +
                "   }\n\n" +
                "//making an objects from class:\n" +
                "ClassName objectName;\n" +
                "//setting the objects properties:\n" +
                "objectName.property1 = value;\n" +
                "objectName.property2 = value;\n" +
                "objectName.property3 = value;\n\n" +
                "Example:\n\n" +
                "class Animal{\n" +
                "private:\n" +
                "   string species;\n" +
                "   int legNumber;\n" +
                "   string name;\n" +
                "   int age;\n" +
                "private:\n" +
                "   void sayHello(string species){(\"hello, i am a talking \" + species);}\n\n" +
                "//making an object:\n\n" +
                "Animal dog;\n" +
                "//setting the values(in the main function):\n" +
                "dog.species = \"dog\";\n" +
                "dog.legNumber = 4;\n" +
                "dog.name = \"fred\"\n" +
                "dog.age = 7;\n" +
                "dog.sayHello(dog.species);//will print \"hello, i am a talking dog\"\n" +
                "```";
    }
}
