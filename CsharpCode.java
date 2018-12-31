package LangCode;

public class CsharpCode {
    public static String variables(){
        return "C# variables:\n" +
                "```csharp\n" +
                "//There are 6 main types of variables:\n\n" +
                "int, a whole number, positive or negative\n\n" +
                "double, a number with decimals, negative or positive\n\n" +
                "char, a character, or a single letter. Value goes in between single quotes:''\n\n" +
                "string, a word, sentence or phrase, goes in between quotation marks: \"\"\n\n" +
                "boolean, only true or false\n\n" +
                "float, also a number with decimals but less precise than a double\n\n" +
                "Example:\n" +
                "int someWholeNumber = 7; //makes a variable of type int called someWholeNumber and sets its value to 7\n\n" +
                "string someString = \"Hello World!\" //makes a variable of type string called someString and sets its value to \"Hello World\"\n" +
                "```";
    }
    public static String operators(){
        return "C# operators:\n" +
                "```csharp\n" +
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
    public static String ifStatement(){
        return "C# if statements\n" +
                "```csharp\n" +
                "if (booleanExpression){\n" +
                "   //statements executed if booleanExpression is true\n" +
                "}else if(booleanExpression2){\n" +
                "   //statements executed if booleanExpression2 is true\n" +
                "}else {\n" +
                "   //statements executed if none of the other boolean expressions are true\n" +
                "}\n\n" +
                "Example:\n" +
                "int a = 15;\n" +
                "if(a > 5){\n" +
                "   Console.WriteLine(\"a is greater than 5\");\n" +
                "} else if(a < 10){\n" +
                "   Console.WriteLine(\"a is less than 10\");\n" +
                "} else {\n" +
                "   Console.WriteLine(\"whaaat\");\n" +
                "}\n" +
                "```";
    }
    public static String switchStatement(){
        return "C# Switch statement:\n" +
                "```csharp\n" +
                "switch (variable){\n" +
                "    case value1:\n" +
                "        // Statements executed if variable = value1\n" +
                "        break;\n" +
                "    case value2:\n" +
                "        // Statements executed if variable = value1\n" +
                "        break;\n" +
                "    ... ... ... \n" +
                "    ... ... ... \n" +
                "    default:\n" +
                "        // Statements executed if no case matches\n" +
                "}\n\n" +
                "Example:\n\n" +
                "char grade = 'A';\n" +
                "switch(grade){\n" +
                "   case 'A':\n" +
                "       Console.WriteLine(\"excellent\");\n" +
                "       break;\n" +
                "   case 'B':\n" +
                "       Console.WriteLine(\"Very good\");\n" +
                "       break;\n" +
                "   case 'C':\n" +
                "       Console.WriteLine(\"Average\");\n" +
                "       break;\n" +
                "   case 'D':\n" +
                "       Console.WriteLine(\"better get better\");\n" +
                "       break;\n" +
                "   case 'F':\n" +
                "       Console.WriteLine(\"Fail\");\n" +
                "       break;\n" +
                "   default:\n" +
                "       Console.WriteLine(\"Not a valid grade\")\n" +
                "       break;\n" +
                "}\n" +
                "```";
    }
    public static String loops(){
        return "C# Loops:\n\n" +
                "while loops:\n" +
                "```csharp\n" +
                "while (booleanExpression){\n" +
                "   //what to do while booleanExpression is true\n" +
                "}\n\n" +
                "Example:\n\n" +
                "int i = 0;\n" +
                "while(i < 10){\n" +
                "   Console.WriteLine(i);\n" +
                "   i++;\n" +
                "   //this initializes a variable at 0, and while the value is less than 10, it will print the value of the variable and increase it by 1\n" +
                "}\n" +
                "```\n" +
                "for loops:\n" +
                "```csharp\n" +
                "for (initialization; condition; iterator){\n" +
                "   //what to do until condition is false\n" +
                "}\n\n" +
                "Example:\n\n" +
                "for(int i = 0; i < 10; i++){\n" +
                "   Console.WriteLine(i);\n" +
                "   //this loop will initialize a variable at 0, and while the condittion is true, it will increase the value by 1\n" +
                "   //This will print values 0-9 (inclusive)\n" +
                "}\n" +
                "```";
    }
    public static String functions(){
        return "C# functions:\n" +
                "```csharp\n" +
                "modifier returnType functionName (parameters){\n" +
                "   //what to do when called (with parameters if any)\n" +
                "}\n\n" +
                "Example 1:\n\n" +
                "public int addNumbers(int a, int b){\n" +
                "   return a + b;\n" +
                "}\n" +
                "//calling the function:\n" +
                "Console.WriteLine(addNumbers(5, 7));//will print 12\n" +
                "//5 takes the place of a, 7 takes the place of b\n" +
                "//adding these 2 numbers will return 12, so it will print 12.\n" +
                "//You can also set the result of the function to a variable\n\n" +
                "Example 2:\n\n" +
                "public void printHello(){\n" +
                "   Console.WriteLine(\"Hello World!\");\n" +
                "}\n" +
                "//calling the function:\n" +
                "printHello();//will print \"Hello World!\"" +
                "```";
    }
    public static String objects(){
        return "C# objects and classes:\n" +
                "```csharp\n" +
                "public class ClassName{\n" +
                "   propertyType property1;\n" +
                "   propertyType property2;\n" +
                "   propertyType property3;\n\n" +
                "   public constructor(propertyType property1, propertyType property2, propertyType property3){\n" +
                "       this.property1 = property1;\n" +
                "       this.property2 = property2;\n" +
                "       this.property3 = property3;\n" +
                "   }\n" +
                "   public someMethod(){\n" +
                "       //body of someMethod\n" +
                "   }\n" +
                "}\n\n" +
                "Example:\n\n" +
                "public class Person{\n" +
                "   String name;\n" +
                "   int age;\n" +
                "   String job;\n" +
                "   public Person(String name; int age, String job){\n" +
                "       this.name = name;\n" +
                "       this.age = age;\n" +
                "       this.job = job;\n" +
                "   }\n" +
                "   public sayHello(){\n" +
                "       Console.WriteLine(\"Hello, I am \" + name + \" and I am \" + age);\n" +
                "}\n" +
                "//making an object:\n" +
                "Person bob = new Person(\"Bob\", 22, \"graphic designer\");\n" +
                "Console.WriteLine(bob.age);//will print bobs age (22)\n" +
                "bob.sayHello();//will print \"Hello, I am bob and I am 22\"\n" +
                "```";
    }
}
