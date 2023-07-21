# JavaScript Notes

## Section 1: JavaScript Basics
### 1. JavaScript - Introduction
- Lightweight, cross platform, object-oriented programming language.
- Doesn't takes lots of memories to run the code.
- Can be run to various of platform.
- Object Oriented.
- 1 of the 3 core of web development tech.
- Javascript used to add dynamic effect on the content.
- JavaScript-based Frontend Frameworks: ReactJS, Angular, EmberJS, VueJS
- Javascript-based Backend Frameworks: NodeJS, MeteorJS, BakcboneJS

### 2. JavaScript - Introduction to Variables, Operators, and Expressions
- Variables: a way to store some data for later use.
``` javascript
console.clear();
var num1 = 3;
var num2 = 4;
var num3 = 6;

// Save sum of num1, num2 and num3 in a variable named sum.
var sum = num1 + num2 + num3;

// To print on the console
console.log(sum);

```

### 3. JavaScript - Variables
- How to create variables and what are the rules.
```javascript
// Clear all the output on the console.
console.clear();

var firstNum = 10;
console.log(firstNum);

var secondNum = 15
console.log(secondNum);
```
- Three ways of writing a variable
```javascript
// Camel case (Recommended)
var firstNum

// Pascal case
var FirstNum

// Snake case
var first_num
```
- Rules for naming JS variable:
```javascript
// Name can contain letters, digits, _ and $
var mySubject1. Math$

// Names cannot start with a digit.
var 6maths; (error)

// Name can start with an _ or $
var _subjectMarks;

//Names are case-sensitive.
var x, X; (Both different variables)

// Names cannot be reserved keywords.
var var; (error for var)
```


## Section 2: Data Types
### 4. JavaScript - Numbers
```javascript
console.clear()

var num1 = 10; // Integer
var num2 = 10.9 // Decimal Number

console.log(typeof(num1)) // Output: "number"
console.log(typeof(num2)) // Output: "number"

// Addition
var num 3 = 15;
var sum = num3 + num1 + num2;
console.log(sum); // Output: 35.9

// Substraction
var diff = num3 - num1;
console.log(diff); // Output: 5

// Multiplication
var mul = num3 * num1;
console.log(mul); // Output: 150

// Division
var div = num3/num1;
console.log(div) // Output: 1.5

var divByZero = num3 / 0;
console.log(divByZero) // Output: Infinity
console.log(typeof(divByZero)); // Output: "number"

var mulByString = num3 * A;
console.log(mulByString); // Output: NaN
console.log(typeof(mulByString)); // Output: "number"

```

### 5. JavaScript - In-Built Number Functions
- How to convert string to a number and vice versa.
```javascript
var num1 = 10;
var num2 = 20.3

// toString() - take number as input and returns a string
console.log(num1.toString()); // Output: "10"
console.log(num2.toString()); // Output: "20.3"


var strNum1 = "10";
var strNum2 = "11.5"
var strNum3 = "ABC"

// parseInt() - take string numeral as input and returns a number
console.log(parseInt(strNum1)); // Output: 10
console.log(parseInt(strNum2)); // Output: 11
console.log(parseInt(strNum3)); // Output: NaN

// parseFloat() - take string as numeral as input and returns a number.
console.log(parseFloat(strNum2)); // Output: 11.5
console.log(parseFloat(strNum3)); // Output: NaN

// to Fixed() - takes a floating number and rounds it off to given position
var strFloat = 87.987653
console.log(strFloat.toFixed()) // Output: "88"
console.log(strFloat.toFixed(2)) // Output: "87.99"
console.log(strFloat.toFixed(5)) // Output "87.98765"

```

### 6. JavaScript - Strings
-
```javascript
var myFirstString = "I love JavaScript"
console.log(typeof(myFirstString)) // Output: "string"

var mySecondString = 'We will learn JavaScript together'
console.log(typeof(mySecondString)) // Output: "string"

// What if my string contains a double uote
var doubleQuoteString = "This is a "JavaScript" string" //(error)
var doubleQuoteString = "This is a \"JavaScript" string\" // (not error)
console.log(doubleQuotesString) // Output: "This is a 'Javascript' string"

// What if my string contains a single quote
var singleuotesString = 'This is a \'Javascript\' string'
console.log(singleQuotesString) // Output: "Ths us a 'JavaScript' string"

// If like below here won't get any error
var doubleuotesString2 = "This is a 'JavaScript' string"
var singlequotesString2 = 'This is a "JavaScript" string'
```

### 7. JavaScript - In-Built String Functions Part 1
- When given negative index, it starts from the back of the string.
```javascript
var myFirstString = "This is a string for Javascript string function"

// Returns the length of the string
console.log(MyFirstString.length) / Output: 48

// Find index of a string inside another string
console.log(myFirstString.indexOf('Javascript')) // Output: 2
console.log(myFirstString.indexOf('This')) // Output: 0

// Find last index of a string inside another string
console.log(myFirstString.lastIndexOf('Javascript')) // Output: 50
console.log(myFirstString.lastIndexOf('This')) // Output: 0

// Get a part of our string slice( start, end)
console.log(myFirstString.slice(0, 5)) // Output: "This "
console.log(myFirstString.slice(21, 31)) // "Javascript"
console.log(myFirstString.slice(-10)) // Output: "Javascript"
console.log(myFirstString.slice(5)) // Output: "is a string for Javascript string functions, Javascript"

// Get sub string function - substr(startPos, length)
console.log(myFirstString.substr(0, 4)) // "This"
console.log(myFirstString.substr(21, 10)) // "Javascript"
console.log(myFirstString.substr(21)) // "Javascript string functions, Javascript"
```

### 8. JavaScript - In-Built String Functions Part 2
- Functions to convert string to upper and lower case.
- Remove unwanted white spaces
- And many more.
```javascript
var exampleString = "This is Javascript tutorial"

// toUpperCase() - It converts our string -> uppercase characters.
console.log(exampleString.toUpperCase()) // Output: "THIS IS JAVASCRIPT TUTORIAL"

// toLowerCase() - It converts our string -> lowercase characters
console.log(exampleString.toLowerCase()) // Output: "this is javascript tutorial"

// concat() - It merges two or more strings
var firstName = "Javascript"
var lastName = "Playground"
console.log(exampleString.concat(firstname)) // Output: "This is Javascript tutorialJavascript"
consolelog(exampleString.concat(' ', firstName, ' ', lastName)) // Output: "This is Javascript tutorial Javascript Playground

// We can also use '+' to concat two or more strings
console.log(firstName + ' ' + lastName + ' ' exampleString)// Output: "Javascript Playground This is Javascript tutorial"

// trim() - It removes extra spaces
var extraSpaceString = '         myString          '
console.log(extraSpaceString.trim()) // Output "myString"

var extraSpaceStringExample2 = '         my String          '
console.log(extraSpaceStringExample2.trim()) // Output: "m string"

// charAt() -> this take a position as an arg and retuns the character at that position
var charAtExampleString = 'This is my test string'
console.log(charAtExampleString.charAt(5)) // Output: "i"
console.log(charAtExampleString.charAt(11)) // Output: "t"

// split() - splits our string on the basis of the arguments passed
var sampleString = "This is my sample string"
console.log(sampleString.split(' ')) // Output: ["This", "is", "my", "sample", "string"]

var sampleString2 = "This,is,my,sample,string"
console.log(sampleString2.split(',')) // Output: ["This", "is", "my", "sample", "string"]

var sampleString3 = "This is awesome"
console.log(sampleString3.split()) // Output: [:This is awesome"]
```

