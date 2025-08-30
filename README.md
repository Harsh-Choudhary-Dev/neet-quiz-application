# NEET Quiz API

A RESTful API for NEET (National Eligibility cum Entrance Test) quiz application that provides access to questions, performance tracking, and user management.

## Tech Stack
- Java 17
- Spring Boot
- Maven
- MySQL
- JPA/Hibernate

## API Endpoints

### User Management
- `POST /api/owner/v1/create-account` - Create a new user account
  - Parameters: `email`, `username`
- `GET /api/owner/v1/login` - User login
  - Parameters: `email`
- `POST /api/owner/v1/create-api-key` - Generate new API key
  - Parameters: `userId`, `api_name`
- `POST /api/owner/v1/delete-api-key` - Delete an API key
  - Parameters: `userId`, `api_id`
- `GET /api/owner/v1/api-logs` - Get API usage logs
  - Parameters: `userId`
- `GET /api/owner/v1/api-keys` - List all API keys for a user
  - Parameters: `userId`

### Quiz Endpoints
- `POST /api/v1/random/chapter-ids` - Get questions from specific chapters
  - Request Body: List of `ChapterIds`
- `GET /api/v1/random-mix` - Get random questions
- `POST /api/v1/custom-mix/chapter-ids` - Get custom mix of questions
  - Request Body: List of `ChapterIds`
- `GET /api/v1/performance-based-mock` - Get questions based on performance
  - Parameters: `student_id`
- `POST /api/v1/validate-answer` - Validate quiz answers
  - Request Body: List of `AnswerValidation` objects
- `POST /api/v1/student-id` - Generate unique student ID
  - Request Body: Student details

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven
- MySQL Server

### Installation
1. Clone the repository
2. Configure your database settings in `application.properties`
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

The application will start on `http://localhost:8080`

## Database Schema

The database schema is managed by Hibernate. The main entities include:
- `Students` - User information
- `Questions` - Quiz questions
- `StudentQuizResults` - Quiz performance tracking
- `ApiKeys` - API key management
- `ApiLogs` - API usage logs

## Authentication
API endpoints are secured using API keys. Include your API key in the request header:
```
X-API-KEY: your-api-key-here
```

## Error Handling
The API returns appropriate HTTP status codes and error messages in case of failures.

## Contributing
1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a new Pull Request

## License
This project is proprietary and confidential.
