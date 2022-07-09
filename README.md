# Transactions backend with monitoring and tracing

This project demonstrates how to combine Akka, Swagger, Jaeger to build a bank transactions backend. The idea
is to start simple and progressively increment on the number of features and techstack added.

Each iteration is clearly separated by individual PRs thus providing the user with a clear snapshot of
what snippets of code were added.

Techstack used:
 - Akka
 - Kamon
 - Jaeger
 - Slick
 - Prometheus and Grafana

### Api

A simple HTTP API that can be easily extended.


### Swagger/API Docs

The create API docs run in the command line:

```
redoc-cli build apispec.yml --output index.html --options.theme.colors.primary.main=orange
```

### Performance

Basic performance tests written using Gatling to provide a basic level of traffic and therefore sample metrics.

## Prerequisites

### Docker (inc. docker-compose)

Install this by following [the documentation on the Docker website](https://docs.docker.com/engine/install/)

### SBT