### 9. JavaScript - Null and Undefined Values
- Undefined - Variable has been declared but has no value yet.
- Null - A value that is assigned to a variale to shows that the variale has no value.
```javascript
console.clear()

var myVar
console.log(myVar) // Output: undefined

myVar = null
console.Log(myVar) // Output: null
```


## Section 3: Conditional Statements
### 10. JavaScript - Conditional Statement: If-else
```javascript
console.clear()

if(7 > 5) {
  console.log(true)
}
// Output: true

if(5 > 7 {
  console.log(true)
} else {
  console.log(false)
}
// Output: false

if(5 > 7){
  console.log('5 > 7')
} else if(7 > 8) {
  console.log('7 > 8')
} else {
  console.log('Nothing')
}
// Output: "Nothing"
```

### 11. JavaScript - Conditional Statement: Switch
```javascript
console.clear()

var currentDay = 'Mon'

if(currentDay === 'Mon') {
  console.log('Timings: 10:00-6:00')
} else if(currentDay === 'Tue') {
  console.log(Timings: 09:00-05:00)
} else if(currentDay === 'Wed') {
  console.log(Timings: 09:30-05:30)
} else if(currentDay === 'Thu') {
  console.log(Timings: 10:15-06:15)
} else if(currentDay === 'Fri') {
  console.log(Timings: 09:05-05:05)
} else if(currentDay === 'Sat') {
  console.log(Timings: 09:00-05:00)
} else if(currentDay === Sun') {
  console.log(Timings: 09:00-01:00)
}
// Output: "Timings: 10:00-06:00"


switch(currentDay) {
    case 'Mon':
        console.log('Timings: 10:00-6:00')
        break;
    case 'Tue':
         console.log(Timings: 09:00-05:00)
        break;
    case 'Wed':
        console.log(Timings: 09:30-05:30)
        break;
    case 'Thu':
        console.log(Timings: 10:15-06:15)
        break;
    case 'Fri':
        console.log(Timings: 09:05-05:05)
        break;
    case 'Sat':
        console.log(Timings: 09:00-05:00)
        break;
    case 'Sun':
        console.log(Timings: 09:00-01:00)
        break;
// Output: "Timings: 10:00-06:00"
```


## Section 4: Operators
### 12. JavaScript - Arithmetic Operators
- Addition "+"
- Subtraction: "-"
- Multiplication: "*"
- Division: "/"
- Modulus: "%"
- Increment: "++"
- Decrement: "--"
- Post Increment: Use the value first then the value increase.
- Pre-Increment: Value increased, then the value is used.

```javascript
console.clear()

var num1 = 10;
var num2 = 15;
var num3 = 20;

// Addition
console.log(num1 + num2) // Output: 25
console.log(num1 + num2 + num3 // Output: 45

// Subtraction
console.log(num2 - num1) // Output: 5
console.log(num3 - num2 - num1 // Output: -5

// Multiplication
console.log(num1 * num2) // Output: 150

// Division
console.log(num2/num1) // Output: 1.5

// Modulus
console.log(num2 % num1) // Output: 5

// Increment - Post and Pre
console.log(num1++) // Output: 10
console.log(num1) // Output: 11

console.log(++num1) // Output: 11
console.log(num1 // Output: 11

// Decrement - Post and Pre
consolde.log(num1--) // Output: 10
console.log(num1) // Output: 11

console.log(--num1) // Output: 9
console.log(num1) // Output: 9
```

### 13. JavaScript - Assignment Operators
- Used to assign values in our variables
- =, +=, -=, *=, /=, %=
- 
```javascript
console.clear()

var num1 = 15;
var num2 = 30;

// = (Just assigning value to the variable
num1 = 20;

// +=
num1 += 10 // num1 = num1 + 10
console.log(num1) // Output: 25

// -=
num1 -= 10; // num1 = num1 - 10
console.log(num1) // Output: 5

// *=
num1 *= 20 // num1 = num1 * 20
console.log(num1) // Output: 300

// /=
num1 /= 10; // num1 = num1 / 10
console.log(num1) // Output: 1.5

/ %=
num1 %= 10 // num1 = num1 % 10
console.log(num1) // Output: 5
```

### 14. JavaScript - Comparison and Logical Operators
- && = AND Operator
- || = OR Operator
- ! = NOT Operator
- Ternary Operator: (expression) ? a : b

```javascript
console.clear()

if(5 == '5') {
  console.log(true)}
}
// Output: true
// Double equal prints true as it only compares the values but not the type. To compare the value and the data type, it needed to be 3 equal sign.

if(5 === '5') {
  console.log(true)}
} else {
  console.log(false)
}
// Output: true

if(5 != '5') {
  console.log(true)}
} else {
  console.log(false)
}
// Output: false

if(5 !== '5') {
  console.log(true)}
} else {
  console.log(false)
}
// Output: true

if(15 < 10) {
  console.log(true)}
} else {
  console.log(false)
}
// Output: false

if(15 <= 15) {
  console.log(true)}
} else {
  console.log(false)
}
// Output: true

if(15 > 15) {
  console.log(true)}
} else {
  console.log(false)
}
// Output: false

if(15 >= 15 {
  console.log(true)}
} else {
  console.log(false)
}
// Output: true


// Ternary Operator: (expression) ? a : b
2 < 3 ? console.log(true) : console.log(false)
// Output: true
```


## Section 5: Type Coercion
### 15. JavaScript - Implicit Type Coercion
- Conversion of a value from one type to another type.

