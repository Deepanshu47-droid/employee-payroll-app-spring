UC7: Implementing Logging using Lombok in Employee Payroll App

Objective

This use case introduces logging in the Employee Payroll Application using Lombok's @Slf4j annotation. Logging helps in tracking application flow, debugging issues, and monitoring performance.

Key Features

Enable Logging using Lombok: The @Slf4j annotation is used at the class level to automatically provide a logger instance.

Log Important Events: Logging statements are added to service methods to track operations such as employee creation, retrieval, updating, and deletion.

Different Logging Levels: The logs include different levels like INFO, DEBUG, and ERROR for better tracing.

Configure Logging in application.properties:

Logging behavior can be adjusted based on environment profiles (dev, prod, etc.).

Logs can be directed to the console or a file as required.

Steps to Implement
1. 
2. Add Lombok Dependency
   
3. Ensure that the Lombok dependency is added to pom.xml:

<dependency>

<groupId>org.projectlombok</groupId>

<artifactId>lombok</artifactId>

<version>1.18.26</version>

<scope>provided</scope>

</dependency>

2. Enable Lombok in IDE

3. For Eclipse and IntelliJ: Download and run the Lombok JAR file to install Lombok support in the IDE.
   
4. For VS Code: Install the Lombok extension from the marketplace.
     
5. Use @Slf4j in Service Layer

In the EmployeeService class, add the @Slf4j annotation to enable logging:

4. Configure Logging in application.properties
   Set the logging level and output settings:

# Set the active profile
spring.profiles.active=dev

# Logging Configuration

logging.level.root=INFO

logging.level.com.payroll=DEBUG

logging.file.name=logs/app.log

logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss} - %msg%n

Testing Logging
   Run the application and check the logs in the console or the log file (logs/app.log).

Expected Output in Logs (Example)

2025-02-24 10:15:32 - INFO - Searching for Employee with Name: Raj and Salary: 50000.0

2025-02-24 10:16:12 - INFO - Employee Created: EmployeeEntity{name='Shubham', salary=45000.0}

Conclusion

Logging is now integrated using Lombok's @Slf4j annotation.

All important actions are logged for debugging and monitoring.

Logging can be configured dynamically using application.properties.
