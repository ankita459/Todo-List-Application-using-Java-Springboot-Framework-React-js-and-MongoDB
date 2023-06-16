# To set up and run the application, follow these steps:

1. Create a new Java project in your preferred IDE.
2. Create the following packages inside the project:
* com.example.config
* com.example.controller
* com.example.model
* com.example.repository
3. Copy and paste the provided code into the respective files in their corresponding packages:
* CorsConfig.java into the com.example.config package
* TaskController.java into the com.example.controller package
* Task.java into the com.example.model package
* TaskRepository.java into the com.example.repository package
4. Make sure you have MongoDB installed and running on your local machine. By default, it listens on port 27017.
5. Open the application.properties file and add the following configuration:
   spring.data.mongodb.uri=mongodb://localhost:27017/todo-list
   server.port=8888
6. Build the project to resolve any dependencies.
7. Run the application.
8. The application should now be running on http://localhost:8888.
9. You can use the provided React code from earlier to create a frontend application that interacts with this backend API.

# Note: Make sure to adjust the allowedOrigins in the CorsConfig.java file to match the URL of your frontend application. In the provided code, it is set to http://localhost:3000.

