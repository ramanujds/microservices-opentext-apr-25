# Microservices Design Patterns

1. **Service Registry** pattern provides a central location for services to register themselves.
2. **Circuit Breaker** allows your services to fail fast and prevent cascading failures, the circuit breaker pattern is used to isolate a failing service.
3. **API Gateway** provides a common entry point for all the requests and responses from the system. So, the client only remembers one host/port address rather than multiple IPs for each Microservice.
4. **Event-driven architecture** allows services to communicate with each other by emitting events.
5. **Database per Service** each service has its own database, which allows services to operate independently.
6. **Command Query Responsibility Segregation (CQRS)** separates read and write requests for an application, allowing better scaling and performance.
7. **Externalized Configuration** allows storing configuration data outside of the application code, making it easier to manage configuration changes.
8. **Saga Pattern** manages the transaction for long-running transactions that span multiple services.
9. **Bulkhead Pattern** isolates failures within a microservice, so a single failure does not bring down the entire system.