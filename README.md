
# Wikimedia real-time Stream to database(Springboot, Apache Kafka, Microservices, MySQL)
![KafkaProject](./Screenshot/ProjectWikimedia.png)

## Information

- Apache Kafka is an event streaming platform used to collect, process, store, and integrate data at scale. It has numerous use cases including distributed streaming, stream processing, data integration, and pub/sub messaging.
- A broker refers to a server in the Kafka storage layer that stores event streams from one or more sources. A Kafka cluster is typically comprised of several brokers. Every broker in a cluster is also a bootstrap server, meaning if you can connect to one broker in a cluster, you can connect to every broker.
-  Topic is a logical name to which the records are published. A topic is a log of events, similar to a folder in a filesystem, where events are the files in that folder.Topics are broken up into partitions, meaning a single topic log is broken into multiple logs located on different Kafka brokers.
- Producers are clients that write events to Kafka. The producer specifies the topics they will write to and the producer controls how events are assigned to partitions within a topic.
- Consumers are clients that read and process events from Kafka.

## About the Project

It is a Spring boot Apache Kafka real-time Project that have two microservices and used Kafka as a messaging system to exchange messages between microservices.

In this project, a Kafka producer created which read a real-time stream data from the wikipedia (https://stream.wikimedia.org/v2/stream/recentchange) 
and write the data to the Kafka broker 
and then created a kafka consumer which consume the real-time stream data from the Kafka broker and write to the MySQL database. 

## Screenshots
<details>
<summary>Click here to show the screenshots of project</summary>
 <br>
 <p> producer </p>
 <img src ="Screenshot/producer.png">
 <p> consumer </p>
 <img src ="Screenshot/consumer.png">
 <p> MySQL database </p>
 <img src ="Screenshot/MySQL database.png">
 </details>
