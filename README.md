A simple project that looks at separating application code and its unit tests from the Serenity acceptance tests via gradle sub-projects.

### Examples
To generate Serenity reports run these tasks
`./gradlew acceptance:test acceptance:aggregate`

To run the Spock tests on the application
`./gradlew app:test`