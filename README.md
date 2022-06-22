# Proyecto sanitas

1.- Para compilar el proyecto se debe ejecutar el comando de Maven:

mvn clean install

El cual generará en la carpeta "target" el fichero calculator-0.0.1-SNAPSHOT.jar

2.- Para ejecutar el microservicio en local se debe ejecutar el comando:

mvn spring-boot:run

3.- URL local para probar desde un cliente:

http://localhost:8081/sanitas/calculator

4.- Requests de prueba:

A) {
"operator": "ADDITION",
"operands": [
31,
25
]
}

B) {
"operator": "SUBTRACTION",
"operands": [
31,
25
]
}