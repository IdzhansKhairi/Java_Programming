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

## #5 Flutter Tutorial for Beginners - Scaffold & AppBar
- 99% that we do will be inside the lib folder such as main.dart.
- The code below is some basics on showing the UI of our app.
```dart
import 'package:flutter/material.dart';

// Material App going to become the wrapper of our application
void main() => runApp(MaterialApp(
  home: Scaffold(
    appBar: AppBar(
      title: Text('myFirstApp'),
      centerTitle: true,
      backgroundColor: Colors.lightBlue,
    ),

    body: Center(
      child: Text('Hello Ninjas'),
    ),
  ),
));
```
![#1 - Basic App Layout](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/Dart_Flutter_Language/Media/%231-%20Basic%20Application%20Layout.PNG)

## #6 Flutter Tutorial for Beginners - Colours and Font
- pubspec.yaml is a bit like a configuration file of our project.
- To add some of the font, we may go to Google Downloads and add it into a folder file that we created inside our project.
- Then we may edit some of the
```yaml
name: myflutterapp
description: "Flutter App for Learning and Testing"
# The following line prevents the package from being accidentally published to
# pub.dev using `flutter pub publish`. This is preferred for private packages.
publish_to: 'none' # Remove this line if you wish to publish to pub.dev

# The following defines the version and build number for your application.
# A version number is three numbers separated by dots, like 1.2.43
# followed by an optional build number separated by a +.
# Both the version and the builder number may be overridden in flutter
# build by specifying --build-name and --build-number, respectively.
# In Android, build-name is used as versionName while build-number used as versionCode.
# Read more about Android versioning at https://developer.android.com/studio/publish/versioning
# In iOS, build-name is used as CFBundleShortVersionString while build-number is used as CFBundleVersion.
# Read more about iOS versioning at
# https://developer.apple.com/library/archive/documentation/General/Reference/InfoPlistKeyReference/Articles/CoreFoundationKeys.html
# In Windows, build-name is used as the major, minor, and patch parts
# of the product and file versions while build-number is used as the build suffix.
version: 1.0.0+1

environment:
  sdk: '>=3.2.3 <4.0.0'

# Dependencies specify other packages that your package needs in order to work.
# To automatically upgrade your package dependencies to the latest versions
# consider running `flutter pub upgrade --major-versions`. Alternatively,
# dependencies can be manually updated by changing the version numbers below to
# the latest version available on pub.dev. To see which dependencies have newer
# versions available, run `flutter pub outdated`.
dependencies:
  flutter:
    sdk: flutter


  # The following adds the Cupertino Icons font to your application.
  # Use with the CupertinoIcons class for iOS style icons.
  cupertino_icons: ^1.0.2

dev_dependencies:
  flutter_test:
    sdk: flutter

  # The "flutter_lints" package below contains a set of recommended lints to
  # encourage good coding practices. The lint set provided by the package is
  # activated in the `analysis_options.yaml` file located at the root of your
  # package. See that file for information about deactivating specific lint
  # rules and activating additional ones.
  flutter_lints: ^2.0.0

# For information on the generic Dart part of this file, see the
# following page: https://dart.dev/tools/pub/pubspec

# The following section is specific to Flutter packages.
flutter:

  # The following line ensures that the Material Icons font is
  # included with your application, so that you can use the icons in
  # the material Icons class.
  uses-material-design: true

  # To add assets to your application, add an assets section, like this:
  # assets:
  #   - images/a_dot_burr.jpeg
  #   - images/a_dot_ham.jpeg

  # An image asset can refer to one or more resolution-specific "variants", see
  # https://flutter.dev/assets-and-images/#resolution-aware

  # For details regarding adding assets from package dependencies, see
  # https://flutter.dev/assets-and-images/#from-packages

  # To add custom fonts to your application, add a fonts section here,
  # in this "flutter" section. Each entry in this list should have a
  # "family" key with the font family name, and a "fonts" key with a
  # list giving the asset and other descriptors for the font. For
  # example:
  fonts:
    - family: AgbalumoRegular
      fonts:
        - asset: fonts/Agbalumo-Regular.ttf

  #
  # For details regarding fonts from package dependencies,
  # see https://flutter.dev/custom-fonts/#from-packages

```
```Dart
import 'package:flutter/material.dart';

// Material App going to become the wrapper of our application
void main() => runApp(MaterialApp(
  home: Scaffold(
    appBar: AppBar(
      title: Text('UM Events'),
      centerTitle: true,
      backgroundColor: Colors.purpleAccent,
    ),

    body: Center(
      child: Text(
        'Hello Ninjas',
        style: TextStyle(
          fontSize: 20.0,
          fontWeight: FontWeight.bold,
          letterSpacing: 2.0,
          color: Colors.grey[600],
          fontFamily: 'AgbalumoRegular',
        )
      ),
    ),

    floatingActionButton: FloatingActionButton(
      onPressed: () {},
      child: Text('click'),
      backgroundColor: Colors.purpleAccent,
    ),

  ),
));
```
![#2 - Colour and Font for the App](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/Dart_Flutter_Language/Media/%232%20-%20Colour%20App%20and%20Font.jpg)

## #7 Flutter Tutorial for Beginners - Stateless Widget and Hot Reload
- Flutter also have a hot reload properties.
- **Stateless Widgets:** The state of the widget cannot change over time.
- **Stateful Widgets:** The state of the widget can change over time.
- Before this we need to make a hot restart to see the changes that we made on our application.
- However, with the code changes below here, only clicked save, we can see the changes already.
```Dart
import 'package:flutter/material.dart';

// Material App going to become the wrapper of our application
void main() => runApp(MaterialApp(
  home: Home(),
));

// This actually helps to hot restart to be triggered everytime we clicked save
// So that when changes are made, we don't need to hot restart everything.
// We can just use this instance whenever that we need.
class Home extends StatelessWidget {

  // Over here means we return a widget.
  // The code that we run here will override the code from its ancestor which is in this case, StatelessWidget.
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('My First App'),
        centerTitle: true,
        backgroundColor: Colors.purpleAccent,
      ),

      body: Center(
        child: Text(
            'Hello Ninjas',
            style: TextStyle(
              fontSize: 20.0,
              fontWeight: FontWeight.bold,
              letterSpacing: 2.0,
              color: Colors.grey[600],
              fontFamily: 'AgbalumoRegular',
            )
        ),
      ),

      floatingActionButton: FloatingActionButton(
        onPressed: () {},
        child: Text('Hello'),
        backgroundColor: Colors.purpleAccent,
      ),
    );
  }
}
```


## #8 Flutter Tutorial for Beginners - Images & Assets
-  We can use a web image or an asset image where we use the one from our source file.
-  NetworkImage() properties can help you to show the desired image from any website.
```Dart
import 'package:flutter/material.dart';

// Material App going to become the wrapper of our application
void main() => runApp(MaterialApp(
  home: Home(),
));

class Home extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('My First App'),
        centerTitle: true,
        backgroundColor: Colors.purpleAccent,
      ),

      body: Center(
        child: Image(
          image: NetworkImage('https://preview.redd.it/r3lcc7gf64791.png?width=540&format=png&auto=webp&s=9d32ec46f884486fd59dfd01453bf5d07bf30d75'),
        )
      ),

      floatingActionButton: FloatingActionButton(
        onPressed: () {},
        child: Text('Hello'),
        backgroundColor: Colors.purpleAccent,
      ),
    );
  }
}
```

- For the Asset Image, it is the images that you saved inside our project file.
- To do this, make sure that you make a new file called assets and put the pictures inside it.'
- Other than that, since we wanted to use the assests image, you also have to define it inside the pubspec.yaml file.
- If we have more than one assets picture, please declare it inside the pubspec.yaml file. If not, it will not be shown.
```yaml
# To add assets to your application, add an assets section, like this:
  assets:
    - assets/sha.nyy_2919085602611959201_1531335952_1_1080x1350.jpg
```
```Dart
import 'package:flutter/material.dart';

// Material App going to become the wrapper of our application
void main() => runApp(MaterialApp(
  home: Home(),
));

class Home extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('My Girlfriend Pics App'),
        centerTitle: true,
        backgroundColor: Colors.purpleAccent,
      ),

      body: Center(
        child: Image(
          image: AssetImage('assets/sha.nyy_2919085602611959201_1531335952_1_1080x1350.jpg'),
        )
      ),

      floatingActionButton: FloatingActionButton(
        onPressed: () {},
        child: Text('Call Her'),
        backgroundColor: Colors.purpleAccent,
      ),
    );
  }
}
```
- If there is so many pictures, you may only initialize the assets folder only.
- And then you need to do the URL to that assets picture. Dont forget there "/".
```yaml
# To add assets to your application, add an assets section, like this:
  assets:
    - assets/
```


## #9 Flutter Tutorial for Beginners - Buttons and Icons
- The first one is the icon.
- For icon you may customize it a bit like colour and also the design.
```dart
import 'package:flutter/material.dart';

// Material App going to become the wrapper of our application
void main() => runApp(MaterialApp(
  home: Home(),
));

class Home extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('My Girlfriend Pics App'),
        centerTitle: true,
        backgroundColor: Colors.purpleAccent,
      ),

      body: Center(
        child: Icon(
          Icons.airport_shuttle,
          color: Colors.purpleAccent,
          size: 50.0,
        )
      ),

      floatingActionButton: FloatingActionButton(
        onPressed: () {},
        child: Text('Call Her'),
        backgroundColor: Colors.purpleAccent,
      ),
    );
  }
}
```

- For button we may use a lot kind of button.
- The example below is the one that will use text to show the button.
```dart
import 'package:flutter/material.dart';

// Material App going to become the wrapper of our application
void main() => runApp(MaterialApp(
  home: Home(),
));

class Home extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Flutter App Test'),
        centerTitle: true,
        backgroundColor: Colors.purpleAccent,
      ),

      body: Center(
        child: ElevatedButton(
          onPressed: () {
            print("You clicked Me");
          },
          child: Text('New button'),
          style: ButtonStyle(
            backgroundColor: MaterialStatePropertyAll(Colors.lightBlue)
          )
        ),
      ),

      floatingActionButton: FloatingActionButton(
        onPressed: () {},
        child: Text('Call Her'),
        backgroundColor: Colors.purpleAccent,
      ),
    );
  }
}
```

- Other than that we may also put icon and also some text into the button.
- Below are the code example where you may put the icon.
```
import 'package:flutter/material.dart';

// Material App going to become the wrapper of our application
void main() => runApp(MaterialApp(
  home: Home(),
));

class Home extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Flutter App Test'),
        centerTitle: true,
        backgroundColor: Colors.purpleAccent,
      ),

      body: Center(
        child: ElevatedButton.icon(
          onPressed: () {},
          icon: Icon(
            Icons.mail
          ),
          label: Text('Email'),
          style: ButtonStyle(
            backgroundColor: MaterialStatePropertyAll(Colors.amber)
          ),
        )
      ),

      floatingActionButton: FloatingActionButton(
        onPressed: () {},
        child: Text('Call Her'),
        backgroundColor: Colors.purpleAccent,
      ),
    );
  }
}
```

- We can also just using an Icon to become a button.
- This basically uses the Icon to act as a functional button
```dart
import 'package:flutter/material.dart';

// Material App going to become the wrapper of our application
void main() => runApp(MaterialApp(
  home: Home(),
));

class Home extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Flutter App Test'),
        centerTitle: true,
        backgroundColor: Colors.purpleAccent,
      ),

      body: Center(
        child: IconButton(
          onPressed: null,
          icon: Icon(Icons.alternate_email),
          color: Colors.amber,
        )
      ),

      floatingActionButton: FloatingActionButton(
        onPressed: () {},
        child: Text('Call Her'),
        backgroundColor: Colors.purpleAccent,
      ),
    );
  }
}
```

## #10 Flutter Tutorial for Beginners - Containers and Padding (Forgot to save and stuck here LMAO)
 


## #15 Flutter Tutorial for Beginners - Expanded Widgets
- Expended properties is usefull to expand the content until at the end of the screen (Filling in the screen).
- By using flex, as we can see the code below, it basically divides it into 6 partitions.
- Number one going to take 3 out of 6 partitions, number 2 going to take 2 out of 6 partitions and number 1 going to take 1 out of 6 partitions.
```dart
import 'package:flutter/material.dart';

// Material App going to become the wrapper of our application
void main() => runApp(MaterialApp(
  home: Home(),
));

class Home extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Flutter App Test'),
        centerTitle: true,
        backgroundColor: Colors.purpleAccent,
      ),

      body: Row(
        children: <Widget>[
          // By wrapping a widget inside an expanded widget, we be able to ensure that it takes all of the remaining space
          Expanded(
            flex: 3,
            child: Container(
              padding: EdgeInsets.all(30.0),
              color: Colors.cyan,
              child: Text('1'),
            ),
          ),
          Expanded(
            flex: 2,
            child: Container(
              padding: EdgeInsets.all(30.0),
              color: Colors.pinkAccent,
              child: Text('2'),
            ),
          ),
          Expanded(
            flex: 1,
            child: Container(
              padding: EdgeInsets.all(30.0),
              color: Colors.amber,
              child: Text('3'),
            ),
          ),
        ],
      ),

      floatingActionButton: FloatingActionButton(
        onPressed: () {},
        child: Text('Click'),
        backgroundColor: Colors.purpleAccent,
      ),
    );
  }
}
```

## #15 Flutter Tutorial for Beginners - Ninja ID Project
- In this mini project, you may discover on how to do the UI based on everything that we had learned so far.
- You may create a new project and use the code below.
- For the picture, don't forget to initialize the assets in pubspec.yaml.
```dart
import 'package:flutter/material.dart';

void main() => runApp(MaterialApp(
  // Determine what is going to be shown at our home page of our app
  home: NinjaCard()
));

class NinjaCard extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    // Create layout and stuff
    return Scaffold(
      backgroundColor: Colors.grey[900],
      appBar: AppBar(
        title: Text('Ninja ID Card'),
        titleTextStyle: TextStyle(
          color: Colors.white,
          fontSize: 20.0,
        ),
        centerTitle: true,
        backgroundColor: Colors.grey[850],
      ),
      body: Padding(
        // Give some padding to the body of the app
        padding: EdgeInsets.fromLTRB(30.0, 40.0, 30.0, 0.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: <Widget>[
            // To put the image at the center of the page in a circular shape
            Center(
              child: CircleAvatar(
                backgroundImage: AssetImage('assets/Guitar Profile Pic.jpg'),
                radius: 40.0,

              ),
            ),
            Divider(
              height: 60.0,
              color: Colors.grey[800],
            ),
            Text(
              'NAME',
              style: TextStyle(
                color: Colors.grey,
                letterSpacing: 2.0,
              ),
            ),
            // Make some distance or some box with the height if 10.0px
            SizedBox(height: 10.0),

            Text(
              'Muhammad Idzhans Khairi',
              style: TextStyle(
                color: Colors.amberAccent[200],
                letterSpacing: 2.0,
                fontSize: 20.0,
                fontWeight: FontWeight.bold,
              ),
            ),
            SizedBox(height: 30.0),

            Text(
              'CURRENT AGE',
              style: TextStyle(
                color: Colors.grey,
                letterSpacing: 2.0,
              ),
            ),
            // Make some distance or some box with the height if 10.0px
            SizedBox(height: 10.0),

            Text(
              '22 Years Old',
              style: TextStyle(
                color: Colors.amberAccent[200],
                letterSpacing: 2.0,
                fontSize: 20.0,
                fontWeight: FontWeight.bold,
              ),
            ),
            SizedBox(height: 30.0),
            Row(
              children: <Widget>[
                Icon(
                  Icons.email,
                  color: Colors.grey[400],
                ),
                SizedBox(width: 10.0),
                Text(
                  'idzhans.khairi@gmail.com',
                  style: TextStyle(
                    color: Colors.grey[400],
                    fontSize: 18.0,
                    letterSpacing: 1.0,
                  ),
                ),
              ],
            ),
          ],
        )
      )
    );
  }
}
```
![First Flutter Project](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/Dart_Flutter_Language/Media/%234%20First%20Flutter%20Project.jpg)


## #15 Flutter Tutorial for Beginners - Stateful Widgets




