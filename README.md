# Custom OpenAPI Generator with Azure Function Example

This project demonstrates a Maven-based Java application using Java 17. It generates API and model classes from a Swagger OpenAPI 3.0 specification using a custom OpenAPI generator. The project also includes an example API running with Azure Functions.

## Project Structure

- `pom.xml`: Maven configuration file.
- `src/main/resources/openapi/user.yaml`: OpenAPI 3.0 specification file.
- `src/main/java/com/shima/openapitools/codegen/CustomCodegen.java`: Custom OpenAPI generator implementation.
- `src/main/java/com/shima/openapitools/endpoint/ExampleGetApi.java`: Example Azure Function API endpoint.

## Prerequisites

- Java 17
- Maven
- Azure Functions Core Tools (for local development and testing)

## Setup

1. **Clone the repository:**

    ```sh
    git clone https://github.com/shima-abbasi/custom-codegen-openapitools.git
    cd custom-codegen-openapitools
    ```

2. **Build the project:**

    ```sh
    mvn clean install
    ```

3. **Generate API and model classes:**

    ```sh
    mvn openapi-generator:generate
    ```

4. **Run the Azure Function locally:**

    ```sh
    mvn azure-functions:run
    ```

## Custom OpenAPI Generator

The custom OpenAPI generator is implemented in `CustomCodegen.java`. It extends the `JavaClientCodegen` class from OpenAPI Tools and customizes the output directory, library, and package names.

## Example API

The example API is implemented in `ExampleGetApi.java`. It is an Azure Function that handles a simple GET request and returns a JSON response.
