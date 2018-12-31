package LangCode;

import com.jagrosh.jdautilities.commons.waiter.EventWaiter;

public class JavaCode {
    public static String ifStatement(){
        return "Java if statements:\n" +
                "```java\n" +
                "if(boolean statement){\n" +
                "   //then do this\n" +
                "}else if(another boolean statement){\n" +
                "   //then do this(not necessary)\n" +
                "}else{\n" +
                "   //if all other booleans are not met (not true or false) then do this(also not necessary)\n" +
                "}\n" +
                "\n" +
                "Example:\n" +
                "int a = 4;\n\n" +
                "if(a > 7) {//if a is greater than 4\n" +
                "   System.out.println(\"false\");\n\n" +
                "} else if(a < 7) {//if a is less than 7\n" +
                "   System.out.println(\"true\");\n\n" +
                "} else {//if a is neither greater than 4 nor less than 7\n" +
                "   System.out.println(\"what\");\n\n" +
                "}\n" +
                "```";
    }
    public static String vars(){
        return "Java variables:\n" +
                "```java\n" +
                "//There are 6 main types of variables:\n\n" +
                "int, a whole number, positive or negative\n\n" +
                "double, a number with decimals, negative or positive\n\n" +
                "char, a character, or a single letter. Value goes in between single quotes:''\n\n" +
                "String, a word, sentence or phrase, goes in between quotation marks: \"\"\n\n" +
                "boolean, only true or false\n\n" +
                "float, also a number with decimals but less precise than a double\n\n" +
                "Example:\n" +
                "int someWholeNumber = 7; //makes a variable of type int called someWholeNumber and sets its value to 7\n\n" +
                "String someString = \"Hello World!\" //makes a variable of type String called someString and sets its value to \"Hello World\"\n" +
                "```";
    }
    public static String operators(){
        return "Java operators:\n" +
                "```java\n" +
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
                "|| ➜ means \"OR\"" +
                "Examples:\n" +
                "int x = 4\n" +
                "x += 3; // adds 3 to the value of x\n" +
                "x *= 4; // multiplies the value of x by 4\n" +
                "int z = x + 5;//value of z will be 12 because 4 (x) + 5 = 12\n" +
                "boolean checker = x > 7 //value will be false because 4 (x) is not greater than 7\n" +
                "```";
    }
    public static String loops(){
        return "Java loops:\n" +
                "```java\n" +
                "for(initialization; termination; increment){\n" +
                "   //code to loop until termination condition is true\n" +
                "}\n" +
                "\n" +
                "while(boolean statement){\n" +
                "   //code to loop while boolean statement is true\n" +
                "}\n" +
                "\n" +
                "do{\n" +
                "   //code to loop while boolean statement is true\n" +
                "}while(boolean statement);\n\n" +
                "Examples:\n" +
                "for(int i = 0; i < 10; i++){\n" +
                "   System.out.println(i);//will print 0 through 10 because i starts at 0 and increments by 1 until it gets to 10\n" +
                "}\n\n" +
                "int i = 0;\n" +
                "while(i < 10){\n" +
                "   System.out.println(i);\n" +
                "   i++;\n" +
                "}\n\n" +
                "int i = 0" +
                "do{\n" +
                "   System.out.println(i);\n" +
                "   i++;\n" +
                "}while(i < 0)\n" +
                "```";
    }
    public static String switchCase(){
        return "Java switch Case:\n" +
                "```java\n" +
                "varType varToCheckFor = varValue;\n\n" +
                "switch(varToCheckFor){\n" +
                "   case value1:\n" +
                "       //do stuff if varToCheckFor's value is value1\n" +
                "       break;//breaks statement so it doesn't go on forever\n" +
                "   case value2:\n" +
                "       //do stuff if varToCheckFor's value is value2\n" +
                "       break;\n" +
                "   case value3:\n" +
                "       //do stuff if varToCheckFor's value is value3\n" +
                "       break;\n" +
                "   default:\n" +
                "       //what to do if none of the other cases are met (like the else statement)\n" +
                "       break;\n" +
                "}\n\n" +
                "Example:\n" +
                "int yourAge;//supposing yourAge can be any number\n\n" +
                "switch(yourAge){\n" +
                "   case 15:\n" +
                "       System.out.println(\"You are 15\");\n" +
                "       break;\n" +
                "   case 18:\n" +
                "       System.out.println(\"You are 18\");\n" +
                "       break;\n" +
                "   case 21:\n" +
                "       System.out.println(\"You are 21\");\n" +
                "       break;\n" +
                "   default:\n" +
                "       System.out.println(\"Do you even age bro?\");\n" +
                "}\n" +
                "```";
    }
    public static String functions(){
        return "Java functions:\n" +
                "```java\n" +
                "modifier returnValue functionNme(arguments){\n" +
                "   //things to do here when method is called\n" +
                "   return value;//if any\n" +
                "}\n\n" +
                "modifier ➜ 2 of them, can be public or private, and static or not\n\n" +
                "returnValue ➜ Can be any variable type like char, int or String. Can also be void(returns nothing)\n\n" +
                "methodNames ➜ Name of the method and what you want to call it with\n\n" +
                "arguments ➜ Parameters that the method will need to be able to do its thing. Can also be empty\n\n" +
                "Example:\n" +
                "public void sayHello(){\n" +
                "   System.out.println(\"Hello World!\");\n" +
                "}\n" +
                "Example 2:\n" +
                "public static int addNumbers(int a, int b){\n" +
                "   return a + b;\n" +
                "}\n\n" +
                "Calling the function:\n\n" +
                "//In the main method:\n\n" +
                "sayHello();// will print \"Hello World\"\n\n" +
                "addNumbers(5, 7);// 5 will take the place of int a, 7 will take the place of int b in the method\n" +
                "//this will return 12 because 5+7 is 12\n" +
                "//you can set the value to a variable:\n" +
                "int result = addNumbers(5, 7);\n" +
                "```";
    }
    public static String objects(){
        return "Java objects and classes:\n" +
                "```java\n" +
                "//a class is like a blueprint for an object\n" +
                "(public or private) class objectName{\n" +
                "   (public or private)varType characteristic1;\n" +
                "   (public or private)varType characteristic2;\n\n" +
                "   public constructor(varType characteristic1, varType characteristic2){\n" +
                "       this.characteristic1 = characteristic1;\n" +
                "       this.characteristic2 = characteristic2;\n" +
                "       //the \"this\" keyword in front of the characteristics make it refer to the ones outside the method\n" +
                "       //This then sets their value to the value of the arguments in the constructor\n" +
                "   }\n\n" +
                "   (public or private)returnType or void methodName(arguments){\n" +
                "       //something the object can do, with arguments if any\n" +
                "       return value;\n" +
                "   }\n" +
                "//The constructor is a method to make a new instance of that object\n\n" +
                "Example:\n" +
                "public class Dog{\n" +
                "   private String name;\n" +
                "   private int age;\n" +
                "   private String breed;\n\n" +
                "   public Dog(String name, int age, String breed){\n" +
                "       this.name = name;\n" +
                "       this.age = age\n" +
                "       this.breed = breed;\n" +
                "   }\n\n" +
                "   public void printName(){\n" +
                "       System.out.println(\"the dogs name is\" + name);\n" +
                "   }\n" +
                "\n\n" +
                "Creating the object:\n" +
                "//in main method:\n\n" +
                "Dog myDog = new Dog(\"Rex\", 7, \"Labrador\");//This is using the constructor method to make a new Dog\n\n" +
                "myDog.printName();//will print \"the dogs name is Rex\" because we set the dogs name to Rex\n" +
                "//you can have different methods to do different things with the characteristics of the object like add to the age or print the breed\n" +
                "```";
    }
}