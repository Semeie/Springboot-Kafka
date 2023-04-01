
# Wikimedia real-time Stream to database(Springboot, Apache Kafka, Microservices, MySQL)


## About the Project

It is a Spring boot Apache Kafka real-time Project.I created two microservices and used Kafka as a messaging system to exchange messages between microservices.

In this project, I created a Kafka producer which read a real-time stream data from the wikipedia and write the data to the Kafka broker and then created a kafka consumer which consume the real-time stream data from the Kafka broker and write to the MySQL database. 
