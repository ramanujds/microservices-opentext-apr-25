# Monolithic
A monolithic architecture is a traditional software architecture where all components of an application are tightly integrated into a single codebase and deployed as a single unit. This often leads to challenges in scalability and maintenance.

# SOA (Service-Oriented Architecture)
SOA is an architectural style that promotes the use of loosely coupled, reusable, and interoperable services. These services communicate over a network and can be combined to create larger applications. SOA facilitates flexibility and scalability.

# Microservices
Microservices is an architectural style where an application is composed of small, independent services that communicate through well-defined APIs. Each service is responsible for a specific business capability, promoting modularity and ease of deployment.

## Microservices Design Principles
- **Domain Driven Design:** Align the architecture with the business domain.
- **Built Around Business Capabilities:** Organize services based on business functionalities.
- **Single Responsibility Principle:** Each service has a single, well-defined responsibility.
- **Loose Coupling:** Services should be independent and communicate through well-defined interfaces.
- **Decentralized Data:** Avoid central databases; each service manages its own data.
- **Failure Isolation:** Isolate failures to prevent cascading issues.
- **Fault Tolerant:** Design services to handle faults gracefully.
- **Continuous Delivery (DevOps):** Enable rapid and reliable application delivery.
- **Distributed Tracing:** Facilitate monitoring and debugging across microservices.

## Design Patterns
### Decomposition Patterns
- **Decompose by business capabilities:** Group services based on related business functionalities (e.g., Patient, ICU, Monitoring).
- **Decompose by Subdomain:** Divide services based on specific subdomains within the overall business context.
- **Strangler Pattern:** Incrementally migrate from a monolithic system to microservices.

### Integration Pattern
- **API Gateway:** Centralized entry point for managing and routing API requests.
- **Gateway Routing:** Direct incoming requests to the appropriate services.
- **Proxy Pattern:** Use a proxy to control access to a service.
- **Aggregator Pattern:** Combine data from multiple services to fulfill a request.
- **Client Side UI Composition Pattern:** Assemble user interfaces on the client side using microservices.

### Database Patterns
- **Database Per Service:** Each service has its dedicated database.
- **Shared Database per Service:** Services within the same business domain share a database.
- **CQRS (Command Query Responsibility Segregation):** Separate command and query operations for improved scalability.
- **Saga Pattern:** Manage distributed transactions across multiple microservices.

### Observability Pattern
- **Log Aggregation:** Collect and centralize logs for analysis.
- **Distributed Tracing:** Trace requests as they flow through multiple services.
- **Health Check:** Monitor the health of services.
- **Performance Metrics:** Gather metrics to assess system performance.

### Cross-cutting Concerns Patterns
- **External Configuration:** Manage configuration settings externally to facilitate changes without code modifications.

### Service Discovery Pattern
Dynamic discovery of services to enable communication in a microservices environment.

### Circuit Breaker Pattern
Prevent cascading failures by temporarily blocking requests to a failing service.

### Blue Green Deployment Pattern
Deploy new versions of services alongside existing ones, facilitating quick rollbacks.

# Cloud-native microservices
Cloud-native emphasizes building, deploying, and managing applications in cloud environments.

## How does a cloud-native approach benefit business?
1. **Increase efficiency:** Leverage cloud resources for scalability.
2. **Reduce Cost:** Optimize resource utilization and pay-as-you-go models.
3. **Ensure Availability:** Utilize cloud infrastructure for high availability.

## Cloud-native Application architecture
- **Microservices:** Enable modular and scalable development.
- **API:** Facilitate communication between services.
- **Containers:** Package applications and dependencies for consistency.
- **Continuous Integration:** Automate the integration of code changes.
- **Continuous Delivery:** Automate the deployment of applications.
- **DevOps:** Promote collaboration between development and operations teams.

## 12 Factor App
12 principles for building scalable and maintainable cloud-native applications.

