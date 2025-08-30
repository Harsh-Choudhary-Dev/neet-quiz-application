# NEET Quiz Application

A comprehensive NEET (National Eligibility cum Entrance Test) preparation platform with both backend API and frontend interface for practicing biology questions.

## 🌟 Features

### Backend (Spring Boot)
- RESTful API for question management
- User authentication and API key management
- Performance tracking and analytics
- Custom quiz generation
- Answer validation

### Frontend (HTML/CSS/JavaScript)
- Responsive design
- Interactive quiz interface
- Performance dashboard
- Multiple quiz modes
- Real-time feedback

## 🛠 Tech Stack

### Backend
- Java 17
- Spring Boot 2.7.x
- Maven
- MySQL 8.0
- JPA/Hibernate

### Frontend
- Vanilla JavaScript
- HTML5/CSS3
- Fetch API for backend communication
- Chart.js for analytics

## 📂 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/neet_question_api/api/
│   │       ├── config/       # Configuration classes
│   │       ├── controller/   # REST controllers
│   │       ├── modal/        # Data models
│   │       ├── repo/         # JPA repositories
│   │       └── service/      # Business logic
│   └── resources/
│       ├── static/           # Frontend files
│       │   ├── css/          # Stylesheets
│       │   ├── js/           # JavaScript files
│       │   └── *.html        # HTML pages
│       └── application.properties
└── test/                     # Test files
```

## 🚀 Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- MySQL 8.0+
- Node.js (for frontend development, optional)

### Backend Setup
1. Clone the repository
   ```bash
   git clone <repository-url>
   cd quiz-application
   ```

2. Configure database in `src/main/resources/application.properties`
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/neet_quiz_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

3. Build and run the application
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

### Frontend Setup
The frontend is served statically from the Spring Boot application. No additional setup is required for production.

For development:
1. The frontend files are in `src/main/resources/static/`
2. Open any HTML file in a modern web browser or use a local server

## 🌐 Application Flow

1. **User Registration/Login**
   - Create an account or log in to access the dashboard
   - Generate API keys for application use

2. **Quiz Modes**
   - **Exam Mode**: Timed test simulation
   - **Custom Mix**: Select specific chapters
   - **Performance Mode**: Questions based on past performance

3. **Dashboard**
   - View performance metrics
   - Track progress over time
   - Review past attempts

## 📚 API Documentation

### Authentication
All API requests require an API key in the header:
```
X-API-KEY: your-api-key-here
```

### Key Endpoints

#### User Management
- `POST /api/owner/v1/create-account` - Register new user
- `GET /api/owner/v1/login` - User login
- `POST /api/owner/v1/create-api-key` - Generate API key

#### Quiz Operations
- `GET /api/v1/random-mix` - Get random questions
- `POST /api/v1/custom-mix/chapter-ids` - Get custom quiz
- `POST /api/v1/validate-answer` - Submit and validate answers

## 🎨 Frontend Structure

- **HTML Pages**:
  - `home.html` - Landing page
  - `dashboard.html` - User dashboard
  - `exam_quiz.html` - Quiz interface
  - `result.html` - Quiz results
  - `chapter_list.html` - Chapter selection

- **JavaScript Modules**:
  - `dashboardScript.js` - Dashboard functionality
  - `exam_quizScript.js` - Quiz logic and UI updates

## 🔧 Development

### Building for Production
```bash
mvn clean package -DskipTests
java -jar target/quiz-application-0.0.1-SNAPSHOT.jar
```

### Testing
Run the test suite:
```bash
mvn test
```

## 📊 Database Schema

The application uses the following main tables:
- `students` - User information
- `questions` - Question bank
- `student_quiz_results` - Quiz attempts
- `api_keys` - API key management
- `api_logs` - Request logging

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is proprietary and confidential. All rights reserved.

---

Made with ❤️ for NEET aspirants
