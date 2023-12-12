# Dart (Flutter) Notes
*Reference: https://www.youtube.com/playlist?list=PL4cUxeGkcC9jLYyp2Aoh6hcWuxFDX6PBJ*

## #1 Flutter Tutorial for Beginners - Intro and Setup
### What is Flutter
- Mobile UI framework for creating native apps for IOS and Android.
- Single code-base (dart) means we only have to write our apps once for multiple devices.
- The apps can run on both OS which are IOS and Android.

### Why use Flutter?
- Only 1 code base
- Good layout methodology borrowed from the responsive web.
- Very smooth and quick experience when running apps.
- Works well with Firebase as a backend.
- Uses Dart, which is really easy language to pick up.
- Uses material Design out-of-the-box.
- Great docs and guides on the Flutter website.

### You should know...
- A basic understanding of programming principles such as classes, functions and methods, variables, and asynchronous code.

### Setup
- You can use Android Studio or VS Code.
- But this notes will be based on the Android Studio.
- The next thing that you need to install is git (Uses to track changes code)
- We will use it to install flutter. https://docs.flutter.dev/get-started/install/windows

## #3 Flutter Tutorial for Beginners - Flutter Overview
- Everything inside the flutter is a widget.
- There's a lot of widget such as Text Widget, Button Widget, Row Widget, Column Widget, and Image Widget and many more.
- We may look for this widgets from the internet more and so on.
- The widgets can be customized to ensure how do they looked like (Just like CSS in web development.
- All widgets in Flutter are classes.

## #2 Flutter Tutorial for Beginners - Dart Primer
### Variables
- When we run, it will run the main().
```dart
void main() {
  for (int i = 0; i < 5; i++) {
    print('hello ${i + 1}');
  }
}
```

- Dart uses variables just like all other language.
- Dart is a statically type programming language where the variables that we declared as an exact type such as String, we cannot change the variable in the future.
```dart
void main() {
  int age = 30;
  print(age);
  
  String name = 'Hans';
  print(name);
  
  bool isNight = false;
  print(isNight);
}
```

- Dart also uses the Dynamic Type variable where the value type can be changed in the future such as from string to integer.
- Javascript is an example of dynamic type language.
```dart
void main() {
  dynamic name = 'Hans';
  print(name);
  name = 30;
  print(name);
}
```

### Functions
- Usually, dart will be looking for the main() function first.
- The Void, String and also int in each function declaration indicates the type that it will return (must return a value).
- Void means it will not return any value and if we try to return something, an error will comes out.
```dart
void main() {
  print('Entering Main');
  String greet = greeting();
  int age = getAge();
  print(greet);
  print(age);
}

String greeting() {
  // logic
  return 'hello';
}

int getAge() {
  // logic
  return 30;
}
```

- If the return is only in one line, there is another way that we may do it.
```dart
void main() {
  print('Entering Main');
  String greet = greeting();
  int age = getAge();
  print(greet);
  print(age);
}

String greeting() => 'hello';

int getAge() => 30;
```

### List
- List is just like an array in Javascript.
- We used square bracket to save value.
- We can also add or remove items in this list.
- We can also add another data type of the list.
```dart
void main() {
  List names = ['Chun Li', 'Yoshi', 'Mario'];
  print(names);
  
  // We can add a list
  names.add('Luigi');
  print(names);
  
  // We can remove a list
  names.remove('Yoshi');
  print(names);
  
  // We can also add a different data type into the list
  names.add(30);
  print(names);
}
```

- However, we can make the list to only contain a data type only such as string.
- When you try to add a data inside this list that is not string, there will be an error comes out.
``` dart
void main() {
  List<String> names = ['Chun Li', 'Yoshi', 'Mario'];
  print(names);
  
  // We can add a list
  names.add('Luigi');
  print(names);
  
  // We can remove a list
  names.remove('Yoshi');
  print(names);
}
```

### Classes
- Class is like a blueprint of an object.
```dart
void main() {
  // Instantiate User One from the User Object/Class
  User userOne = User();
  print(userOne.username);
  print(userOne.age);
  userOne.login();
}

class User {
  
  // Declare hard code for the username and age
  String username ='mario';
  int age = 25;
 
  // A function inside this particular class
  void login() {
    print('user logged in');
  }
}
```

- We also may create a constructor that will make our username and age to be unique depending on what did you pass in.
- Here, the username and also the age must be initialize because the constructor cannot take a null value.
```dart
void main() {
  // Instantiate User One from the User Object/Class
  User userOne = User('luigi', 25);
  print(userOne.username);
  print(userOne.age);
//   userOne.login();
  
  print("");
  
  User userTwo = User('Mario', 30);
  print(userTwo.username);
  print(userTwo.age);
//   userTwo.login();
}

class User {
  
  // Declare variables for the username and age
  String username = "";
  int age = 0;
  
  // This constructor will take the value and use it.
  User(String username, int age) {
    // Assign the value inside it.
    this.username = username;
    this.age = age;
  }
 
  // A function inside this particular class
  void login() {
    print('user logged in');
  }
}
```

- We may also create an inheritance where it is basically, we inherit the value from another class.
- From the code below, UserOne and UserTwo didn't have access to the SuperUser.
- UserThree also be able to access the login() function inside User Class because the SuperUser Class is inherited the User Class.
```dart
void main() {
  // Instantiate User One from the User Object/Class
  User userOne = User('luigi', 25);
  print(userOne.username);
  print(userOne.age);
  userOne.login();
  
  print("");
  
  User userTwo = User('Mario', 30);
  print(userTwo.username);
  print(userTwo.age);
  userTwo.login();
  
  print("");
  
  SuperUser userThree = SuperUser('Yoshi', 20);
  print(userThree.username);
  print(userThree.age);
  userThree.publish();
  userThree.login();
}

// User Class
class User {
  
  // Declare variables for the username and age
  String username = "";
  int age = 0;
  
  // This constructor will take the value and use it.
  User(String username, int age) {
    // Assign the value inside it.
    this.username = username;
    this.age = age;
  }
 
  // A function inside this particular class
  void login() {
    print('user logged in');
  }
}

// Inheritence of SuperUser from the User
class SuperUser extends User {
  
  SuperUser(String username, int age) : super(username, age);
  
  void publish() {
    print('published update');
  }
}
```

## #4 Flutter Tutorial for Beginners - Flutter Overview
- 99% that we do will be inside the lib folder such as main.dart.
- 





