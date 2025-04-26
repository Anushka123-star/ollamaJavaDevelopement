# ollamaJavaDevelopement

# 🧠 Ollama Chatbot (Spring Boot + LLaMA2)

This project is a simple chatbot web application that connects a **Spring Boot** backend with the **Ollama LLaMA2 model** running locally. You can ask questions in the frontend and get AI-generated answers from the local LLM.

---

## 📸 Demo

![image](https://github.com/user-attachments/assets/b075886f-e087-4e9b-a52b-18e69e9e9c37)

---

## 🔧 Tech Stack

- 💬 [Ollama](https://ollama.com/) - Running LLaMA2 model locally
- ☕ Spring Boot (Java 17+)
- 🌐 REST API
- 🌈 HTML/CSS/JavaScript (Vanilla)
- 🧠 Spring AI (with Ollama & Mistral support)

---

## 🚀 Prerequisites

- Java 17 or higher
- Maven
- Ollama (installed locally)

---
## 📦 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/Anushka123-star/ollamaJavaDevelopement.git
cd ollamaJavaDevelopement
``` 
### 2. Run Ollama locally

```bash
ollama serve
ollama run llama2
```
Tip: ollama serve is used to make sure that ollama is running on http://localhost:11434(default). 

### 3. Run Spring Boot App

```bash
mvn clean install
mvn spring-boot:run
```
The app will run on http://localhost:8080

### 4. 🌐 Access the Frontend

```bash
http://localhost:8080/index.html
```
