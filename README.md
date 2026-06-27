📌 Archivo: src/main/resources/application.properties

Después de la línea:

# Activamos el perfil de pruebas por defecto
spring.profiles.active=dev

agregar lo siguiente:

spring.datasource.url=jdbc:mysql://localhost:3306/hotel_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA / Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

gemini.api.key=TU_API_KEY_AQUI

gemini.api.url=https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash-lite:generateContent

