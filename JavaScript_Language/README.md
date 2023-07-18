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


### 18. JavaScript - Arrays Part 1


### 19. JavaScript - Arrays Part 2


## Section 7: Loops
### 20. JavaScript - Introduction to Loops

### 21. JavaScript - While Loop


### 22. JavaScript - For Loops










