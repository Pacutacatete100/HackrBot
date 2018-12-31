package LangCode;

public class SwiftCode {
    public static String variables(){
        return "Swift variables:\n" +
                "```swift\n" +
                "var or let varName : type = value\n" +
                "//var is for defining a variable\n" +
                "//let is for a constant\n\n" +
                "Examples:\n\n" +
                "var age : Int = 18\n" +
                "let name : String = \"Ben\"\n\n" +
                "Types:\n\n" +
                "Int ➜ integer (whole number, positive or negative)\n" +
                "Double ➜ number with decimals (positive or negative)\n" +
                "Bool ➜ true or false\n" +
                "String ➜ a word or phrase, surrounded by \"\"\n" +
                "```";
    }
    public static String operators(){
        return "Swift operators:\n" +
                "```swift\n" +
                "```kotlin\n" +
                "+ ➜ Addition, returns addition.\n" +
                "- ➜ Subtraction, returns subtraction.\n" +
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
                "... ➜ creates a range ➜➜ for(i in 1..10)//equivalent of 1 <= i && i <= 10";
    }
    public static String ibOutlet(){
        return "Swift IBOutlets:\n" +
                "```swift\n" +
                "//IBOutlets are ways to connect things like labels from your UI to your code\n" +
                "//by making these connections, you are able to modify these components with your code\n\n" +
                "@IBOutlet weak var varName : UIComponentType!\n" +
                "//\"weak\" is a necessary modifier for IBOutlets\n\n" +
                "Examples:\n\n" +
                "@IBOutlet weak var label : UILabel!\n" +
                "//this IBOutlet refers to a UILabel in the UIbuilder\n" +
                "@IBOutlet weak var undoButton: UIButton!\n" +
                "//this IBOutlet refers to a UIButton in the UIbuilder\n\n" +
                "//Using the Storyboard in XCode, you can drag the UI component to your code and it will make this IBOutlet for you\n" +
                "```";
    }
    public static String ibAction(){
        return "Swift IBActions:\n" +
                "```swift\n" +
                "//IBActions are ways to connect your storyboard actions to your code\n" +
                "@IBAction func anctionName(arguments){\n" +
                "   //Body of action\n" +
                "}\n" +
                "//a usual argument will be \"_sender: someElement\"\n\n" +
                "Example:\n\n" +
                "@IBAction func changeText(_sender: UIButton){\n" +
                "   self.label.text = \"message changed\"\n" +
                "}\n" +
                "```";
    }
    public static String ifStatements(){
        return "Swift if statements:\n" +
                "```swift\n" +
                "if(condition){\n" +
                "   //what to do if condition is true\n" +
                "}else{\n" +
                "   //what to do if condition is false\n" +
                "}\n\n" +
                "Example:\n\n" +
                "var age : Int = 18\n" +
                "if(age >= 18){\n" +
                "   print(\"you are an adult\")\n" +
                "}else if(age <= 18){\n" +
                "   print(\"you are still not an adult\")\n" +
                "}else{\n" +
                "   print(\"not a valid age lol\")\n" +
                "}\n" +
                "//because age is 18, it will print \"you are an adult\"" +
                "```\n" +
                "more on statements: https://docs.swift.org/swift-book/ReferenceManual/Statements.html";
    }
    public static String switchStatements(){
        return "Swift switch statements" +
                "```swift\n" +
                "switch controlExpression {\n" +
                "   case value1:\n" +
                "       //what to do in the case that the control expression is of value1\n" +
                "   case value2 where condition:\n" +
                "       //what to do in the case that the control expression is of value2\n\n" +
                "       //where is a keyword that is followed by an expression, the statements will only be executed if the case and the expression are true\n\n" +
                "   case value3 where condition,\n" +
                "   value4 where condition:\n" +
                "       //what to do in the case that the control expression is of value3 or value4\n\n" +
                "       //where is a keyword that is followed by an expression, the statements will only be executed if the case and the expression are true\n\n" +
                "   default:\n" +
                "       //what do do if no other conditions or values are met or true\n" +
                "}\n\n" +
                "Example:\n\n" +
                "var x : Int = 10\n" +
                "switch x {\n" +
                "   case 1:\n" +
                "       print(\"value is 1\")\n" +
                "   case 2...9:\n" +
                "       print(\"value is in between 2 and 9\")\n" +
                "   case 10:\n" +
                "       print(\"value is 10\")\n" +
                "   case 11...20 where x % 2 == 0:\n" +
                "       print(\"value is between 11 and 20 and is even\")\n" +
                "   case 20, 21, 22:\n" +
                "       print(\"value is either 20, 21, or 22\")\n" +
                "}\n" +
                "//wil print \"value is 10\"" +
                "```\n" +
                "more on statements: https://docs.swift.org/swift-book/ReferenceManual/Statements.html";
    }

    public static String loops(){
        return "Swift loops" +
                "```swift\n" +
                "for (item in collection) {\n" +
                "    // body of loop\n" +
                "}\n" +
                "//the collection in a for loop can also be a range i.e. 1...10\n\n" +
                "Example:\n\n" +
                "for(i in 0...10){\n" +
                "   println(i)//will println every number from 0 to 10\n" +
                "}\n\n" +
                "let languages  =[\"Ruby\", \"Koltin\", \"Python\", \"Java\"]\n" +
                "for (language in languages){\n" +
                "   print(language)//will print all languages is the \"languages\" array\n" +
                "}\n\n" +
                "while (booleanExpression) {\n" +
                "    // codes inside body of while loop\n" +
                "}\n\n" +
                "Example:\n" +
                "var i : Int = 1\n" +
                "while(i < 10){\n" +
                "   println(i)//will print from 1 to 10\n" +
                "   i += 1\n" +
                "}\n" +
                "```";
    }
    public static String functions(){
        return "Swift functions:\n" +
                "```swift\n" +
                "func funcname(Parameters) -> returntype {\n" +
                "   //what to do when function is called\n" +
                "   return something(if necessary)\n" +
                "}\n\n" +
                "Examples:\n\n" +
                "func student(name: String) -> String {\n" +
                "   return name\n" +
                "}\n" +
                "func addNumbers(a: Int, b: Int) -> Int{\n" +
                "   return a +b\n" +
                "}\n\n" +
                "//caling the functions:\n" +
                "print(student(name: \"Ben\"))//will print Ben\n" +
                "print(addNumbers(5, 17))//will print 5 + 17, which is 22\n" +
                "```\n" +
                "More on functions: https://www.tutorialspoint.com/swift/swift_functions.htm";
    }
    public static String objects(){
        return "Swift classes and objects:\n" +
                "```swift\n" +
                "class ClassName{\n" +
                "   var varName1 : varType\n" +
                "   var varName2 : varType\n" +
                "   init(varName1 : varType, varName2 : varType){\n" +
                "       self. varName1 = varName1\n" +
                "       self. varName2 = varName2\n" +
                "   }\n" +
                "}\n\n" +
                "Example:\n\n" +
                "class Student {\n" +
                "   var name: String\n" +
                "   var age: Int \n" +
                "   var gpa: Double \n" +
                "   init(name: String, age: Int, gpa: Double){\n" +
                "       self.name = name\n" +
                "       self.age = age\n" +
                "       self.gpa = gpa\n" +
                "   }\n" +
                "}\n" +
                "//making an object from class\n" +
                "let ben = Student(name: \"Ben\", age: 18, gpa: 3.5)//makes a new instance of the class (an object), and giving it these features\n" +
                "```\n" +
                "more on swift objects and classes: https://www.tutorialspoint.com/swift/swift_classes.htm";
    }
}