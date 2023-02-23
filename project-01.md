# CMPS 1600 Project 01

In this project, you will implement a text-based adventure game starting from the classes we wrote in lecture.

Deadlines:

- Milestone 1: **Monday March 6th**
- Milestone 2: **Wednesday March 15th** 
- Milestone 3: **Wendesday March 22nd**

# Milestone 1: Documentation and Testing

For Milestone 1, you will add documentation and unit tests for the existing classes of this projects.

Requirements:

1) UML Diagram containing all classes.
2) Javadoc comments for classes and all non private methods of all classes.
3) Unit Tests for the `Character` class and `HealingPotion` class.

## UML Diagrams

Create a UML Diagram containing all classes in this project. You may create the however you like, but add your final file(s) in PDF format to a `uml` directory in the root directory of your project.

## Javadoc Comments

Add Javadoc comments to all classes. Each class should have a javadoc comment at the top of the class. All non-private methods should have javadoc comments.

Compile your javadoc comments into a javadoc website in a `docs` directory in the root directory of your project.

To do so, on the terminal, located in your project's root directory, issue the following command:

`javadoc -link https://docs.oracle.com/en/java/javase/19/docs/api -sourcepath ./src/ adventure_game adventure_game.items -d ./docs`

## Unit Tests

Add Unit Tests for the `Character` and `HealingPotion` classes. All methods more complicated than trivial getters should be tested.

The best way to write unit tests for Java is to use JUnit.

VS Code makes it easy to get setup with JUnit and to run JUnit Tests. The VS Code Extension "Extension Pack for Java" bundles JUnit Testing into VS Code for you. 

To start writing and running JUnit tests, you need to Enable Java Testing. First, in VS Code, open any java source file to force VS Code to "open java projects" and enable java extensions. Then you will have a test beaker "Testing" option in your left menu. From there, click on "Enable Java Tests"

<img src = "figures/vs-code-testing.png" width = "60%">

VS Code will download the required library and you're good to go.

Here is the Documentation on [writing JUnit Tests](https://junit.org/junit5/docs/current/user-guide/#writing-tests). 

Also provided for you is the start of the unit tests for the `Character` class: `CharacterTests`.

Open up `CharacterTests`.

You see that there is a `@BeforeEach` annotation above the `setup()` method. `setup()` will be run before each test.

Every method labelled with the `@Test` annotation (so far just `testModifyHealth`) is a test method.

Add test methods for all methods except for trivial getters 

Also implement the `HealingPotionTests` class that is provided for you in the items package.

# Milestone 2: Character Creation

Implement character creation. When the game starts, allow the user to create their own character.

