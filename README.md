# Maven Project for API and Model Generation from Swagger OAS 3

## Overview
This project is a Maven-based Java application that generates API and model classes from a Swagger OpenAPI Specification (OAS) 3.0 document. It uses a custom OpenAPI generator built on top of the OpenAPI Tools code generator. The project also includes an example API running on Azure with Quarkus.

## Features
- **Java 17**: Utilizes the latest features and improvements of Java 17.
- **Maven**: Manages project dependencies and build lifecycle.
- **Swagger OAS 3**: Generates API and model classes from an OpenAPI Specification 3.0 document.
- **Custom OpenAPI Generator**: Built on top of OpenAPI Tools code generator for customized code generation.
- **Quarkus**: Example API implementation running on Azure.

## Getting Started

### Prerequisites
- **Java 17**: Ensure Java 17 is installed on your machine.
- **Maven**: Install Maven for managing project dependencies and build lifecycle.
- **Azure Account**: Required for deploying the example API.

### Installation
1. **Clone the repository**:
    ```sh
    git clone https://github.com/shima-abbasi/custom-codegen-openapitools
    cd custom-codegen-openapitools
    ```

2. **Build and run the project locally**:
    ```sh
    mvn clean install
    ```

3. **Generate API and model classes**:
   ```sh
   mvn clean package azure-functions:run
   ```
