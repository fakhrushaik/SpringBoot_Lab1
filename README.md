# Building Your First Spring Controller

**Name:** Fakhruddin Shaik  
**Student ID:** M15139187  

---

## 📌 Project Description
This is a basic Spring Boot web application that demonstrates routing with a controller and multiple pages.  
The application includes:
- A **homepage** (`/`) that displays a hello message with my full name.  
- An **about page** (`/about`) that displays my student information (name, ID, bio, contact).  

---

## ⚙️ Technologies Used
- Java  
- Spring Boot  
- Spring Web  
- Thymeleaf  
- Maven  

---

## 🚀 How to Run the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/fakhrushaik/SpringBoot_Lab1.git
   cd SpringBoot_Lab1 
   ```
    
2. Run the Application 
   ```bash
   mvn spring-boot:run
   ```

3. Open in your browser: 
   * http://localhost:8081/ → Homepage
   * http://localhost:8081/about → About page
   ### ⚠️ Note: The app runs on port 8081 instead of 8080 due to a port conflict. 

--- 

## 🖼️ Pages

- Homepage (index.html):  
  Displays: “Hello, my name is Fakhruddin Shaik.”

- About Page (about.html):  
  Displays:
   * Full name: Fakhruddin Shaik 
   * Student ID: M15139187 
   * Short bio (1–2 sentences) 
   * Contact details (email, GitHub)