```javascript
console.clear()

var mStr = 'Hello'
var mNum = 5
var mSum = mStr + mNum

console.log(mSum); // Output: "Hello5"
console.log(typeof(msum)); // Output: "string"

console.log('hola' + true) // Output: "holatrue"
console.log(typeof('hola + true)) // Output: "string"

console.log(null + 'hola') // Output: "nullhola"
console.log(typeof(null + 'hola')) // Output: "string"

console.log(50 + 'hola') // Output: "50hola"
console.log(typeof(50 + 'hola')) // Output: "string"

var mValue = +'2'
console.log('2') // Output: "2"
console.log(+'2') // Output: 2
console.log(typeof(mValue)) // Output: "number"
console.log(-'2') // Output: -2
console.log(typeof(-'2')) // Output: "number"

var mValue = 2>='2'
console.log(mValue) // Output: true
console.log(typeof(mValue)) // Output: "boolean"

if(true) {
  console.log('True')
} else {
  console.log('False')
}
// Output: "True"

if(5) {
  console.log('True')
} else {
  console.log('False')
}
// Output: "True"

if('Apple') {
  console.log('True')
} else {
  console.log('False')
}
// Output: "True"

if(0) {
  console.log('True')
} else {
  console.log('False')
}
// Output: "False"

if(null) {
  console.log('True')
} else {
  console.log('False')
}
// Output: "False"

if(undefined) {
  console.log('True')
} else {
  console.log('False')
}
// Output: "False"

if('') {
  console.log('True')
} else {
  console.log('False')
}
// Output: "False"
```

### 16. JavaScript - Implicit Type Coercion
- Conversion of the data type of a value to another programmatically.

```javascript
console.clear()

// Convert to String
var mNum = 15
console.log(typeof(String(mNum))) // Output: "String"
console.log(typeof(String(true))) // Output: "String"
console.log(typeof(String(-98.10))) // Output: "String"
console.log(typeof(String(null))) // Output: "String"
console.log(typeof(String(undefined))) // Output: "String"

// Convert to Number
console.log(typeof(Number('2'))) // Output: "number"
console.log(Number(true)) // Output: 1
console.log(typeof(Number(true))) // Output: "number"
console.log(Number(false)) // Output: 0
console.log(typeof(Number(false))) // Output: "number"
console.log(Number('-90.234') // Output: -90.234
console.log(typeof(Number('-90.234'))) // Output: "number"
console.log(Number('Apple') // Output: NaN
console.log(typeof(Number('Apple'))) // Output: "number"

// To Boolean
console.log(Boolean(true)) // Output: true
console.log(typeof(Boolean(true)) // Output: "boolean"
console.log(Boolean(1)) // Output: true
console.log(typeof(Boolean(1))) // Output: "boolean"
console.log(Boolean(0)) // Output: false
console.log(typeof(Boolean(0))) // Output: "boolean"
console.log(Boolean('Apple')) // Output: true
console.log(typeof(Boolean('Apple'))) // Output: "boolean"
console.log(Boolean(null)) // Output: false
console.log(typeof(Boolean(null))) // Output: "boolean"
console.log(Boolean(undefined)) // Output: false
console.log(typeof(Boolean(undefined))) // Output: "boolean"
console.log(Boolean('')) // Output: false
console.log(typeof(Boolean(''))) // Output: "boolean"
```


## Section 6: Objects and Arrays
### 17. JavaScript - Objects
- What if our data is more complex such as list of scores in an exam.
- An object is a collection of key-value pair and closed in a curly bracket.
- Could be primitive data type, object or a function.

```javascript
console.clear()

var mCars= {
  "p1" : "35 kmph",
  "gallardo" : "320 kmph",
  "veyron" : "409 kmph",
  "agera" : "429 kmph"
}
console.log(mCars) // It will printed the objects
console.log(typeof(mCars)) // Output: "Object"

var mAgera = {
  name: " Agera",
  manufacturer: {
    name: "Koenigsegg"
    location: "Sweden"
  },
  topSpeed: 429,
  color: "Black"
  spoilers: false
  applyBrakes: function() {
    setTimeOut(function() {
      console.log('Car Stopped');
  }, 5000)
}
console.log(mAgera.name) // Output: "Agera"
console.log(mAgera.topSpeed) // Output: 429
console.log(mAgera.manufacturer) // Output: (it will print the object of manufacturer)
console.log(mAgera.manufacturer.name) // Output: "Koenigsegg"
console.log(mAgera.applyBrakes)) // Output: undefined, "Car Stopped"
console.log(mAgera.applyBrakes) // Output: (print all the function), "Car Stopped"
```

### 18. JavaScript - Arrays Part 1
- Arrays is special types of object that stores a list of data.
- Regular ojects use keys to access data.
- Arrays use position to access data.
- **_push_** will add at the back of the array.
- **_pop_** will remove the last value in the array
```javascript
console.clear()

var mFriend = ['Shaw', 'Clara', 'Vab', 'Kun', 'Jacob', 'Dina']
console.log(mFriend) // Output: ["Shaw", "Clara", "Vab", "Kun", "Jacob", "Dina"]
console.log(typeof(mFriends)) // Output: "Object"
console.log(mFriends[2]) // Output: "Vab"
console.log(mFirends[0]) // Output: "Shaw"
console.log(mFriends[4]) // Output: "Jacob"

// Update a value
mFriends[0] = 'Shawn'
console.log(mFriends) // Output: ["Shawn", "Clara", "Vab", "Kun", "Jacob", "Dina"]

// Add more items
mFriends[6] = 'Alan'
console.log(mFirends) // Output: ["Shawn", "Clara", "Vab", "Kun", "Jacob", "Dina", "Alan"]

mFriends[10] = 'Tiffany'
console.log(mFriends) // Output: ["Shawn", "Clara", "Vab", "Kun", "Jacob", "Dina", "Alan", undefined, undefined, undefined, "Tiffany"]

mFriends[mFriends.length] = 'Rob'
console.log(mFriends) // Output: ["Shawn", "Clara", "Vab", "Kun", "Jacob", "Dina", "Alan", undefined, undefined, undefined, "Tiffany", "Rob"]

// After we remove the undefined
mFriends.push('Jack')
console.log(mFriends) // Output: ["Shawn", "Clara", "Vab", "Kun", "Jacob", "Dina", "Alan", "Rob", "Jack"]

// Delete a value
var mName = mFriends.pop()
console.log(mName) // Output "JacK"
console.log(mFriends) // Output: ["Shawn", "Clara", "Vab", "Kun", "Jacob", "Dina", "Alan", "Rob"]
```

### 19. JavaScript - Arrays Part 2

