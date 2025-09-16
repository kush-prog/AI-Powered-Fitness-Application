# 🏋️‍♂️ AI-Powered Fitness Application

An **AI-powered fitness tracker** built on **Microservices architecture** using Spring Boot.  
This project integrates **AI services** (via Google Gemini API) to provide intelligent fitness insights and recommendations based on user activity data.  

🔗 Repository: [AI-Powered-Fitness-Application](https://github.com/kush-prog/AI-Powered-Fitness-Application.git)

---

## 🚀 Highlights
- Fully Featured Fitness App built on Microservices Architecture  
- AI Integration in Microservices using Google Gemini API  
- Step-by-step, easy-to-follow implementation guide  

---

## 🛠 Tech Stack
- **Spring Boot**  
- **Eureka Server** (Spring Cloud Netflix)  
- **Spring Cloud Gateway**  
- **RabbitMQ** (Spring AMQP)  
- **PostgreSQL / MySQL** (Relational DB)  
- **MongoDB** (NoSQL for activity & AI service)  
- **Google Gemini API** (AI integration)  
- **Spring Cloud Config Server**

---

## 📌 Architecture Overview
The system follows a **microservices architecture**, where different services handle user, activity, and AI processing.

![Architecture Diagram](./Screenshot%202025-09-16%20201548.png)

### Flow:
1. User requests are routed through **Spring Cloud Gateway**.  
2. **User Service** manages user data (stored in MySQL/PostgreSQL).  
3. **Activity Service** manages activity logs (stored in MongoDB).  
4. Activities are sent to a **message queue (RabbitMQ)** for async processing.  
5. **AI Service** consumes queued data, processes it, and communicates with **Google Gemini API** for AI-driven insights.  
6. Results are stored in MongoDB and made available for retrieval.  
7. **Eureka Server** handles service discovery, and **Config Server** manages centralized configurations.  

---

## 📂 Project Structure
```bash
AI-Powered-Fitness-Application/
│── user-service/        # User Management
│── activity-service/    # Activity Tracking
│── ai-service/          # AI Processing & Insights
│── config-server/       # Centralized Configurations
│── eureka-server/       # Service Discovery
│── gateway-server/      # API Gateway
│── rabbitmq/            # Messaging Integration
│── docs/                # Documentation & Diagrams

🧑‍💻 Setup & Run
🔧 Prerequisites

☕ Java 17+

📦 Maven

🐳 Docker (for RabbitMQ, PostgreSQL, MongoDB)

🤖 Google Gemini API Key

🚀 Steps to Run

1️⃣ Clone the repository

git clone https://github.com/kush-prog/AI-Powered-Fitness-Application.git
cd AI-Powered-Fitness-Application


2️⃣ Start infrastructure (DBs & RabbitMQ)

docker-compose up -d


3️⃣ Run supporting services

Start Config Server

Start Eureka Server

Start Gateway Server

4️⃣ Run core microservices

cd user-service
mvn spring-boot:run

cd activity-service
mvn spring-boot:run

cd ai-service
mvn spring-boot:run

## 🔮 Future Improvements
Add Authentication & Authorization (Keycloak planned).

Extend AI insights for personalized fitness plans.
