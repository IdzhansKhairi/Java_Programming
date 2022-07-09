# JavaFX Programming Notes

## Stages
Setting up the title of application :
```java
stage.setTitle("Demo Program");
```

Setting up the height and width :
```java
stage.setWidth(420);
stage.setHeight(420);
```

Setting up the stage to cannot be resizable :
```java
stage.setResizable(false);
```

Setting up the x and y position where our application will appear in our computer screen :
```java
stage.setX(50);
stage.setY(50);
```

Setting up the application to start at full screen mode :
```java
stage.setFullScreen(true);
```

Setting up the application exit hint during full screen :
```java
// In this case we are making q as the escape button
stage.setFullScreenExitHint("You cannot escape unless you press q");

// Here we setting up the key that needed to be pressed to exit the full screen
stage.setFullScreenExitCombination(KeyCombination.valueOf("q");
```

## Scenes + Drawing Stuff
Adding texts in the application pane :
```java
Text text = new Text();

text.setText("WHOAAAAA!!!"); // Setting up the text
text.setX(50); // Position of text at x-axis
text.setY(50); // Position of text at y-axis
text.setFont(Font.font("Verdana", 50)); // Set the font and the size of the text
text.setFill(Color.LIMEGREEN); // Set the colour of the text

root.getChildren().add(text);
```

Adding line in the application pane :
```java
Line line = new Line();

line.setStartX(200); // Setting up the starting point of the line from x-axis
line.setStartY(200); // Setting up the starting point of the line from y-axis
line.setEndX(500); // Setting up the ending line from x-axis
line.setEndY(200); // Setting up the ending line from y-axis
line.setStrokeWidth(5); // Setting up the stroke width of the line
line.setStroke(Color.RED); // Setting up the line colour
line.setOpacity(0.5); // Setting up the capacity of the line
line.setRotate(45); // This will set the line to be rotated 45 degree

root.getChildren().add(line);
```

Adding rectangle in the application pane :
```java
Rectangle rectangle = new Rectangle();
        
rectangle.setX(100); // Setting up the x-axis position
rectangle.setY(100); // Setting up the Y-axis position
rectangle.setWidth(100); // Setting up the width of the rectangle
rectangle.setHeight(100); // Setting up the height of the rectangle
rectangle.setFill(Color.BLUE); // Setting up the colour of the rectangle
rectangle.setStrokeWidth(5); // Setting up the stroke width of the rectangle
rectangle.setStroke(Color.BLACK); // Setting up the stroke color of the rectangle
rectangle.setRotate(45); // Setting up the rotation of the rectangle to 45 degrees

root.getChilren().add(rectangle);
```

Adding triangle in the application pane :
```java
Polygon triangle = new Polygon();

triangle.getPoints().setAll(
        200.0, 200.0,
        300.0, 300.0,
        200.0, 300.0); // Setting up the triangle by inserting the coordinate
triangle.setFill(Color.YELLOW); // Fill the colour of the triangle as yellow

root.getChildren().add(triangle);
```

Adding Circle in the application pane :
```java
Circle circle = new Circle();

circle.setCenterX(350); // Setting up the center of the circle at the x-axis
circle.setCenterY(350); // Setting up the center of the circle at the y-axis
circle.setRadius(50); // Setting up the radius of the circle from the center
circle.setFill(Color.ORANGE); // Setting up the color of the circle

root.getChildren().add(circle);
```

Adding images in the application pane :
```java
Image image = new Image("Logo UM.jpg");
ImageView imageView = new ImageView(image);

imageView.setX(400); // Setting up the position of image at x-axis
imageView.setY(400); // Setting up the position of image at Y-axis

root.getChildren().add(imageView);
```

## Event Handling using SceneBuilder

