
Run Keycloak using Docker:

    docker run --name=keycloak -p 9000:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin jboss/keycloak

Once it boots, you can login using admin/admin for the first login on http://localhost:9000/
