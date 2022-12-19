FROM eclipse-temurin:17
WORKDIR /build
COPY ./mvnw .
COPY ./.mvn/ .mvn/
COPY ./pom.xml .
COPY ./src/ src/
RUN chmod +x mvnw
Run sed -i 's/\r$//' mvnw
RUN ./mvnw package
FROM openjdk:11
WORKDIR /app
COPY --from=build-stage /build/target/api-*jar /app/QuotesBE.jar
EXPOSE 8080
CMD ["java", "-jar", "QuotesBE.jar"]
