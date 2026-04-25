# WhatsApp Bot

This is a Spring Boot application that serves as a webhook backend for a WhatsApp bot.

## Features
- Handles WhatsApp Webhook events
- Processes incoming messages
- Sends automated responses

## Prerequisites
- Java Development Kit (JDK) 17 or higher
- Maven
- Meta/WhatsApp Business API account and credentials

## Getting Started

### Configuration
Update the `src/main/resources/application.yml` or `application.properties` with your WhatsApp API credentials and Webhook Verify Token.

### Build and Run

To build the project:
```bash
./mvnw clean install
```

To run the application:
```bash
./mvnw spring-boot:run
```

The application will start on port 8080 by default.

## Local Development & Testing
To test the webhook locally, you can use tools like [Ngrok](https://ngrok.com/) to expose your local port `8080` to the internet so that WhatsApp can reach your endpoint:

```bash
ngrok http 8080
```
Then, update your Meta App dashboard with the generated Ngrok HTTPS URL.

## API Testing
You can test the application using Postman as shown below:

![Postman Screenshot](postman-screenshot.png)