1. **Codebase:** Use version control systems for collaborative development.
2. **Dependencies:** Manage external dependencies using package managers.
3. **Configuration:** Externalize configurations for flexibility.
4. **Backing Services:** Treat databases and other services as attached resources.
5. **Build, Release, Run:** Separate stages for better control and reliability.
6. **Process:** Design applications to be stateless for scalability.
7. **Port Binding:** Expose services through ports to enable communication.
8. **Concurrency:** Enable applications to perform multiple tasks simultaneously.
9. **Disposability:** Design applications for quick startup and graceful shutdown.
10. **Dev/Prod Parity:** Minimize inconsistencies between development and production environments.
11. **Logs:** Implement logging for monitoring and debugging.
12. **Admin Process:** Separate administrative tasks from the main application runtime.

# Virtualization and Containerization

## Containers
Containers package applications and their dependencies, ensuring consistency across different environments.

### Use cases:
- **Microservices**
- **DevOps**
- **Cloud-Native**

### Popular containerization technologies
1. **Docker**
2. **Podman**
3. **Kubernetes (container orchestrator)**

## Virtualization or VMs
Virtual Machines (VMs) provide a way to run multiple operating systems on a single physical machine.

### Use cases:
- **Legacy Application**
- **Resource-heavy workloads**

### Popular VM technologies
1. **VMware**
2. **VirtualBox**
3. **Hyper-V**

# Kubernetes
An open-source container orchestration platform for automating the deployment, scaling, and management of containerized applications.

- **Minikube:** Enables running Kubernetes clusters locally.
- **AWS EKS, Azure AKS, GCP GKE:** Managed Kubernetes services on cloud platforms.
- **Clusters, Nodes, Pods, Containers:** Fundamental concepts in Kubernetes for managing applications.

# Microservices Testing

Microservices testing is crucial to ensure the reliability and functionality of each service in a distributed architecture.

## Testing Styles

### Unit Testing
- **Description:** Tests individual modules of a microservice.
- **Purpose:** Verify that each component functions as expected in isolation.
- **Tools:** Frameworks like JUnit, NUnit, or Mocha.

### Integration Testing
- **Description:** Tests the interaction between different modules of a microservice.
- **Purpose:** Ensure that integrated components work together seamlessly.
- **Tools:** Postman, RestAssured, or custom scripts.

### Component Testing
- **Description:** Verifies end-to-end functionalities of given microservices in isolation.
- **Purpose:** Validate the complete workflow of a microservice.
- **Tools:** Selenium for web applications, Postman for APIs.

### Contract Testing
- **Description:** Ensures communication between services adheres to predefined contracts.
- **Purpose:** Validate that services meet the expectations defined in their contracts.
- **Tools:** Pact, Spring Cloud Contract.

### End-to-end Testing
- **Description:** Evaluates the entire application's workflow from end to end.
- **Purpose:** Confirm that the application behaves as expected in a production-like environment.
- **Tools:** Selenium, Cypress, Puppeteer.

### Performance Testing
- **Description:** Assesses the system's ability to handle varying workloads.
- **Microservice Level:** Evaluate the performance of individual microservices.
- **System Level:** Assess the overall system's performance.
- **Tools:** Apache JMeter, Gatling, Locust.

### Resilience Testing
- **Description:** Assesses a microservice's ability to recover from failures.
- **Purpose:** Ensure the system can gracefully handle faults and maintain functionality.
- **Tools:** Chaos Monkey, Pumba, Gremlin.

### Security Testing
- **Description:** Identifies vulnerabilities and weaknesses in microservices.
- **Purpose:** Ensure the system is protected against security threats.
- **Tools:** OWASP ZAP, Burp Suite, SonarQube.


### Acceptance Testing
- **Description:** Validates that the microservices meet business requirements.
- **Purpose:** Ensure the system satisfies stakeholders' expectations.
- **Tools:** Cucumber, Behave, SpecFlow.

### Regression Testing
- **Description:** Ensures that new changes do not negatively impact existing functionalities.
- **Purpose:** Detect and fix unintended side effects of code changes.
- **Tools:** Test automation frameworks, continuous integration tools.

