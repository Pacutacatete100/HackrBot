package LangCode;

public class PythonCode {
    public static String variables(){
        return "Python variables:\n" +
                "```python\n" +
                "#python has inferred variables, so you only have to do:\n" +
                "varName = value\n" +
                "but in python it is customary to name things like this:\n" +
                "var_name = value\n\n" +
                "Examples\n" +
                "my_name = \"ben\"\n" +
                "my_age = 18\n" +
                "```";
    }
    public static String operators(){
        return "Python operators:\n" +
                "```python\n" +
                "+ ➜ Addition, returns addition of the two numbers before and after it\n" +
                "- ➜ Subtraction, returns subtraction of the two numbers before and after it\n" +
                "/ ➜ Division, returns division\n" +
                "* ➜ Multiplication,returns product of multiplication of numbers or variables\n" +
                "** ➜ Exponent, returns number before it to the power of number after it\n" +
                "% ➜ Modulo, divides and returns the remainder\n" +
                "< ➜ less than, checks if the value before it is smaller than the one after it. Returns boolean\n" +
                "> ➜ greater than, checks if value before it is greater than the one after it. Returns boolean\n" +
                "!= ➜ \"!\" means NOT, checks if the value or variable before it is NOT equal to the one after it. Returns boolean\n" +
                "== ➜ checks if value or variable before it is equal to the one on the right. Returns boolean\n" +
                ">= ➜ checks is value or variable before it is EQUAL TO  or GREATER THAN the one after it. Returns boolean\n" +
                "<= ➜ checks is value or variable before it is EQUAL TO  or LESS THAN the one after it. Returns boolean\n" +
                "and ➜ returns true if condition before it AND condition after it are both true\n" +
                "or ➜  returns true if only 1 condition, whether the one before or the one after is true\n" +
                "```";
    }
    public static String ifStatement(){
        return "Python if-statement:\n" +
                "```python\n" +
                "#in python, unlike other languages, code blocks (the things inside {}) are separated with indentations\n" +
                "#they are opened using \":\"\n\n" +
                "#if statements:\n" +
                "if boolean_statement:\n" +
                "   #do something if boolean statement is true or false\n" +
                "elif boolean_statement:\n" +
                "   #do something if this boolean statement is true\n" +
                "else:" +
                "   #do something if none other conditions are true\n" +
                "#notice how the bodies of the if statements are exactly 1 indentation ahead of their opening (\"if\" or \"elif\" or \"else\")\n\n" +
                "Example\n" +
                "a = 15\n" +
                "b = 20\n" +
                "if a < b:\n" +
                "   print(\"a is smaller\")\n" +
                "elif a > b:\n" +
                "   print(\"a is greater\")\n" +
                "#will print \"a is smaller\" because 15 (a) is smaller than 20 (b)\n" +
                "```";
    }
    public static String loops(){
        return "Python loops:\n" +
                "```python\n" +
                "#loops in python have similar syntax to if statements\n" +
                "while condition is true:\n" +
                "   #do something here\n\n" +
                "#the body of the loop is inside the while, we know because it is 1 indentation ahead of the \"while\"\n\n" +
                "for condition:\n" +
                "   #do something for condition\n" +
                "   #for loops are usually used to iterate through collections or something like that\n\n" +
                "Example\n" +
                "x = 0\n" +
                "while x < 6:\n" +
                "   print(i)\n" +
                "   x += 1\n" +
                "#this loop will print from 0 to 5, because it prints the value of x and increases it by 1 every iteration\n" +
                "#when the value of x is 6, the condition is no longer true and so it stops printing the value of x\n\n" +
                "Example 2\n" +
                "for x in \"banana\":\n" +
                "   print(x) #will print each letter in the given word\n\n" +
                "Example 3\n" +
                "names = [\"Ben\", \"Alan\", \"Manuel\"]\n" +
                "for x in names:\n" +
                "   print(x)#prints each element in the names list\n" +
                "```\n" +
                "more on loops in python:\n" +
                "https://www.w3schools.com/python/python_for_loops.asp\n" +
                "https://www.w3schools.com/python/python_while_loops.asp";
    }
    public static String functions(){
        return "Python functions:\n" +
                "```python\n" +
                "#in python to define a function, we use the \"def\" keyword\n" +
                "#just like loops and if statements, the body of the function is 1 indentation after the definition of the function:\n\n" +
                "def function_name(arguments):\n" +
                "   #do something(with arguments, if any)\n" +
                "   return something (if necessary)\n\n" +
                "Example:\n\n" +
                "def add_numbers(a, b):\n" +
                "   return a + b\n" +
                "#calling the add_numbers function:\n" +
                "add_numbers(5, 7)#will return 12, 5 takes the place of a, 7 takes the place of b\n\n" +
                "#Many other languages have a main method, which is whats executed when you run the program\n\n" +
                "#python doesn't have this, so all method calling and main code goes in the first line (so no indentations from the edge of your file)\n\n" +
                "#another example of a function:\n" +
                "def print_name(name):\n" +
                "   print(\"your name is \" + name)\n\n" +
                "print_name(\"Ben\")" +
                "```";
    }
    public static String dataStructures(){
        return "Python data structures:\n" +
                "```python\n" +
                "#Python has a lot of different types of collections, each very important to know for different things\n" +
                "#These include:\n" +
                "Lists\n" +
                "Tuples\n" +
                "Sets\n" +
                "Dictionaries\n" +
                "#How to use them:\n\n" +
                "Lists:\n\n" +
                "list_name = [elements (separated by comma)]#collection that is ordered and changeable\n" +
                "#List examples:\n" +
                "fruits_list = [\"banana\", \"apple\", \"pineapple\"]\n" +
                "numbers_list = [100, 150, 200, 250]\n\n" +
                "Tuples:\n\n" +
                "tuple_name = (elements(separated by commas))#tuples are like lists but immutable, meaning you cannot edit them\n" +
                "#Tuples examples:\n" +
                "sodas = (\"coke\", \"fanta\", \"sprite\")\n" +
                "number_tuple = (5, 10, 15, 20)\n\n" +
                "Sets:\n\n" +
                "set_name = {elements(separated by commas)}#sets are unordered and unindexed\n" +
                "#Sets examples:\n" +
                "meat_set = {\"pork\", \"beef\", \"chicken\"}\n" +
                "number_set = {10, 20, 30, 40}\n\n" +
                "Dictionary:\n\n" +
                "dict_name = {value_key_1 : value_1, value_key_2 : value_2, value_key_3 : value_3}#a dictionary is an unordered, mutable, indexed collection\n" +
                "#they contain a key and a value that belongs to that key. We access that value by calling that key\n" +
                "#Dictionary examples:\n" +
                "student = {\"name\" : \"Ben\", \"age\" : 18, \"computer\" : \"mac\"}\n" +
                "```\n" +
                "More on collections:\n" +
                "https://www.w3schools.com/python/python_lists.asp\n" +
                "https://www.w3schools.com/python/python_tuples.asp\n" +
                "https://www.w3schools.com/python/python_sets.asp\n" +
                "https://www.w3schools.com/python/python_dictionaries.asp";
    }
    public static String objects(){
        return "Python objects:\n" +
                "```python\n" +
                "#making a class:\n" +
                "class Class_Name:\n" +
                "   characteristic_1 = value\n" +
                "   characteristic_2 = value2\n\n" +
                "   def function(self):#self is a needed argument for any function in a class\n" +
                "       #do something with classes characteristics\n" +
                "object = Class_Name()\n" +
                "print(object.characteristic)#Will print whatever the value is for characteristic_1\n\n" +
                "Example:\n" +
                "class Ben:\n" +
                "   name = \"Ben\"\n" +
                "   age = 18\n" +
                "   def print_info(self):\n" +
                "       print(\"this is coming from the Ben class\")\n\n" +
                "ben = Ben()\n" +
                "ben.print_info()#will print \"this is coming from the Ben class\"\n\n" +
                "#If you are making multiple objects with the same characteristics, we use a constructor:\n" +
                "class Class_Name:\n" +
                "   def __init__(self, characteristic_1, characteristic_2):#self is again, the necessary argument\n" +
                "       self.characteristic_1 = characteristic_1\n" +
                "       self.characteristic_2 = characteristic_2\n\n" +
                "object = Class_Name(arguments_passed)#\"self\" is an argument automatically passed, so you only need to pass the other arguments\n\n" +
                "Example:\n" +
                "class Person:\n" +
                "   def __init__(self, name, age):\n" +
                "       this.name = name\n" +
                "       this.age = age\n\n" +
                "dan = Person(\"Dan\", 25)#this is when the __init__ function is called\n" +
                "#calling characteristics from the objects:\n" +
                "print(dan.age)#will print 25 because the value of \"age\" for the \"dan\" object is 25\n\n" +
                "#keep in mind, you can still have other functions in the class besides just the __init__ function" +
                "```";
    }
}