# Chat Application
A Realtime Chat Application built using React and Kafka as MessageBroker

### Installation
Before starting the project, We need to download [Zookeeper](https://zookeeper.apache.org) and [Kafka](https://kafka.apache.org/).

You can download Kafka from [here](https://kafka.apache.org/downloads).

Extract the contents of the compressed file into a folder of your preference.
Inside the Kafka directory, go to the `bin` folder. Here you’ll find many bash scripts that will be useful for running a Kafka application.

If you are using Windows, you also have the same scripts inside the `windows` folder. This tutorial uses Linux commands, but you just need to use the equivalent Windows version if you’re running a Microsoft OS.

**Zookeeper** is basically to manage the Kafka cluster. It comes bundled with the downloaded Kafka directory. So, we need not download it separately.

To start the zookeeper, go to the *bin* directory and enter the below command.

*Start Zookeeper*
```shell script
zookeeper-server-start .\config\zookeeper.properties
```

*Start Kafka*
Next, To start the Kafka broker, run the below command in the same directory
```shell script
kafka-server-start .\config\server.properties
```

*Create a Topic*
After running Zookeeper and Apache Kafka respectively, We can create a Topic and send and receive data as Producer and Consumer.
```
kafka-topics --create --topic kafka-chat-1 --zookeeper localhost:2181 --replication-factor 1 --partitions 1
```

*Start Backend*
```
mvn spring-boot:run
```

*Start Frontend*
```
npm start
```
*Consume the topic (to test)*
```shell script
kafka-console-consumer --bootstrap-server localhost:9092 --topic kafka-chat-1
```

## Backend Development with Java, SpringBoot, and Kafka

* Project: Maven Project
* Language: Java
* Group: com.shubh
* Artifact: kafka-chat-server
* Dependencies:
    * Spring for Apache Kafka
    * Spring for Websocket

## FrontEnd Development in ReactJS
We would be create a simple chat page with list of messages and a text field at the bottom of page to send the messages to kafka backend.

#### Create React App
We will use Create React App to quickstart the app.

```
npm install --g create-react-app
create-react-app chat-ui
cd chat-ui
```
Install dependencies
    * axios
    * socketjs
    * react-stomp
    * material-ui
```
npm install socketjs react-stomp material-ui axios
```
You can refer documentation of material-ui [here](https://material-ui.com/getting-started/installation/).

```
npm start
```

# Final Result

Open the application in multiple windows and send a message in one window.All the other browser window should show the sent messages.

![chat-app](https://user-images.githubusercontent.com/5060594/80292849-7c085400-8777-11ea-8fe2-1a996bce1006.gif)

we are using SockJS to listen to the messages, which are sent from the server-side WebSocket.
