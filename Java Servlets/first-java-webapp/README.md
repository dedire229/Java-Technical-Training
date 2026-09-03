# First Java Web Application

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](https://maven.apache.org/)
[![Java Version](https://img.shields.io/badge/java-8%2B-orange)](https://www.oracle.com/java/)
[![Servlet API](https://img.shields.io/badge/api-Jakarta%20EE%2010-blue)](https://jakarta.ee/specifications/servlets/)

A foundational Java-based web application demonstrating the implementation of the Model-View-Controller (MVC) pattern using Java Servlets and JavaServer Pages (JSP). This project serves as a reference implementation for developing scalable server-side components within the Java ecosystem.

## Table of Contents
- [Architecture Overview](#architecture-overview)
- [Technical Specifications](#technical-specifications)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Build Process](#build-process)
- [Deployment Guide](#deployment-guide)
- [API Endpoints](#api-endpoints)
- [Project Structure](#project-structure)

## Architecture Overview

The application follows a decoupled architecture where:
- **View Layer**: Handled by `index.jsp`, providing a static entry point for the user.
- **Controller Layer**: Managed by `FirstServlet`, which processes incoming HTTP GET requests and generates dynamic HTML responses.
- **Packaging**: Compiled into a `.war` (Web Application Archive) for standardized deployment across Java EE compliant containers.

## Technical Specifications

| Component | Technology | Version | Role |
| :--- | :--- | :--- | :--- |
| **Runtime** | Java JDK | $\ge$ 8 | Execution Environment |
| **Build Tool** | Apache Maven | 3.x | Dependency & Lifecycle Management |
| **Web API** | Jakarta Servlet | 6.0.0 | Server-side Request Handling |
| **Templating** | JSP | 2.x | View Layer Rendering |
| **Container** | Apache Tomcat | 10.x | Servlet Container |

## Getting Started

### Prerequisites
Ensure the following environment variables and tools are configured on your system:
- **JDK**: Java Development Kit installed and `JAVA_HOME` set.
- **Maven**: Installed and available in the system `PATH`.
- **Tomcat**: Apache Tomcat 10+ installed for Jakarta EE 10 compatibility.

### Build Process
Execute the following command in the project root to compile the source code and package the application:

```bash
mvn clean package
```

**Output**: The resulting artifact `first-java-webapp.war` will be generated in the `target/` directory.

## Deployment Guide

### Manual Deployment
1. Navigate to the `target/` directory.
2. Copy `first-java-webapp.war` to the `{TOMCAT_HOME}/webapps/` directory.
3. Start the server using `{TOMCAT_HOME}/bin/startup.sh` (or `startup.bat` on Windows).

### IDE-Based Deployment (Eclipse/IntelliJ)
1. Import the project as a **Maven Project**.
2. Configure a **Server Runtime** pointing to your Tomcat installation.
3. Right-click the project $\rightarrow$ **Run As** $\rightarrow$ **Run on Server**.

## API Endpoints

Assuming the application is deployed with the default context path `/first-java-webapp` on `localhost:8080`:

| Endpoint | Method | Description | Expected Result |
| :--- | :--- | :--- | :--- |
| `/` | GET | Root landing page | Returns `index.jsp` ("Hello World!") |
| `/HelloServlet` | GET | Dynamic greeting servlet | Returns "Welcome to my first servlet" |

## Project Structure

```text
first-java-webapp/
├── pom.xml                      # Project Object Model (Maven configuration)
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── raunak/
        │           └── FirstServlet.java  # Controller logic for dynamic responses
        └── webapp/
            ├── index.jsp         # Static view component
            └── WEB-INF/
                └── web.xml       # Deployment descriptor for the servlet container
```

---
*Developed as a technical demonstration of Java EE / Jakarta EE fundamentals.*
