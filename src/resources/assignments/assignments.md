### Assignment 44 (08/18)
**MultiThreading Continued, Install MySQL**
1. Install mysql database on your machine. 
	1. Windows - https://www.javatpoint.com/how-to-install-mysql
	2. Mac     - https://flaviocopes.com/mysql-how-to-install/
2. Try out the BankingAccount multithreading program.
3. Try out the Executor Service and other multithreading programs.

### Assignment 43 (08/17)
**MultiThreading**
1. Basic theory on Multithreading - What are threads, multithreading and methods of Threads.
2. Practice the 2 programs discussed in the class.

### Assignment 42 (08/16)
**Readers,Writers and Serialization**
1. Find out if numbers are prime or not
	1. Read numbers from a file.
	2. Write numbers to a file which are prime.
2. With any object class (Student/Employee) create atleast 5 attributes and serialize the data and read the data from a different class.	


### Assignment 41 (08/11)
**Multiple topics - Strings, Lists, Maps, Operators, Classes and Objects**
1. Write a Java Program to find if two strings are Anagrams.
	1. Two strings are considered Anagrams if they are formed using same characters. Casing/Spaces can be ignored
	2. Eg 1: Input : String first = "I am Lord Voldemort" and String second="Tom Marvolo Riddle"   ,Output : true
	3. Eg 2: Input : String first = "I am Lord Voldemort" and String second="Tom Marvolo Riddlee"   ,Output : false
2. Compute income tax amount for Employees.
	1. Create an Employee class	with attributes name, empId, age and salary
	2. Ask the user how many employees they want to create and read that input (Hint: Use Scanner )
	3. Depending on the input, ask the user to enter name , empId, age and salary for that employee and create objects accordingly.
	4. Once all the details are entered, calculate income tax for each employee and print the name,empId,age salary and income tax value.
	5. Income tax should be calculated as (for < 60 years of age):
		1. Upto Rs. 2,50,000 			 - Nil
		2. Rs. 2,50,001 to Rs. 5,00,000  - 5% above Rs. 2,50,000
		3. Rs. 5,00,001 to Rs. 10,00,000 - Rs. 12,500 + 20% above Rs. 5,00,000
		4. Above Rs. 10,00,000			 - Rs. 1,12,500 + 30% above Rs. 10,00,000
	6. Income tax should be calculated as (for > 60 years of age):
		1. Upto Rs. 3,00,000 			 - Nil
		2. Rs. 3,00,001 to Rs. 5,00,000  - 5% above Rs. 3,00,000
		3. Rs. 5,00,001 to Rs. 10,00,000 - Rs. 10,000 + 20% above Rs. 5,00,000
		4. Above Rs. 10,00,000			 - Rs. 1,10,500 + 30% above Rs. 10,00,000
	7. Test your program thoroughly with all types of inputs and make sure it gives expected output.
3. Write a program to check if a String is panagram or not
	1. A string is a panagram if it contains all 26 characters
	2. Eg 1: Input: The five boxing wizards jump quickly , Output: true. Explanation: It contains all 26 alphabets (a to z). Casing can be ignored.
	3. Eg 2: Input: This is a normal string,	 Output: false. It does not contain all alphabets.
4. Create a Student class with the attributes - name, age, city, department
	1. Ask the user how many Students they want to create and read that input (Hint: Use Scanner )	
	2. Depending on the input, ask the user to enter name , age, city, department for that student and create objects accordingly.
	3. Once all the data is entered, print the data sorted by name, department and age.
	4. Give a count of number of students in each department. (Eg: IT - 3, CSE - 2 etc)
	5. Give names of students department wise (Eg: IT - Praveen,Pooja , CSE - Priyanka, Manish)
	6. Test your program thoroughly with all types of inputs and make sure it gives expected output.
5. Write a Java program to find sum of digits of a number. 
	1. Eg 1: Input: 276  Output: 15 (2+7+6 = 15)
	2. Eg 2: Input: 94701  Output: 21 (9+4+7+0+1 = 21)	
	

