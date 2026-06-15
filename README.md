I created this project to demonstrate why `findById` can sometimes be an anti-pattern.

## Main classes
- The [ProductClassicCreateService](src/main/java/com/saadMeddiche/findById_anti_pattern/services/ProductClassicCreateService.java) uses `findById` to fetch owner's product.
- The [ProductReferenceCreateService](src/main/java/com/saadMeddiche/findById_anti_pattern/services/ProductReferenceCreateService.java) uses `getReferenceById` to reference owner's product.

## APIs
- Use [create_person](https/create_person.http) to create a person.
- Use [create_product](https/create_product.http) to create a product.
    - /products/reference -> `getReferenceById`
    - /products/classic -> `findById`