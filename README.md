# notification-api

## model

profile type is an enum on Java (We can create a table instead)

channel type is an enum on Java (We can create a table instead)

![model notifications](https://github.com/9uilherme/notification-api/blob/joined-approach/src/main/resources/model-notifications.png)

## to start

docker run --name dev-postgres -p 5432:5432 -e POSTGRES_PASSWORD=postgres -d postgres:11

docker exec dev-postgres psql -U postgres -c"CREATE DATABASE vaktdb" postgres
