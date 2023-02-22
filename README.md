# Poised-Project

## Description
The Poised Project is a program written the Java language.The program is designed to be a project management system for a small structural engineering firm called 'Poised'. The company Poised works on various buildings in an engineering capacity to ensure structural integrity. The Java program was written to assist the company in keeping track of the many projects that they work on.

## Executing program
The UML (Unified Modeling Language) diagram that is stored in the repository with the Poised project java files shows an overall plan to meet the company's requirements for a project management system. The plan is to create a main 'Menu' Java class, which will call on methods from the other sub-classes, depending on what action the user chooses from the displayed menu. Once the project is finished it will be able to capture all the necessary information about new projects, update information on existing projects, finalise existing projects, view a list of projects that are incomplete or overdue, as well as find and select a project by number or name. This project is still a work in progress. So far, the functionality of the Java program is as follows:
It consists of a 'Person' Java class that contains certain variables, a constructor, and a method to display all the person information. So it basically creates a person object (for example a contractor) with all their necessary details (e.g. name, number, address etc.) and displays their information in an easy-to-read format.

There is also a 'Project' Java class which also contains variables, constructor and a method to display all information related to a new project. It therefore works to create a new project object with all the related details (e.g. project number, project name, building type, deadline etc.) and displays the new project in an easy-to-read format.

Then there is the main 'Program' class, which is where the actual program is executed. This program displays a welcome message to the user and then allows them to add a new project. The user is prompted with a series of questions, which gather information to create a new project object. Once all the information is gathered, a successful message is displayed, as well as the project information.

The program then displays a short menu to the user with the options to edit existing projects, update contractor details, finalise a project, or to exit the program. The user types in a number corresponding to the menu choice displayed to go to their desired option. If they choose to edit an existing project, they are given further options to edit the project due date or edit the total amount paid to date. If they choose to update contractor details, they are asked a series of questions to gather new contractor information. If they choose to finalise a project, an invoice is generated (if there is money outstanding) and they are asked to enter a completion date for the project. The project status is then finalised too. After each menu option, the edited project object is displayed for the user to view. If they choose to exit the program, a successful 'Logged out' message is displayed.

## Usefulness
This Java project is useful because it shows the beginning stages of what can be a successful management system for a small company. It displays a clear, working menu and also has detailed object classes with comprehensive comments for the user to read. The UML diagram conveys an understanding of where the project is going and what its end goals hope to achieve.

How to use it
Firstly, you need to clone this repository with the  files to a local repository on your computer, so that you can access and run the program. If you need help, follow the instructions as set out github help webpage:

https://help.github.com/en/github/creating-cloning-and-archiving-repositories/cloning-a-repository
In order to run this Poised Java program, you will then need to install the Java Development Kit (JDK) onto your computer's operating system (OS):

https://www3.ntu.edu.sg/home/ehchua/programming/howto/JDK_HowTo.html#jdk-install - Use this link as a guide to downloading and installing the JDK.
You will then need to install an integrated development environment (IDE) which is a program that enables you to view, write and run Java code. A link for an IDE called 'Eclipse' is provided below:

https://www.ntu.edu.sg/home/ehchua/programming/howto/EclipseJava_HowTo.html - Use this link as a guide to downloading and installing Eclipse.

### Contributors
This project was worked on individually by myself for the software engineering bootcamp. However, the helpful mentors from Hyperion Development have reviwed the project and commented on it too!