### Assignment 40 (08/10)
**Hashing,Maps, HashMap & other classes**
1. Write a Java Program to 
	1. Count number of words in given sentence
	2. Occurrence of each word
	3. Occurrence of each character
		I/p: String str = "This this is is done by Java Java"; O/p 2: {Java=2, by=1, this=1, This=1, is=2, done=1} O/p 3: {i=4, a=4 ,...}
2. Write a program to see how many Employees have same day as joining day. Create a map with day and employee names and display it at the end.
	1. Input:
		a. "Praveen", "20/06/2023"
		b. "Pooja", "21/06/2023"
		c. "Manish", "21/06/2023"
		d. "Urja", "20/06/2023"
	2. Output:
		 {"20/06/2023"=Praveen,Urja }
		 {"21/06/2023"=Pooja,Manish}	


### Assignment 39 (08/09)
**TreeSet, Iterator and ListIterator, Map**
1. In the TreeSetComparableExample class, how can we sort on multiple fields?
	a. Take a look at the class TreeSetComparableExample
	b. If we run it without changes, we are dropping few Employees
	c. What needs to be changed so that all employees are added to the TreeSet.
2. Try out the Iterator and ListIterator programs in the Java Theory_18 doc
3. Understand the Map hierarchy

### Assignment 38 (08/08)
**Stack,HashSet,LinkedHashSet, Debugging**
1. Take any 2 programs that we did so far and try to debug the program.(Pick one which has a Scanner class atleast)
2. Revisit the Stack,HashSet,LinkedHashSet programs and concepts.

### Assignment 37 (08/07)
**ArrayList and LinkedList**
1. Try to do the Assignment 36, question#2 using LinkedList instead of ArrayList and note the changes needed.
2. Run and practice the LinkedList program in the doc.
3. What is the difference between Java Array vs ArrayList?
4. What is the difference between ArrayList vs LinkedList?


### Assignment 36 (08/04)
**ArrayList in Java, Different Methods of ArrayList**
1. Try to do all the programs discussed in the class using different methods.
2. Create a class Student with  attributes - name,age,id,marks
	a. Create multiple objects of the Student class - atleast 5
	b. Create an Student ArrayList and add all the student objects created to this array list
	c. Iterate over the ArrayList and print the name of the student with highest marks.
	d. Iterate over the ArrayList and print the name of the student with highest age.
3. Sort an array of numbers in Java using below algorithms/techniques
	1. Bubble Sort
	2. Merge Sort 
	3. Insertion Sort
	4. Quick Sort
	5. Selection Sort


### Assignment 35 (08/03)
**Generics, ArrayList**
1. Create a class using generics that will accept any type and create objects using all possible classes:
	a. Integer
	b. String
	c. Employee
2. Create an simple ArrayList of integers with elements from 1 to 50 and print the array list


### Assignment 34 (08/01)
**ATM Program Continued, Collection Framework**
1. Add program exception handling in the ATM program
	1. Users should not be able to enter a negative amount.
	2. Users should not be able to enter any character.
	3. Users should maintain minimum balance of Rs.200
	4. Try to separate out the BankAccount functionality from the main class
2. Take a look at the Collection Hierarchy Diagram and try to understand the different classes and interfaces	
3. Try to look through all methods of the Collection interface


### Assignment 33 (07/31)
**Programs on Strings**
1. Find total number of letters in a String
	Eg: Input: "This is a program" O/p: 14
2. Check if String is a Pallindrome String, do not consider the case of the letters
	Eg: String s1="Madam" O/p: true (since the reverse of Madam is also madaM and we are asked not to consider case)
3. Count occurrence of a character in a String (do not consider casing)
	1. Take a string from the user as an input
	2. Take a char as input from the user
	3. Check how many times this character is present in the string. Try out with atleast 2 ways.

