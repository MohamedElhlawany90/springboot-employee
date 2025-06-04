# Job Application Form API

A Spring Boot-based RESTful API that stores job application data submitted through a structured form. This includes full personal details, contact information, job position, and attached documents such as resume and cover letter.

---

## 🧾 Form Fields (Features)

The form collects the following information:

### 📛 Full Name:
- `firstName`  
- `middleName`  
- `lastName`  

### 🎂 Date of Birth:
- `birthMonth`  
- `birthDay`  
- `birthYear`  

### 🏠 Current Address:
- `addressLine1` — Street Address  
- `addressLine2` — Additional Address Info  
- `city` — City  
- `stateOrProvince` — State/Province  
- `postalCode` — Postal Code  

### 📞 Contact Information:
- `email` — Email Address  
- `phoneNumber` — Phone Number  
- `linkedin` — LinkedIn Profile  

### 💼 Job Details:
- `positionApplied` — Position Applied For  
- `referralSource` — How the applicant heard about the job  
- `availableStartDate` — Availability to start  

### 📎 Attachments:
- `resumeFileUrl` — URL to uploaded resume  
- `coverLetter` — Cover letter text (stored as long text)

---

## 🚀 Project Setup

**Framework:** Spring Boot  
- **Database:** MySQL (managed using MySQL Workbench)  
- **Build Tool:** Maven  
- **Testing & API Interaction:** Postman

---

## 📌 API Endpoints

- `POST /api/employees` — Submit a new application  
- `GET /api/employees` — Retrieve all applications  
- `GET /api/employees/{id}` — Get a specific application  
- `PUT /api/employees/{id}` — Update an application  
- `DELETE /api/employees/{id}` — Delete an application

---

## ▶️ Run Locally

https://github.com/MohamedElhlawany90/springboot-employee/tree/master


