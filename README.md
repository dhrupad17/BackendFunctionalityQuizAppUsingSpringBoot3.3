# Monolithic Backend Quiz Application

## Project Description

The Monolithic Backend Quiz Application is a comprehensive solution designed to manage quiz questions and quizzes efficiently. It operates as a single, unified system, following a layered architecture pattern that includes the Model, Repository, Service, and Controller layers. This application provides functionalities to add, update, delete, and retrieve quiz questions, as well as to create and manage quizzes. It supports multiple categories, such as Java and Python, and facilitates a seamless user experience by randomly selecting questions based on the chosen category. The application also calculates quiz results and provides feedback in percentage terms.

## Project Features

- **Question Management**
  - **Add Questions**: Allows users to add new questions with options, correct answers, difficulty levels, and categories.
  - **Update Questions**: Enables modification of existing questions, including their options and correct answers.
  - **Delete Questions**: Provides the capability to remove questions from the database.
  - **Get All Questions**: Retrieves a list of all questions stored in the system.
  - **Get Questions by Category**: Fetches questions based on the specified category (e.g., Java, Python).

- **Quiz Management**
  - **Create Quiz**: Facilitates the creation of a new quiz by specifying the category, number of questions, and quiz title. Questions are randomly selected based on the category.
  - **Get Quiz Questions**: Retrieves all questions included in a specific quiz by its ID.

- **Quiz Interaction**
  - **Submit Quiz**: Allows users to submit their answers for a quiz. The submission process evaluates responses and calculates the number of correct answers.
  - **Calculate Result**: Computes the percentage accuracy of the quiz based on the number of correct answers and total questions, providing feedback to users.

- **Random Question Selection**
  - **Randomly Select Questions**: Ensures that the questions included in a quiz are picked randomly from the pool of questions in the selected category, enhancing the variety of quiz experiences.

This Monolithic Backend Quiz Application is designed to offer a robust and scalable solution for managing quizzes and questions and I have converted it into Microservices Backend Application. [Check Here](https://github.com/dhrupad17/QuizAppUsingMicroservices)

## Tools Used:

<p align="center">
  <a href="https://skillicons.dev">
    <table>
      <tr>
        <td><img src="https://skillicons.dev/icons?i=idea" alt="IntelliJ IDEA" /></td>
        <td><img src="https://skillicons.dev/icons?i=git" alt="Git" /></td>
        <td><img src="https://skillicons.dev/icons?i=java" alt="Java" /></td>
        <td><img src="https://skillicons.dev/icons?i=maven" alt="Maven" /></td>
        <td><img src="https://skillicons.dev/icons?i=postgres" alt="PostgreSQL" /></td>
        <td><img src="https://skillicons.dev/icons?i=postman" alt="Postman" /></td>
        <td><img src="https://skillicons.dev/icons?i=spring" alt="Spring" /></td>
      </tr>
      <tr>
        <td align="center">IntelliJ IDEA</td>
        <td align="center">Git</td>
        <td align="center">Java</td>
        <td align="center">Maven</td>
        <td align="center">PostgreSQL</td>
        <td align="center">Postman</td>
        <td align="center">SpringBoot</td>
      </tr>
    </table>
  </a>
</p>


## Project Directory Structure:

![image](https://github.com/user-attachments/assets/c1d3a123-dcfe-4af3-85c0-81d894f2fc4d)

## Database Directory Structure:

![image](https://github.com/user-attachments/assets/4474994a-0992-459b-9caf-8ca8baa37405)

## Application Functionality

| **Feature**       | **Description**                                                      | **Screenshot** |
|-------------------|----------------------------------------------------------------------|----------------|
| **Add Question**  | Allows users to add new questions with options, correct answers, difficulty levels, and categories. | ![image](https://github.com/user-attachments/assets/f123d359-e6cc-44b7-9683-edf045541487) |
| **Update Question** | Enables modification of existing questions. | ![image](https://github.com/user-attachments/assets/ade87173-566e-4683-8bc5-d683917732de) |
| **Delete Question** | Provides the capability to remove questions from the database. | ![image](https://github.com/user-attachments/assets/28dd34a9-9184-49d5-ab13-500435e87f75) |
| **Get All Questions** | Retrieves a list of all questions stored in the system.|![image](https://github.com/user-attachments/assets/5d643f1d-fd65-45cb-aef0-7b83812ca847) |
| **Get Questions by Category** | Fetches questions based on the specified category (e.g., Java, Python).| ![image](https://github.com/user-attachments/assets/a446eec8-2fe4-46c0-86e2-fbd75b113ae6) |
| **Create Quiz** | Facilitates the creation of a new quiz by specifying the category, number of questions, and quiz title. | ![image](https://github.com/user-attachments/assets/71a604b8-eacd-4d8f-b3aa-83f68313da9a) |
| **Get Quiz Questions** | Retrieves all questions included in a specific quiz by its ID. | ![image](https://github.com/user-attachments/assets/579b555e-71c0-47d6-a1d6-5499f297ef91) |
| **Submit Quiz and Calculate Result ** | Allows users to submit their answers for a quiz and calculates the result and Computes the percentage accuracy of the quiz and provides feedback. | ![image](https://github.com/user-attachments/assets/6c1eccfb-f8b7-4e24-ab08-f66bc975b6a4) |