### Assignment 32 (07/28)
**ATM Program Using User Input**
1. Create an ATM Program which does the following
	a. Sets an initial balance for a user, say 1000 (balance = 1000)
2. Next, it keeps on asking the user to select one of the following options:
	1. Press 1 to check balance
	2. Press 2 to deposit money
	3. Press 3 to withdraw money
	4. Press 4 to end the transaction
3. Keep printing the above options, till the user input option - 4
4. While depositing, make sure to handle negative values and print out updated balance after each deposit.
5. While withdrawing, make sure the balance doesn't go to negative and print out updated balance after each deposit. You could also add a check to maintain minimum balance.
6. Concepts to use for this program:
	1. Scanner
	2. while loop
	3. case statement
	4. if ,else blocks
	5. These are just some hints, you may use any concepts to accomplish the assignment 


### Assignment 31 (07/28)
**Utility Classes**
1. Practice all the programs in the class.
2. Check how to create a Date, Calendar object
3. Play around with the Scanner class and take inputs from user and perform operations like additions and subtraction

### Assignment 30 (07/27)
**String Buffer, String Builder, Math class**
1. Try out all the programs of Assignment 29 using StringBuffer.
2. From numbers 1 to 100, :
	a. Use the Math class to get square root of all numbers
	b. Once you have the result, round it up to an integer and find factorial of that number.
	c. Print the time taken for your program.

### Assignment 29 (07/26)
**String Assignment Programs**
1. Length of each word in the String Array
	a. Input : String a[]= {"hello students","good morning"};
	b. Output
		hello - 5
		students - 8
		good - 4
		morning - 7
2. Print names starting with "Ro"
	a. Input: String names[] = {"Abhishek","Roopa","Rohit","Rishi","Rohan","Vinod","Ronit","Naresh"}
	b. Output:
3. Print names which contain "sh"
	a. Input: String names[] = {"Abhishek","Roopa","Rohit","Rishi","Rohan","Vinod","Ronit","Naresh"}
	b. Output:	
4. Write a Java program to reverse a String, do not use any direct methods
	a. Input : name
	b. Output : eman	


### Assignment 28 (07/25)
**String methods in Java**
1. Understand getChars() method of the String class and implement a small program on it.
2. Understand regionMatches() method of the String class and implement a small program on it.
3. Practice all the methods discussed in the class, try out sample programs
4. Understand the difference between string comparisions using == and equals method


### Assignment 27 (07/24)
**Strings in Java**
1. Create a simple program to store the details of a users aadhar details
	a. Name Attributes  : first name, middle name, last name
	b. Age
	c. Gender
	d. Date of birth
	e. Address : Address line 1 ,Address line 2, Address line 3, Landmark
	f. City
	g. Pincode
	h. Country
	i. Aadhar Name
	j. Phone Number
2. Print out the details in a formatted manner:
	a. The name of the user is : <full_name_> and age is : <age>
	b. The user's date of birth according to Aadhar is : <date_of_birth> and gender is : <gender>
	b. The address of the user is: 	
	c. The phone number of the user is:


### Assignment 26 (07/21)
**Checked vs Unchecked Exception**
1. Take a look at all the exception handling programs, checked and unchecked exceptions discused in the class.
2. Convert 2 of the exceptions from the Railway example to Checked and Unchecked Exceptions and see how it impacts the program


### Assignment 24 & 25 (07/19 & 07/20)
**Exception Handling In Java**
1. Take a look at all the exception handling programs discused in the class.
2. Add 2 more exception classes to the TestRailwayExceptions program we discussed in the class.
3. The exception classes could be:
	a. PaymentGatewayNotAvailableException
	b. InsufficientFundsException

### Assignment 23 (07/18)
**High Level Overview of an application**
1. Look at the discussion we had in the class to see how an application is developed



