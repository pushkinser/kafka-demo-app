# kafka-demo-app

Live coding demo app https://youtu.be/rWT5Go9NL94

Install and start Zookeeper server:
`apache-zookeeper-3.5.7-bin\bin>zkServer`

Install and start Kafka:
`kafka_2.13\bin\windows>.\bin\windows\kafka-server-start.bat .\config\server.properties`

Create topic for kafka-demo-app:
`kafka_2.13\bin\windows>kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test`

Should see `Created topic test.`

Run `kafka-demo-app`.

For send message use `curl localhost:APP_PORT/starship/test`.
See APP_PORT in app console log, e.g:
`Tomcat started on port(s): 63441 (http) with context path`. It's mean APP_PORT = 63441. 

<br>
And also can open kafka's terminal for test topic and see app result.
<br>
<b>Producer</b>: `kafka_2.13\bin\windows>kafka-console-producer.bat --broker-list localhost:9092 --topic test`
<br>
<b>Consumer</b>: `kafka_2.13\bin\windows>kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test`
