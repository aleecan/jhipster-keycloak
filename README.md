
Run Keycloak using Docker:

    docker run --name=keycloak -p 9000:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin jboss/keycloak

Once it boots, you can login using admin/admin on http://localhost:9000/

 - [service1] is an example of Jhipster microservice using bearer


TODO

- Add realm import file
- Add ng4 app