### Assignment 22 (07/17)
**Packages, Import statements and Access modifiers and how they behave in different cases**
1. Practice all the programs discussed in the class + Packages, Import statements and Access modifiers
2. Updating the Employee class to understand access modifiers
	a. Create 4 methods, one of each type - public, private, protected and default.
	b. Create sub-class in same package and try to access these methods.
	c. Create non-sub-class in same package and try to access these methods.
	d. Create sub-class in different package and try to access these methods.
	e. Create non-sub-class in different package and try to access these methods.


### Assignment 21 (07/13)
***Interfaces and Rules for interfaces*
1. Practice all the programs discussed in the class + concept of Interfaces and Rules for interfaces
2. Give a diagram representing classes, abstract classes, interfaces and depict the relation between them for the CricketPlayersUsingInterfaces Example.
	a. Use a box for a class
	b. Use a box marked with A for an abstract class
	c. Use a oval shape for depicting interfaces
	c. Use a bold line to show inheritance
	d. Use a dotted line to show interfaces
3. Practice and Run the CricketPlayersUsingInterfaces program.
4. Try out the  Banking System  example.


### Assignment 20 (07/12)
***Abstract classes, abstract methods and abstract rules*
1. Practice all the programs discussed in the class + concept of Abstract classes, abstract methods
2. Try exploring all the different rules with Abstract classes and abstract methods.


### Assignment 19 (07/11)
***Inheritance, Overriding, Super with methods, super with constructors*
1. Practice all the programs discussed in the class + concept of overriding, super keywords
2. Try exploring the Multi Level Constructors,Run time polymorphism present as part of the Java Theory_8.docx file.



### Assignment 18 (07/10)
***Inheritance, Overriding*
1. Practice all the programs discussed in the class + concept of overriding
2. Revise the questions and answers on the https://github.com/trainings-weblinxsolutions/batch-june-2023/blob/master/src/resources/interview_questions/QuestionsAndAnswers.docx

### Assignment 17 (07/07)
**Inheritance Continued, Downcasting, Private access modifier**
1. Practice all the programs discussed in the class + concept of inheritance, downcasting and Private access modifier
2. Update the ClassDataValidation so that we cannot change the values of marks and section directly.



### Assignment 16 (07/06)
**Class Object Related Programs, Inheritance Basics**
1. Practice all the programs discussed in the class + concept of inheritance
2. To understand inheritance, use the Vehicle class as a parent class and create a Car class, Bicycle class as child classes and create a few common attributes and methods to play around.


### Assignment 15 (07/05)
**Final, static, class composition**
1. Practice all the programs discussed in the class.
2. To understand class composition use Supermarket as a base and create multiple classes like (Electronics, Grocery) and build a small program.


### Assignment 14 (07/03)
**Introducing IDE, Assignment Program**
1. Print all prime numbers between 1 to 200.
2. Setup IDE on your machines. Sample IDE - Eclipse, IntelliJ, STS



### Assignment 13 (06/30)
**Call By Value, Call By Reference, Returning Objects and Recursion**
1. Create a class Employee,
	* With age, salaryPerDay and noOfDaysWorking attributes
	* A method to compute monthly salary, which will return the monthly salary which is calculated as salaryPerDay*noOfDaysWorking
	* If age is >40, add an extra bonus of 100 per working day to the monthly salary. If age is >60, add an extra bonus of 200 per working day to the monthly salary.
	* Create multiple employees with the following data. (Values are comma separated - first value is age, second is salaryPerDay, third is noOfDaysWorking)
		*  employee1 - (26, 1000, 27)
		*  employee2 - (39, 1250, 25)
		*  employee3 - (41, 1100, 29)
		*  employee4 - (53, 1050, 26)
		*  employee5 - (62, 1150, 24)
	* Print out the monthly salary for each employee and find out the employee with maximum salary.
2. Print out Fibonaaci Series upto a given number using recursion.


### Assignment 12 (06/29)
**Methods with parameters, constructors and parameterized constructors**
1. Practice creating Methods with parameters, constructors and parameterized constructors as discussed in the class.
2. In the CalculatorDemo.java file, add methods - multiply, divide and subtract
	1. The multiply method should take 3 int parameters and return an int
	2. The divide method should take 2  double  parameters and return an int
	3. The subtract method should take 2 int parameters and return an int
	


