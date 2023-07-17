# Notes on Angular Language
### Prerequisites
- Need to knows basics of HTML, CSS and JS.
- Basics of Typescript.

### Development Environment
- Node
- NPM
- Angular CLI
- Text Editor - VS Code

## Angular Tutorial 3 - Hello World App
```java
// To create a new project named Hello World
ng new hello-world

// Change directory to the hello-world folder
cd hello-world

// To run the application
ng serve
```
### Modules
- A collection of individual modules
- Root Module = AppModule

### Components
- Control the views of the angular application.
- Each component will have HTML template.

### Services
- A class that contains the business logic in your application.
- Components and services will be focused a lot.

### Architecture Summary
- Angular App -  One or More modules
- Module - One or more components and services
- Components - HTML + Class
- Services - Business Logic
- Modules interact and ultimately render the view in the browser.

### More explanation
- src folder is the one that we will be more concerened at the time.
- **_main.ts_** is the entry point to our angular application.
- App folder contains file named **_app.module.ts_** which is the root module of our application.
- **_app.component.ts_** which is the root component of our application.
- When we run the command _ng serve_ to start the application, the execution comes to _main.ts_ file.

## Angular Tutorial 4 - Components
- Made of three parts

