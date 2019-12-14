# Validation

## Validation using annotations
Using Hibernate validations, annotations can be set on the fields of a class. This will describe the validation of the object.
However validation will only take place, once the validator is called. (See [tests](./../../../test/java/com/barcoding/episode3annotations/validation/annotations))

This means an invalid object can still be created.

## Validation using plain Java

Validation of objects can also be done using plain Java. In our [example](./nonannotations/Podcast.java) a `validate` method is implemented which throws custom exceptions if a condition is met.
This method can be called in the constructor to avoid the creation of an invalid object.