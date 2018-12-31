package LangCode;

public class JSCode {
    public static String variables(){
        return "JavaScript variables\n" +
                "```javascript\n" +
                "Javascript has inferred variables, meaning you do not have to specify the type\n" +
                "var varName = value;\n\n" +
                "Examples:\n" +
                "var age = 17;\n" +
                "var name = 'Ben'; //int javascript, strings and characters are in between ''\n" +
                "```";
    }
    public static String operators(){
        return "JavaScript Operators:\n" +
                "```javascript\n" +
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
                "```";
    }
    public static String ifStatement(){
        return "JavaScript if-statements:\n" +
                "```javascript\n" +
                "if(boolean statement){\n" +
                "   //then do this\n" +
                "}else if(another boolean statement){\n" +
                "   //then do this(not necessary)\n" +
                "}else{\n" +
                "   //if all other booleans are not met (not true or false) then do this(also not necessary)\n" +
                "}\n" +
                "\n" +
                "Example:\n" +
                "var a = 4;\n\n" +
                "if(a > 7) {//if a is greater than 4\n" +
                "   console.log(\"false\");\n\n" +
                "} else if(a < 7) {//if a is less than 7\n" +
                "   console.log(\"true\");\n\n" +
                "} else {//if a is neither greater than 4 nor less than 7\n" +
                "   console.log(\"what\");\n\n" +
                "}\n" +
                "```";
    }
    public static String switchCase(){
        return "JavaScript switch Case:\n" +
                "```javascript\n" +
                "var varToCheckFor = varValue;\n\n" +
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
                "var yourAge;//supposing yourAge can be any number\n\n" +
                "switch(yourAge){\n" +
                "   case 15:\n" +
                "       console.log(\"You are 15\");\n" +
                "       break;\n" +
                "   case 18:\n" +
                "       console.log(\"You are 18\");\n" +
                "       break;\n" +
                "   case 21:\n" +
                "       console.log(\"You are 21\");\n" +
                "       break;\n" +
                "   default:\n" +
                "       console.log(\"Do you even age bro?\");\n" +
                "}\n" +
                "```";
    }
    public static String loops(){
        return "JavaScript loops:\n" +
                "```javascript\n" +
                "for(initialization; termination; increment){\n" +
                "   //code to loop until termination condition is true or false\n" +
                "}\n" +
                "\n" +
                "while(boolean statement){\n" +
                "   //code to loop while boolean statement is true or false\n" +
                "}\n" +
                "\n" +
                "do{\n" +
                "   //code to loop while boolean statement is true or false\n" +
                "}while(boolean statement);\n\n" +
                "Examples:\n" +
                "for(var i = 0; i < 10; i++){\n" +
                "   console.log(i);//will print 0 through 10 because i starts at 0 and increments by 1 until it gets to 10\n" +
                "}\n\n" +
                "var i = 0;\n" +
                "while(i < 10){\n" +
                "   console.log(i);\n" +
                "   i++;\n" +
                "}\n\n" +
                "var i = 0;" +
                "do{\n" +
                "   console.log(i);\n" +
                "   i++;" +
                "}while(i < 0);" +
                "```";
    }
    public static String functions(){
        return "JavaScript functions\n" +
                "```javascript\n" +
                "function functionName(arguments){\n" +
                "   //things to do when method is called\n" +
                "   return something;\n" +
                "}\n\n" +
                "Calling the function:\n" +
                "functionName(arguments);//you can set this equal to a variable or just have it alone\n\n" +
                "Example:\n" +
                "function addNumbers(a, b){\n" +
                "   return a +b;\n" +
                "}\n\n" +
                "Calling addNumbers():\n" +
                "var x = addNumbers(5, 8);//5 will take the place of a and 8 will take the place of b\n" +
                "//the function returns a + b so 5 + 8, which will return 13 so the value of x will be 13\n" +
                "```";
    }
    public static String DOMManipulation(){
        return "JavaScript DOMManipulation\n" +
                "```javascript\n" +
                "//Dom manipulation is a way to change and manipulate elements in an HTML file\n" +
                "The most common way to do this is to use the \"getElementById\" method, simple syntax seen here:\n" +
                "document.getElementById(\"elementID\").changeSomething = changeToThis;\n\n" +
                "more specific example:\n" +
                "document.getElementById(\"myTextLabel\").textContent = \"This is javascript\";\n\n" +
                "//\"document\" ➜ refers to the HTML document\n" +
                "//\"getElementById(\"myTextLabel\")\" ➜ gets the element who's ID is \"myTextLabel\" in the HTML document\n" +
                "//\".textContent\" ➜ built in function that gets the wanted elements value, in this case text\n" +
                "//\"= \"This is javascript\" \" ➜ changes the value of the element to \"This is javascript\"\n" +
                "```\n" +
                "More on DOM manipulation: https://www.w3schools.com/js/js_htmldom_document.asp";
    }
    public static String objects(){
        return "JavaScript objects\n" +
                "```javascript\n" +
                "//making an object:\n" +
                "var objectName = {\n" +
                "   property1 : propertyValue, \n" +
                "   property2 : propertyValue, \n" +
                "   property3 : propertyValue \n" +
                "   objectFunction : function(arguments){\n" +
                "       //do stuff here\n" +
                "       return something;\n" +
                "   }\n" +
                "}\n" +
                "//calling a property:\n" +
                "objectName.property1;\n\n" +
                "Changing values:\n" +
                "objectName.property1 = newValue;\n\n" +
                "Example:\n" +
                "let Dan = {\n" +
                "   name : \"Daniel\",\n" +
                "   job : \"Software engineer\",\n" +
                "   age : 25,\n" +
                "   getBirthYear : function(currentYear){\n" +
                "       return currentYear - Dan.age;\n" +
                "   }\n" +
                "}\n\n" +
                "//if you want multiple objects of the same thing, use a constructor, seen here:\n" +
                "function objectName(prop1, prop2, prop3){\n" +
                "   this.prop1 = prop1;\n" +
                "   this.prop2 = prop2;\n" +
                "   this.prop3 = prop3;\n" +
                "   this.objectFunction = function(arguments){\n" +
                "       return something;\n" +
                "   };\n" +
                "}\n" +
                "//This is a constructor function, used to make different objects with the same properties\n" +
                "Example:\n" +
                "function Person(name, job, age){\n" +
                "   this.name = name;\n" +
                "   this.job = job;\n" +
                "   this.age = age;\n" +
                "   this.getBirthYear = function(currentYear){\n" +
                "       return currentYear - this.age;\n" +
                "   };\n" +
                "}\n" +
                "//making an object with this constructor:\n" +
                "let dan = new Person(\"Dan\", \"Software engineer\", 25);\n" +
                "//calling some properties:\n" +
                "console.log(dan.job);\n" +
                "console.log(dan.getBirthYear(2018));\n" +
                "```";
    }
}
