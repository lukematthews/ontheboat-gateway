# ontheboat-gateway

Gateway service for the ontheboat backend services.

The problem that this service solves is that UI servers would need to know about the host details for each service that they want to talk to. 
Say an API and Auth service. This pattern allows the end services to talk to a single host and the service then forwards the requests on based on the
path of the request sent to them.

The current configuration forwards all /api requests to the docker container marina-api:8080