```javascript
var mFriend = ['Shaw', 'Clara', 'Vab', 'Kun', 'Jacob', 'Dina']
console.log(mFriend) // Output: ["Shaw", "Clara", "Vab", "Kun", "Jacob", "Dina"]

// 1st tells where to start
// 2nd tells how many items to be deleted.
// 3rd and 4th and so on tels what items to be added.
mFriends.splice(3, 0, 'Donna', 'Rachel)
console.log(mFriends) // Output: ["Shaw", "Clara", "Vab", "Donna", "Rachel", "Kun", "Jacob", "Dina"]

mFriends.splice(0, 0, 'Harvey')
console.log(mFriends) // Output: ["Harvey", "Shaw", "Clara", "Vab", "Donna", "Rachel", "Kun", "Jacob", "Dina"]

//Delete item at specifcic position
mFriends.splice(2, 1)
console.log(mFriends) // Output: ["Harvey", "Shaw", "Vab", "Donna", "Rachel", "Kun", "Jacob", "Dina"]

mFriends.splice(0, 2)
console.log(mFriends) // Output: ["Vab", "Donna", "Rachel", "Kun", "Jacob", "Dina"]

// Concatenation
var mOfficeFriends = ['Nina', 'Aron', 'Katie', 'Vic', 'Paula']
var mAllFriends = mFriends.concat(mOfficeFriends)

console.log(mFriends) // Output: ["Vab", "Donna", "Rachel", "Kun", "Jacob", "Dina"]
console.log(mOfficeFriends) // Output: ["Nina", "Aron", "Katie", "Vic", "Paula"]
console.log(mAllFriends) // Output: ["Vab", "Donna", "Rachel", "Kun", "Jacob", "Dina", "Nina", "Aron", "Katie", "Vic", "Paula"]

// Sorting Ascending and Descending
mAllFriends.sort() // Sort the Array in ascending order
console.log(mAllFriends) // Output: ["Aron", "Dina", "Donna", "Jacob", "Katie", "Kun", "Nina", "Paula", "Rachel", "Vab", "Vic"]

mAllFriends.revers() // Sort in descending order
console.log(mAllFriends) // Output: ["Vic", "Vab", "Rachel", "Paula", "Nina", "Kun", "Katie", "Jacob", "Donna", "Dina", "Aron"]
```


## Section 7: Loops
### 20. JavaScript - Introduction to Loops
- The repetition of code is called _Loop_.
- Each repetition is called _Iteraation_
- It will running the same line of codes for a certain number of times is called loop.
- Javascript offers 2 loop : While Loop and For Loop
- When you know, how many times your loop needs to iterate then you can use _For Loop_
- When you have the kind of loop where you need to stop the loop based on certain condition, you can use _While Loop_

### 21. JavaScript - While Loop
- Iterates a block of codes until a specific condition met to stop the loop.

```javascript
console.clear()

var mValue = 0
while(mValue <= 50) {
  mValue++
}
console.log(mValue) // Output: 51
```

### 22. JavaScript - For Loops
- Iterates block of codes for a specific number of times.
- _break_ keyword will exit the loop
- _continue_ starts the next iteration without continue any further.

```javascript
console.clear()

var mList = [1, 2, 3, 4, 5]
var pos;

for (pos = 0; pos < mList.length; pos++) {
  console.log('Posiion => ' + pos + ' Value => ' + mList[pos])
}
// Output:
// "Position => 0 Value => 1"
// "Position => 1 Value => 2"
// "Position => 2 Value => 3"
// "Position => 3 Value => 4"
// "Position => 4 Value => 5"

// Break keyword
for (pos = 0; pos < mList.length; pos++) {
  if(pos >= 3) {
    break
  }
  console.log('Posiion => ' + pos + ' Value => ' + mList[pos])
}
// Output:
// "Position => 0 Value => 1"
// "Position => 1 Value => 2"
// "Position => 2 Value => 3"

// Continue keyword (Print value at even value)
for (pos = 0; pos < mList.length; pos++) {
  if(pos % 2 !== 0) {
    continue
  }
  console.log('Posiion => ' + pos + ' Value => ' + mList[pos])
}
// Output:
// "Position => 0 Value => 1"
// "Position => 2 Value => 3"
// "Position => 4 Value => 5"

// Continue keyword (Print value at odd value)
for (pos = 0; pos < mList.length; pos++) {
  if(pos % 2 === 0) {
    continue
  }
  console.log('Posiion => ' + pos + ' Value => ' + mList[pos])
}
// Output:
// "Position => 1 Value => 2"
// "Position => 3 Value => 4"
```


