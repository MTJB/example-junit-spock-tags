# Overview 👋
Demo project for JUnit & Spock test grouping using JUnit 5 [tags](https://junit.org/junit5/docs/current/user-guide/#running-tests-tags).

# Available test tags 🏷️
- `Spock` - Assigned at the class level to all tests in [src/test/groovy](src/test/groovy)
- `Junit` - Assigned at the class level to all tests in [src/test/java](src/test/java)
- `Multiply` - Assigned to all tests testing the [Multiply.java](src/main/java/com/mtjb/demo/math/Multiply.java)
- `Divide` - Assigned to all tests testing the [Divide.java](src/main/java/com/mtjb/demo/math/Divide.java)

# Examples 👨🏻‍🏫

## Run all tests
```
./gradlew test
```

## Run all Spock tests
```
./gradlew test -Dgroups=Spock
```

## Run all JUnit tests
```
./gradlew test -Dgroups=JUnit
```

## Run all Multiply tests
```
./gradlew test -Dgroups=Multiply
```

## Run all Multiply or Divide tests
> Note: this example is using JUnit [tag expressions](https://junit.org/junit5/docs/current/user-guide/#running-tests-tag-expressions), 
> support for exclusions could be built out by parsing the `groups` parameter and leveraging the `excludeTags` configuration.
```
./gradlew test -Dgroups="Multiply | Divide"
```