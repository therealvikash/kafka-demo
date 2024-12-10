# kafka-demo
This is a demo application illustrating the implementation of kafka using spring boot application.
fraud-report is the application that serializes the pojo object and produces string message to the kafka-topic
fraud-report-check is the application that consumes the message from kafka-topic and deserializes the string message into pojo object.