## Section 8: Functions and Hoisting
### 23. JavaScript - Functions
- function functionName (param1, param2, ......, paramN) { // block of code }

```javascript
console.clear()

// Function to print sums of two numbers
function mSum() {
  var num1 = 10;
  var num2 = 20;
  var sum = num1 + num2;
  console.log(sum)
}
mSum() // Output: 30

// --------------------------------------------------------------------------------------

function mSum() {
  var num1 = 10;
  var num2 = 20;
  var sum = num1 + num2;

  return sum
}
console.log(mSum()) // Output: 30

// --------------------------------------------------------------------------------------

function mSum() {
  var num1 = 10;
  var num2 = 20;
  var sum = num1 + num2;

  console.log('Im a print statement'
}
console.log(mSum()) // Output: "I'm a print statement", undefined
// Undefined because nothing is returned.

// --------------------------------------------------------------------------------------

function mSum() {
  var num1 = 40;
  var num2 = 20;
  var sum = num1 + num2;

  return sum
  console.log('Im a print statement')
}
var totalSum = 100 + mSum()
console.log(totalSum); // Output: 160
```

### 24. JavaScript - Function Arguments
- How to pass values in our function.
- These values are called function arguments

```javascript
console.clear()

function greetings() {
  console.log('Welcome');
}
greetings() // Output: "Welcome"

// --------------------------------------------------------------------------------------

function greetings(personName) {
  console.log('Welcome '+ personName);
}
greetings() // Output: "Welcome undefined"

// --------------------------------------------------------------------------------------

function greetings(personName) {
  console.log('Welcome '+ personName);
}
greetings('Qaifi) // Output: "Welcome Qaifi"
greetings('Nate') // Output: "Welcome Nate"
greetings('Vijay') // Output: "Welcome Vijay"

// --------------------------------------------------------------------------------------

function totalSum(num1, num2) {
  console.log('num1 => ' + num1);
  console.log('num2 => ' + num2);
  console.log(num1 + num2)
}
totalSum(); // Output: "num1 => undefined", "num2 => undefined", NaN

// --------------------------------------------------------------------------------------

function totalSum(num1, num2) {
  console.log(num1 + num2)
}
totalSum(2, 7); // Output: 9
totalSum(22, 38) // Output: 60

// --------------------------------------------------------------------------------------

function totalSum(num1, num2, num3) {
  console.log(num1 + num2)
}
totalSum(2, 7); // Output: 9
totalSum(22, 38) // Output: 60 (num3 => undefined)

// --------------------------------------------------------------------------------------

function totalSum(num1, num2, num3) {
  console.log('num1 => ' + num1);
  console.log('num2 => ' + num2);
  console.log('num2 => ' + num3);
  console.log(num1 + num2 + num3)
}
totalSum(22, 38, 33. 50, 3, 40, 58); // Output: "num1 => 22", "num2 => 38, "num3 => 33", 93
// Even though we passed many parameters than it should be, JavaScript only acknowledge the values.
// But if we give less, it will print NaN
```

### 25. JavaScript - Scope and Environment
- Very important as asked in many interviews.
- **Scope:** The part of the program where a variable or a function is visible/accessible.
- **Variable:** Outside all the functions and locks are available throughout the code. These are called _Global Variables_.
- Consider the code below:
```javascript
var num1 = 10; //num1 is a Global Variable
function sum(num2) {
  var total = num1 + num2; // total is a local variable
  console.log(total); // Local Scope of num1
}
console.log(num1)
// Global Scope of num1
```
- More examples:
```javascript
console.clear();

var num1 = 10 // Global Variable - It can be accessed anywhere, outside and inside of the function

function sum(num2) {
  var total;
  console.log(num1 + num2); // num2 is the Local Variable as it is only can be accessed only inside this function.
}

console.log(total) // This will give an error as we cannot access the variable inside the function
sum(20) // Output: 30
sum(5)  // Output: 60
```

### 26. JavaScript - Variable Hosting
- Mechanism where variables and functions can be used before declaring them is called Hoisting in JavaScript.
- In terms of code execution, the variables and function declarations are moved to the top of their scope before code execution.
- Javascript has two steps in executing a particular script:
```
Step 1: Creation - Analyze all the code and allocate the memory space for variables and functions
Step 2: Execution 
```
```javascript
// Actual Code
x = "some-string";
console.log(x);
var x;

// Hoisting Effect - What it did behind the scene
var  = undefined; // Since it is not declared yet before, it moves the variable to the top and declare it as undefined first
x = "some-string";
console.log(x);
```

```javascript
num1 = 10;
console.log(num1) // Output: 10
var num1;
console.log(num1) // Output: 10

str1 = "Demo String"
console.log(str1); // Output: "Demo String"
var str1;
console.log(str1); // Output: "Demo String"
```

### 27. JavaScript - Function Hoisting
- Just some tips. It is a bad habit to use a variable before declaring them.
- This is not a feature, but this is how a JavaScript works.
- Without bad habits, we can prevent silent errors and unexpected behavior.

```javascript
console.clear()

// Function can be used before the declaration of the function
sum(5, 10); //  Output: 15 
sum(30, 22); // Output: 52

function sum(num1, num2) {
  console.log(num1 + num2)
}

sum(90, 8) // Output: 98

// --------------------------------------------------------------------------------------

sum(5, 10); //  Output: "error"
sum(30, 22); // Output: "error"

var sum = function(num1, num2) {
  console.log(num1 + num2)
}

sum(90, 8) // Output: 98 (no error)

// --------------------------------------------------------------------------------------

var total = 10;
var sum = function(num1, num2) {
  console.log(total);
  total = num1 + num2;
  var total;
  console.log(total);
}
sum(90, 8)
// Output: undefined, 98, undefined, 108
// The first output is undefined as when it enters the function, JavaScript will initialize "total" as undefined first. So when we printed "total" for the first time, the output would be undefined.
// If we didn't initialize the "total" inside the function, the output would produce the initial value of the total first before the second one.
```


## Section 9: Document Object Model (DOM)
### 28. JavaScript - Introduction to DOM
- When a web page is loaded, the browser creates a Document Object model of the page.
- It is the tree representation of the HTML document. This DOM tree can be modified with the help of JavaScript.
- DOM is the Object Oriented representation of the webpage.
- JavaScript can add new HTML elements and attributes.
- JavaScript can change any HTML elements and attributes on the page.
- JavaScript can change all the CSS styles on the page.
- JavaScript can remove existing HTML elements and attributes.
- JavaScript can add and listen to HTML events like onClick, onScroll etc.
- Assume below HTML and JavaScript code

```
<!--HTML File-->
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <link href="style.css" rel="stylesheet" type="text/css" />
  <title>Testing Coding LMAO</title>

  <script type="text/javascript" src="/script.js">
  </script>

  <script>console.log('This is JavaScript');</script>
</head>

<body style="background-color: lightblue" ;>

  <h1>Hello world</h1>

</body>

</html>
```
```javascript
// JavaScript File

console.log('Script Loaded')
```
- If we inspect the website at the console, we can see that the text "Script Loaded" and "This is JavaScript" is being printed in the console.
- You can edit the JavaScript as what you have learned so far.

### 29. JavaScript - Select HTML Elements
```javascript
getElementById('html-element-id')
// getElementById is a DOM method. It accepts the HTML element Id and returns the HTML element matching that id. For example: document.getElementById('topbar').
// For the string inside the method, you need to pass the ID of the element as the argument. If no element matches the id, then it returns null.
```
```javascript
getElementByClassName('html-class-string')
// getElementsByClassName is a DDOM method. It accepts the HTML class string and returns all the HTML elements matching that class. For example: document.getElementsByClassName('menu')
// For the string inside the method, you need to pass the class string of the elements as an argument. If no elements matches the class then it returns an empty array.
```
```javascript
getElementsByTagName('html-tag-string')
// getElementsByTagName is a DOM method. It accepts the HTML tag string and returns all the HTML elements matching that tag. For example: document.getElementsByTagName('h3')
// For the string inside the method, you need to pass the tag name string as an argument. If no elements match the tag name then it returns an empty array.
```
- Assume the following HTML and JavaScript
- After you run and deploy the web application, when you click inspect and check at the console, you can see the output is being shown.
- You may see all the properties inside the particular tagged or choosen element id, or class or tags.
```html
</head>

<body>
  <header id="topbar">
    <nav>
      <span id="logo">EDYODA</span>
      <span class="menu-item">Flashbytes</span>
      <span class="menu-item">Categories</span>
      <span class="menu-item">Upload Video</span>
    </nav>
  </header>

  <main>
    <section>
      <article class="blog-card">
        <img class="blog-image"
          src="https://edyoda.s3.amazonaws.com/media/blog-images/WhatsApp_Image_2019-06-19_at_17.55.10.jpeg"
          alt="Blog Image" />
        <h3 class="blog-heading">Learn these programming languages in 2019</h3>
        <p class="blog-desc">Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum
          Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor.</p>
      </article>
    </section>
  </main>

  <script type="text/javascript" src="/script.js">
  </script>
</body>

</html>
```
```javascript
console.log('Script Loaded');

// getElementById()
console.log(document.getElementById("topbar"));

// getElementByClassName
console.log(document.getElementsByClassName('blog-card'));

// getElementsByTagName
console.log(document.getElementsByTagName('img'))
```
![Select HTML Elements](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/JavaScript_Language/Media/Select%20HTML%20Elements.PNG)

### 30. JavaScript - Query Selectors
- Query Selectors allow you to use CSS selectors to select HTML elements.
- It is the new way in JavaScript to select HTML elements.
- There are 2 such selectors: querySelector(), querySelectorAll()
- It select the first item that it finds.
- Query selector is new, it is not supported with internet explorer 7 and below.
- If user use these, it will use getElementById() and etc. If use Query Selector will get error.
- getElementById twice faster than Query Selector. But if you wanted to select multiple id, the use query selector.

```javascript
querySelector('css-selector-string')
// Is a DOM method. It accepts the CSS Selector string and returns only the first HTML element matching the query. For example: document.querySelector('#topbar span')
// You need to pass the CSS selector string as an argument. If no elements match the selector string then it returns null.
```
```javascript
querySelectorAll('css-selector-string')
// Is a DOM method. It accepts the CSS Selector string and returns all the HTML elements matching the query. For example: document.querySelectorAll('#topbar span')
// You need to pass the CSS selector string as an argument. If no elements match the selector string then it returns an empty array.
```
- Assume the below HTML, CSS and JavaScript.
- The output will be shown at the console after inspected.
```html
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <link href="style.css" rel="stylesheet" type="text/css" />
  <title>JS - Query Selector</title>
</head>

<body>
  <header id="topbar">
    <nav>
      <span id="logo">EDYODA</span>
      <span class="menu-item">Flashbytes</span>
      <span class="menu-item">Categories</span>
      <span class="menu-item">Upload Video</span>
    </nav>
  </header>

  <main>
    <section>
      <article class="blog-card">
        <img class="blog-image"
          src="https://edyoda.s3.amazonaws.com/media/blog-images/WhatsApp_Image_2019-06-19_at_17.55.10.jpeg"
          alt="Blog Image" />
        <h3 class="blog-heading">Learn these programming languages in 2019</h3>
        <p class="blog-desc">Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum
          Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor.</p>
      </article>
      <article class="blog-card">
        <img src="https://edyoda.s3.amazonaws.com/media/blog-images/learn-artificial-intelligence.jpeg"
          alt="Blog Image" />
        <h3>Get Started with Artificial Intelligence</h3>
        <p class="blog-desc">Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum
          Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor.</p>
      </article>
      <article class="blog-card">
        <img src="https://edyoda.s3.amazonaws.com/media/blog-images/data-mining-an-overview.jpg" alt="Blog Image" />
        <h3>Data Mining: A Detailed Study in 2019</h3>
        <p class="blog-desc">Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum
          Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor. Lorem Ipsum Dolor.</p>
      </article>
    </section>
  </main>

  <script type="text/javascript" src="/script.js">
  </script>
</body>

</html>
```
```css
body {
    margin: 0;
    background-color: #f2f6ff;
}

#topbar {
    height: 36px;
    padding: 12px 80px;
    border-bottom: 1px solid #ccc;
    position: sticky;
    top: 0;
    background-color: white;
}

#logo {
    color: #0086ff;
    font-size: 32px;
    letter-spacing: -1px;
    font-weight: 900;
    font-family: 'Raleway', sans-serif;
    margin-right: 48px;
}

.menu-item {
    margin: 0;
    margin-right: 24px;
    font-family: 'Raleway', sans-serif;
    font-weight: 500;
    position: relative;
    top: -4px;
    cursor: pointer;
    font-size: 14px;
}

main {
    padding: 4% 12%;
    box-sizing: border-box;
}

.blog-card {
    width: 32%;
    height: 390px;
    vertical-align: top;
    margin-right: 1%;
    display: inline-block;
    background-color: white;
    border-radius: 8px;
    box-shadow: 0 2px 5px #aaa;
    cursor: pointer;
}

.blog-card:hover {
    box-shadow: 0 5px 10px #aaa;
}

.blog-card img {
    width: 100%;
    border-top-left-radius: 8px;
    border-top-right-radius: 8px;
}

.blog-card h3 {
    margin: 16px 16px 12px;
    font-size: 24px;
    font-family: 'Raleway', sans-serif;
    font-weight: 600;
    color: rgba(0, 0, 0, 0.9);;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
}

.blog-card p {
    margin: 12px 16px 16px;
    font-style: 'Raleway', sans-serif;
    color: rgba(0, 0, 0, 0.8);
    font-size: 16px;
    /* word-break: break-all; */
    word-wrap: break-word;
}

@media (max-width: 990px) {
    .blog-card {
        width: 48%;
    }
}

@media (max-width: 600px) {
    .blog-card {
        width: 100%;
    }
}
```
```javascript
console.log('Script Loaded');

// It will select all of the items that match with the img
console.log(document.querySelectorAll('.blog-card img'))

// It will select the first item that match to the img
console.log(document.querySelector('.blog-card img'))

// To select a specific item such as header with the id "topbar"
console.log(document.querySelectorAll('#topbar'))
console.log(document.querySelector('#topbar'))
```
![Query Selector](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/JavaScript_Language/Media/Query%20Selectors.PNG)

### 31. JavaScript - Update HTML Elements
- We will learn how to Update HTML Content and Attributes using JavaScript
- Let's say we wanted to do a website of a counter.
- Consider the below HTML, CSS and JavaScript codes.
- Each second it will change the value at the centre decreasingly and also change the background image.
```html
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <title>replit</title>
  <link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body>
  <header>
    <div>
      <img id="bg-image"
        src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQo5q0GXOJFaa7RjMbx2WojtTkCWirh8dbxXg&usqp=CAU'
        alt="Vector Background" />
      <h1 id="countdown">10</h1>
    </div>
  </header>
  <script src="/script.js"></script>
</body>

</html>
```
```css
body {
  margin: 0;
}

header div {
  width: 100%;
  height: 100vh;
  box-sizing: border-box;
  overflow: hidden;
  position: relative;
}

#bg-image {
  width: 100%;
  height: 100vh;
}

#countdown {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  font-size: 80px;
  margin: 0;
}
```
```javascript
console.log('JS Loaded')

// Passing the element with the id of 'countdown' to the variable called 'countdownElement'
var countdownElement = document.getElementById('countdown');
var bgImageElement = document.getElementById('bg-image');
console.log(countdownElement) // Output: <h1 id="countdown">10</h1>
console.log(bgImageElement.src)

// .innerHTML is an HTML element property that has two uses for web developers.
// You can use it to get the internal HTML content of any HTML element as an HTML string.
// You can also use it to set or change elements' innerHTML content.
var initialCountdownVal = countdownElement.innerHTML;
var initialImage = bgImageElement.src;
console.log(initialCountdownVal) // Output: 10

// We want this line of code to run every second.
// The setInterval() function is commonly used to set a delay for functions that are executed again and again, such as animations. You can cancel the interval using clearInterval() .
setInterval(function() {
  initialCountdownVal = initialCountdownVal - 1;

  // Condition where the counter stops at 0
  if (initialCountdownVal >= 0) {
    countdownElement.innerHTML = initialCountdownVal;

    // Condition to change the background image
    if (initialCountdownVal % 2 === 0) {
      bgImageElement.src = 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQo5q0GXOJFaa7RjMbx2WojtTkCWirh8dbxXg&usqp=CAU'
    }
    else {
      bgImageElement.src = 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtZkSaNaF3fNJPX7J-_WE-hT1jWceON-36wA&usqp=CAU'
    }
  }
}, 1000)
```
![Update HTML Elements 1](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/JavaScript_Language/Media/Update%20HTML%20Elements%201.png)
![Update HTML Elements 2](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/JavaScript_Language/Media/Update%20HTML%20Elements%202.png)

### 32. JavaScript - Updating Styles
- We learn how to update the styles of a HTML Element.
- To update styles, we can use the styles property of DOM.
- Syntax to update style or HTML element.

```javascript
// Sytax
var selectedElement = getElementBId('selector') / querySelector('selector')
selectedElement.style.{propertyName} = value;

// Example
selectedElement.style.width = '300px'
```
- Consider the following HTML, CSS and JavaScript code.
- Each second, the number will decrease and every second, the font size decreases by 100px.
- The image size would also decreases by 10% for each iterarion.
```html
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <title>replit</title>
  <link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body>
  <header>
    <div>
      <img id="bg-image"
        src='https://img.freepik.com/free-vector/hand-painted-watercolor-pastel-sky-background_23-2148902771.jpg?w=2000'
        alt="Vector Background" />
      <h1 id="countdown">10</h1>
    </div>
  </header>
  <script src="/script.js"></script>
</body>

</html>
```
```css
body {
  margin: 0;
}

header div {
  width: 100%;
  height: 100vh;
  box-sizing: border-box;
  overflow: hidden;
  position: relative;
}

#bg-image {
  width: 100%;
  height: 100vh;
}

#countdown {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  font-size: 1000px;
  margin: 0;
}
```
```javascript
console.log('script imported');
// To get the element
var countdownElement = document.getElementById("countdown");
var bgImage = document.getElementById("bg-image");

// To get the value inside the element
var initialCountdownVal = countdownElement.innerHTML;

// To do changes during the countdown
// You may also stop the interval using clearInterval(interval)
setInterval(function() {
  initialCountdownVal = initialCountdownVal - 1;

  // To change the view of the value of the number
  if (initialCountdownVal >= 0) {
    countdownElement.innerHTML = initialCountdownVal;

    // Reduce the fontsize
    countdownElement.style.fontSize = initialCountdownVal * 100 + "px"

    // Reduce the image size.
    bgImage.style.width = initialCountdownVal * 10 + "%"
  }
}, 1000);
```

### 33. JavaScript - Intro to Events\
- When some action happens in the webpage, that action is called Event.
- For example:
```
- User clicking the mouse over a certain element.
- User hovering the cursor over a certain element.
- User pressing a key on the keyboard.
- User resizing or closing the browser window.
- A form being submitted
- A video being played. or paused, or finishing play.
```
- How to handle events in JavaScript?
```javascript
// There are two ways we can handle events:
var selectedElement = getElementById('selector') / querySelector('selector')

// Method 1: Using Events Properties
// Syntax:
selectedElement.{eventProperty} = function() {}
// Example:
selectedElemet.onclick = function() {}

// Method 2: Using addEventListener()
// Syntax:
selectedElement.addEventListener({eventName}, function() {})
// For example:
selectedElement.addEventListener('click', function() {})
```
- Consider the following HTML, CSS and JavaSript code.
- This code will change the background colour and also the button colour once the button is pressed.
- Further coding can be done.
```html
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <title>replit</title>
  <link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body>
  <header>
    <div>
      <button id="btn-click"> Click Me!! </button>
    </div>
  </header>
  <script src="script.js"></script>
</body>

</html>
```
```css
body {
  margin: 0;
  font-family: 'Raleway', sans-serif;
}

header div {
  width: 100%;
  height: 100vh;
  box-sizing: border-box;
  overflow: hidden;
  position: relative;
  background-color: lightblue;
}

button {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  font-size: 48px;
}
```
```javascript
console.log('script imported')

// Find the desired button element
var btn = document.getElementById("btn-click");
var mainDiv = document.querySelector("header div");

console.log(mainDiv)

// Function to check and give alert messages when the button is clicked
function onBtnClick() {
  // This will pop up the message that the button has been clicked.
  alert("Button Clicked");

  // After clicked and after pop up message, It changes the button colour.
  btn.style.backgroundColor = "lightcoral"

  // Changing the background color
  mainDiv.style.backgroundColor = "yellow"
}

// Using event handler property
btn.onclick = onBtnClick;

// Accepts 2 arguments: The type of event (put the name of event such as click), function.
btn.addEventListener('click', function() {
  alert('Anonymous Function Called')
})
```

### 34. JavaScript - Add and Remove Classes from HTML Elements
- Modern browser gives us access to a property called "classList".
- It holds all the classes of an HTML element.
- These classes properties not available in Internet Explorer 9 and below.
```javascript
// We can use the method called add()


var selectedElement = getElementById('selector')/querySelector('selector')
// Syntax:
selectedElement.classList.add('MyClass');
// For example:
selectedElement.classList.add('show')
```
- Consider the following HTML, CSS and Javascript code.
- When the centre button clicked it reduces the size or increase the size
- When the sidebar button is clicked it opens and closes the sidebar.
```html
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>JS - Intro to Events, Event Listeners and Event Handlers</title>
  <link rel="stylesheet" href="/style.css" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Raleway:400,500,600,900&display=swap" rel="stylesheet">
  <script src="https://kit.fontawesome.com/35c398e458.js"></script>
</head>

<body>
  <header>
    <nav>
      <i id="toggle-icon" class="fas fa-bars"></i>
      <div id="sidebar" class="hide">
        <ul>
          <li>Home</li>
          <li>Settings</li>
          <li>About</li>
          <li>Contact</li>
        </ul>
      </div>
    </nav>
    <div>
      <h1 id="main-heading" class="small">Add/Remove Classes</h1>
      <button id="btn-click">Click Me!!</button>
    </div>
  </header>
  <script src="/script.js"></script>
</body>

</html>
```
```css
body {
  margin: 0;
  font-family: 'Raleway', sans-serif;
}

nav {
  display: none;
}

header>div {
  width: 100%;
  height: 100vh;
  box-sizing: border-box;
  overflow: hidden;
  position: relative;
  background-color: lightblue;
  text-align: center;
}

button {
  font-size: 24px;
  margin-top: 24px;
}

#main-heading {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}

.small {
  font-size: 24px;
}

.big {
  font-size: 48px;
}

@media (max-width: 768px) {
  nav {
    width: 100%;
    display: block;
    font-size: 36px;
    position: fixed;
    top: 0;
    left: 0;
    z-index: 10;
    padding: 16px;
    box-sizing: border-box;
  }

  nav i {
    cursor: pointer;
  }

  #sidebar {
    transition: all 1s;
    width: 100%;
    height: 100%;
    max-width: 270px;
    background-color: white;
    position: fixed;
    left: -270px;
    top: 72px;
  }

  #sidebar ul {
    list-style-type: none;
    width: 100%;
    height: 100%;
    padding-top: 32px;
  }

  #sidebar ul li {
    padding-left: 0;
    font-size: 24px;
    padding-top: 8px;
    padding-bottom: 8px;
  }

  .hide {
    display: none;
    transform: translateX(-270px);
  }

  .show {
    display: block;
    transform: translateX(270px);
  }
}
```
```javascript
var mainHeading = document.getElementById("main-heading");
var btn = document.getElementById("btn-click");
var sideBar = document.getElementById("sidebar");
var toggleButton = document.getElementById("toggle-icon")

// To remove the class we can add another method called remove().
// Timeout, after certain time, it triggers the function.
// setTimeout(function() {

// }, 1500);

btn.addEventListener('click', function() {

  if(mainHeading.classList.contains('small')) {
    // add() method can be used to add classes.
    // The .big class overrides the .small properties.
    mainHeading.classList.remove('small');
    mainHeading.classList.add('big');
  }
  else {
    mainHeading.classList.remove('big');
    mainHeading.classList.add('small');
  }
  
});

toggleButton.addEventListener('click', function() {

  // To check if the class is already present in the classList or not - .contains()
  if(sideBar.classList.contains('show')) {
    sideBar.classList.remove('show');
    sideBar.classList.add('hide');
  }
  else {
    sideBar.classList.remove('hide');
    sideBar.classList.add('show');
  }
});
```

### 35. JavaScript - Getting Styles
- We will learn how to get element styles values using JavaScript.
- In this lesson, we are trying to access the elements from the CSS file instead of styling in HTML file.
```javascript
// There are two was we can get Element style value:

var selectedElement = getElementId('selector') / querySelector('selector')

// INLINE STYLES
// Syntax:
selectedElement.style.{inline-style-property}
// For example:
selectedElement.style.width

// CSS FILE
// Syntax:
window.getComputedStyle(selectedElement).{style-property-name}
// For example:
window.getComputedStyle(selectedElement.width
```
- Consider the following HTML, CSS and JavaScript code.
- The font of the sentence will be increasing and decreasing based on the button that you pressed.
```html
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <title>JS - Getting Styles</title>
  <link href="style.css" rel="stylesheet" type="text/css" />
  <script src="https://kit.fontawesome.com/35c398e458.js"></script>
</head>

<body>
  <header>
    <div>
      <h1 id="main-heading" class="small">Fetch Styles</h1>
      <button id="btn-decrease">Font -</button>
      <button id="btn-increase" style="margin-right: 8px;">Font +</button>
    </div>
  </header>

  <script src="/script.js"></script>
</body>

</html>
```
```css
body {
  margin: 0;
  font-family: 'Raleway', sans-serif;
}

nav {
  display: none;
}

header>div {
  width: 100%;
  height: 100vh;
  box-sizing: border-box;
  overflow: hidden;
  position: relative;
  background-color: lightblue;
  text-align: center;
}

button {
  font-size: 24px;
  margin-top: 24px;
  margin-right: 36px;
  padding: 12px 24px;
}

#main-heading {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}

.small {
  font-size: 24px;
}

.big {
  font-size: 48px;
}

@media (max-width: 768px) {
  nav {
    width: 100%;
    display: block;
    font-size: 36px;
    position: fixed;
    top: 0;
    left: 0;
    z-index: 10;
    padding: 16px;
    box-sizing: border-box;
  }

  nav i {
    cursor: pointer;
  }

  #sidebar {
    transition: all 1s;
    width: 100%;
    height: 100%;
    max-width: 270px;
    background-color: white;
    position: fixed;
    left: -270px;
    top: 72px;
  }

  #sidebar ul {
    list-style-type: none;
    width: 100%;
    height: 100%;
    padding-top: 32px;
  }

  #sidebar ul li {
    padding-left: 0;
    font-size: 24px;
    padding-top: 8px;
    padding-bottom: 8px;
  }

  .hide {
    display: none;
    transform: translateX(-270px);
  }

  .show {
    display: block;
    transform: translateX(270px);
  }
}
```
```javascript
var btnDecreaseFont = document.getElementById("btn-decrease");
var btnIncreaseFont = document.getElementById("btn-increase");
var mainHeading = document.getElementById("main-heading");

// To access styles in CSS file.
var initialFontSize = window.getComputedStyle(mainHeading).fontSize;

// To get the value of the font size. Here also we parse the string into integer
initialFontSize = parseInt(initialFontSize.substring(0, (initialFontSize.length - 2)));

// Font decrease when decrease font button pressed
btnDecreaseFont.addEventListener('click', function() {
  initialFontSize = initialFontSize - 10
  mainHeading.style.fontSize = initialFontSize + "px"
})

// Font incrase when increase font button pressed
btnIncreaseFont.addEventListener('click', function() {
  initialFontSize = initialFontSize + 10
  mainHeading.style.fontSize = initialFontSize + "px"
})
```

### 36. JavaScript - Form Events
- Form events: change, focus, blur, submit.
- **change:** Is triggered when the content of an input field is changed or when the user sleects a value from the dropdown etc.
- **focus:** Triggered when the input field is focused by the user.
- **blur:** Triggered when the input field loses focus.
- **submit:** Triggered when the submit button is clicked by the user.

### 37. JavaScript - Keyboard Events
### 38. JavaScript - Mouse Events
### 39. JavaScript - Create HTML Elements - Part 1
### 40. JavaScript - Create HTML Elements - Part 2
### 41. JavaScript - Update and Delete HTML Elements


## Section 10: Browser Object Model
### 42. JavaScript - Introduction to Browser Object Model
### 43. JavaScript - Screen and Navigator Object
### 44. JavaScript - History and Location Object











