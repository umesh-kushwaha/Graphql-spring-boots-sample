# GraphQL Student API

A simple Spring Boot application that provides a GraphQL API for managing student records.

## Technologies Used

*   Java 8
*   Spring Boot 2.3.4
*   GraphQL
*   H2 Database (in-memory)

## How to Run

1.  Clone the repository.
2.  Navigate to the project directory.
3.  Run the application using the Gradle wrapper:
    ```bash
    ./gradlew bootRun
    ```
4.  The application will start on port 8080.

## API Endpoints

The application provides a GraphiQL UI for testing the API, which is available at:
`http://localhost:8080/graphiql`

### Query

**`student(name: String)`**

Retrieves a student by name.

**Example:**

```graphql
query {
  student(name: "John Doe") {
    name
    age
    phone
    address {
      street
      city
      zipcode
    }
  }
}
```

### Mutation

**`createStudent(input: StudentInput)`**

Creates a new student.

**Example:**

```graphql
mutation {
  createStudent(input: {
    name: "Jane Doe"
    age: 22
    phone: "123-456-7890"
    address: {
      street: "123 Main St"
      city: "Anytown"
      zipcode: 12345
    }
  }) {
    name
    age
  }
}
```