### Assignment 11 (06/28)
**Class and Objects**
1. Practice creating classes , multiple objects, methods (with no return and with return)
2. Assignment on Classes and objects
	1. Create a Student class with age and noOfFriends.
	2. Create atleast 5 student objects.
	3. Print sum of all noOfFriends.
	4. In the class, create a method which returns noOfFriends.
	




### Assignment 10 (06/27)
**Common Programs asked during interviews**
1. Print all print numbers between 2 to 100.
2. Go through the basics of class/objects.


### Assignment 9 (06/26)
**Common Programs asked during interviews**
1. Find out if a number is prime or not using Java.
2. Print the Fibonaaci series using Java upto a given number.
3. Swap two variables without using a temporary variable. (Hint : Use bitwise operators)



### Assignment 8 (06/23)
**Arrays In Java, Try few programs**
1. Go through the arrays lecture, notes and programs.
2. Write a program to check if two arrays are equal or not. Eg 1: array1  = {2,3,4,5} , array2 = {2,3,4,5} , output should be true. Eg 2: array1  = {2,3,4,6} , array2 = {2,3,4,5} , output should be false.
3. Write a program to find the sum of numbers at even and odd indices in array and then print out the which sum is the greatest.
	* Eg: array = {4,5,2,8,3,6}
	* Sum at even indices = 4+2+3 = 9 (4 is at index 0, 2 is at index 2, 3 is at index 4)
	* Sum at odd  indices = 5+8+6 = 19 (5 is at index 1, 8 is at index 3, 6 is at index 5)
	* O/p should be: Sum at odd indices is greatest.

### Assignment 7 (06/22)
**Iteration Statements - for, while, do while**
1. Go through all the Iteration Statements discussed in the class
2. Write a program to calculate factorial of a number using while loop.
3. Write a program to print only the even numbers from 1 to 100.

### Assignment 6 (06/21)
**Selection Statements - if, nested if, if else ladder, switch**
1. Go through all the Selection Statements discussed in the class
2. Write a program using switch statement to print day of the week
3. Write the above program using if else ladder


### Assignment 5 (06/20)
**Arithmetic,BitWise ,Relational ,Boolean Logical ,Ternary Operators**
1. Go through all the Operators shared in the doc.
2. Take a look at the respective Java files and use the different operators.
3. I'll be adding placeholders in the Java files for you to try out things
4. Try to convert a number to binary and viceversa. It will help you in interviews and in general

### Assignment 4 (06/19)
**Arithmetic Operators**
1. Go through the Arithmetic Operators shared in the doc
2. Play around with the ++, -- , % operators as these are new


### Assignment 3 (06/16)
**Java Installation**
1. Please install Java on your machines
2. Try to go over the Theory doc for Java **(src/resources/documents/JavaTheory_1.docx)**
3. Try to run the first sample program on your machine
4. Change the print statement to print your name.

### Assignment 2 (06/15)
**GitHub Repository creation**
**Steps**
1. Try creating new branches on local repository
2. Create new files under branches
3. Merge branches
4. Create a repository on github (https://github.com/)
5. Follow the document **(src/resources/documents/GitBasics.docx)** with instructions to push changes from local repo to GitHub
6. Once done, send in your first project link created


### Assignment 1 (06/14)
**Understanding Git and exploring basic commands**
**Steps**
1. Install Git on local
2. Create account on GitHub
3. Create a sample folder on your local machine
4. Add a few files and explore below commands
	1. git init, git status, git add, git commit, git log
	2. git init, git status, git add, git commit, git log
	3. git init, git status, git add, git commit, git log
	4. git init, git status, git add, git commit, git log
5. Follow the document **(src/resources/documents/GitBasics.docx)** with instructions
**Note:** For the initial test you can create any sample files  
