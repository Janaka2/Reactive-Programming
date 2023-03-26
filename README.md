# Reactive-Programming
# Spring Boot Reactive REST API

This project demonstrates a simple Reactive REST API using Spring Boot and Spring WebFlux.

## Requirements

- Java 8 or higher
- Maven

## Getting Started

To run the application, follow these steps:

1. Clone the repository:

git clone https://github.com/<username>/<repository>.git
cd <repository>

2. Build and run the application using Maven:

mvn spring-boot:run


The application will start on http://localhost:8080.

## API Endpoints

### Get Numbers

- **URL**: `/api/numbers`
- **Method**: `GET`
- **Response**: A stream of `Number` objects emitted every second, limited to 10 numbers.

## Testing the API

You can use tools like [Postman](https://www.postman.com/), [curl](https://curl.se/), or your web browser to interact with the API.

For example, to test the `GET /api/numbers` endpoint using curl, execute the following command:

curl http://localhost:8080/api/numbers


You should see a stream of numbers being emitted, one per second, up to 10 numbers.

## Contributing

To contribute to the project, please follow these steps:

1. Fork the repository.
2. Create a new branch with a descriptive name, e.g., `git checkout -b my-new-feature`.
3. Make your changes and commit them with a meaningful commit message.
4. Push your branch to your forked repository.
5. Create a pull request.

Please make sure to update tests as appropriate.

## License

[MIT](LICENSE)

# I'm Janaka Premathilaka,
📫 Feel free to reach out to me at janaka2@gmail.com , on [LinkedIn](https://www.linkedin.com/in/janakap/) or give me a call at +41 76 224 84 45. 💌 🚀
