## Create a topic
```bash
kafka-topics.sh --bootstrap-server localhost:9092 --topic notes-app-events --create
```

## List all topics
```bash
kafka-topics.sh --bootstrap-server localhost:9092 --list
```

## Describe a topic
```bash
kafka-topics.sh --bootstrap-server localhost:9092 --topic notes-app-events --describe
```

## Delete a topic
```bash
kafka-topics.sh --bootstrap-server localhost:9092 --topic notes-app-events --delete
```

## Produce a message
```bash
kafka-console-producer.sh --bootstrap-server localhost:9092 --topic notes-app-events
```

## Consume messages
```bash
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic notes-app-events
```

## Consume messages from the beginning
```bash
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic notes-app-events --from-beginning
```

