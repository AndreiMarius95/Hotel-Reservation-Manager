
Hotel-Reservation-Manager

A system for hotels to manage room bookings, categorize room types, and offer special package deals to guests.

Hello,

You will find below the technical requirements for individual projects:
1. The application should use the following tech stack:
-Spring Boot
-Java 17
-Maven
-PostgreSQL
-H2 in-memory database
-MockMVC (for integration tests)
-JUnit (for unit tests)
-Mockito (to mock dependencies for unit tests)
-Hibernate as ORM (the default one provided by Spring)
2. There should be at least four REST APIs: one for each CRUD operation.
3. At least one API should have a more complex query behind it, for example, a GET API that retrieves data with more than one @RequestParam (as in the example below). You can use either Spring Data JPA for this or a native query.

    @GetMapping
    public ResponseEntity<List<User>> getUsers(@RequestParam("name") String name,
                                                                              @RequestParam("city") String city,
                                                                              @RequestParam("gender") String gender) {
        // Logic to fetch users based on the provided criteria
    }

4. Use at least one many-to-many relationship mapping.
5. Use try-catch blocks when needed and custom exceptions.
6. Create unit tests and integration tests.
7. There is no authentication or authorization required.
8. If needed, you can use a SQL script to populate the database or you can create POST APIs for this.
9. Validate data before saving it to the database (DTO validation and/or service layer validation). If the validation is not fulfilled, the API should return a proper message and HTTP status code to the user.
10. Make sure your application was tested enough with Postman and works properly for the final demo.

Please think about a business that your application can be useful to, and identify the minimum needed functionalities that your application should have. We will validate them together before you start the implementation, but is important that you take ownership of the project right from the beginning.
If you can't figure out your business model (e.g. rent bikes app, order food app, online store app, etc), I will help you to identify a business domain for this project and pinpoint the core functionalities.
