Student Management System

Overview

The Student Management System is a web-based application designed to manage student information efficiently. It provides functionalities for student registration, course management, and performance 
tracking, enabling administrators, teachers, and students to interact seamlessly.

Features

Student Registration: Add, update, and delete student details.

Course Management: Assign courses to students and manage course details.

Performance Tracking: Record and analyze student grades.

Admin Panel: Secure access for administrators to manage the system.

User Authentication: Login system for students, teachers, and administrators.

Technologies Used

Backend: Java, Spring Boot

Frontend: JSP, Bootstrap, HTML, CSS, JavaScript

Database: MySQL

Server: Apache Tomcat

Build Tool: Maven

Version Control: Git

Installation & Setup

Prerequisites

JDK 8 or higher

Apache Tomcat 9

MySQL Workbench

Maven

IntelliJ IDEA / Eclipse

Steps to Setup

1. Clone the repository:

        git clone https://github.com/yourusername/StudentManagementSystem.git

2. Navigate to the project directory:

      cd StudentManagementSystem

3. Configure the MySQL database:

  -> Create a new database: student_management

  -> Update database credentials in application.properties

4. Build the project using Maven:

      mvn clean install

5. Deploy the application on Tomcat:

  -> Place the generated .war file in the webapps folder of Tomcat.

  -> Start the Tomcat server.

6. Access the application in a browser:

      http://localhost:8080/StudentManagementSystem

Usage

   -> Admin: Can add/remove students, assign courses, and manage student records.

  -> Teacher: Can update student grades and attendance.

  -> Student: Can view enrolled courses and grades.

Future Enhancements

  -> Implement RESTful APIs for a React.js frontend.

  -> Role-based access control (RBAC).

  -> Generate student reports as PDF.

  -> Add real-time notifications.    

Contributing

  -> Feel free to fork this repository and contribute by submitting a pull request.

License

  -> This project is licensed under the MIT License.

Contact

For any issues or suggestions, contact Subash at subashsenthil.js@gmail.com
