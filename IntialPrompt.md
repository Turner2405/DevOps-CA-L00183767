# Initial Prompt Used to Create the Project 

I want to build a very simple web application in Java that adds two numbers.

Use:

Java 21

Spring Boot

Maven

Thymeleaf

A normal HTML form submission

No JavaScript

No AJAX

No CSS or styling

No unnecessary libraries, classes, or complexity

The application should be beginner-friendly and as minimal as possible.

Existing Java class

I already have this class:

public class Adder { public static int add(int a, int b) { return a + b; } }

Use the existing Adder.add() method to perform the actual addition. Do not duplicate the addition logic in the controller.

Remove any unused imports from the class.

Web interface

The web page should contain only:

A label for the first number

A number input for the first number

A label for the second number

A number input for the second number

An "Add" button

The calculated result

The user enters two numbers and clicks Add.

Use a standard HTML

with method="post".
The page should reload after the form is submitted. Do not use JavaScript, AJAX, REST APIs, or client-side calculation.

Spring Boot implementation

Create only these Java classes:

Adder.java

AdderApplication.java

AdderController.java

Use the package:

com.example.adder

The controller should:

Handle GET / and display index.html.

Handle POST /.

Receive the two form values as integers.

Explicitly specify the request parameter names using:

@RequestParam(name = "a") int a @RequestParam(name = "b") int b

Do not rely on Java compiler parameter-name discovery.

The controller should call:

Adder.add(a, b)

and place the result into the Thymeleaf model using the attribute name:

result

Then return the index view.

Thymeleaf template

The file must be located exactly at:

src/main/resources/templates/index.html

Do not put it in src/main/resources directly or under src/main/java.

The HTML form inputs must have names that exactly match the controller parameters:

name="a" name="b"

Use Thymeleaf only to display the result, for example:

Result:

Project structure

Provide this exact recommended structure:


<img width="394" height="289" alt="image" src="https://github.com/user-attachments/assets/c1e3e752-b050-406d-b7fc-b15dd4ecf0c1" />


Maven configuration

Provide a complete pom.xml.

It must:

Use Spring Boot.

Set Java version to 21.

Include spring-boot-starter-web.

Include spring-boot-starter-thymeleaf.

Include the spring-boot-maven-plugin.

Keep the Maven configuration minimal.

Important compatibility requirement

The project must be compatible with Java 21.

Do not require Java 24 or another Java version.

Required output

Provide the complete contents of every file:

pom.xml

src/main/java/com/example/adder/Adder.java

src/main/java/com/example/adder/AdderApplication.java

src/main/java/com/example/adder/AdderController.java

src/main/resources/templates/index.html

Show each file in its own code block.

Also show the complete project directory structure.

Provide the Maven command to start the application:

mvn spring-boot:run

Tell me to run that command from the directory containing pom.xml.

Provide the URL:

http://localhost:8080

Explain briefly how the request flows:

<img width="260" height="275" alt="image" src="https://github.com/user-attachments/assets/34809e84-9744-4bf8-9f0c-aba4fde73f7a" />

Do not add error handling, validation, styling, JavaScript, databases, REST endpoints, or other features unless they are required for the application to work.

Before presenting the final code, check carefully that:

index.html is under src/main/resources/templates/.

The HTML form uses method="post" and action="/".

The first input has name="a".

The second input has name="b".

The controller uses @RequestParam(name = "a").

The controller uses @RequestParam(name = "b").

The controller calls Adder.add(a, b).

The controller adds the result to the model as "result".

The controller returns "index".

There is no JavaScript.

There is no client-side addition.

The project uses Java 21.

The Maven project contains the Spring Boot Maven plugin.
