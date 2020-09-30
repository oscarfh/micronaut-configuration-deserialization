Project to show the different Micronaut behavior when deserializing configurations in maps.

When micronaut version <= 2.0.1 in gradle.properties, the outcome my DemoTest.testItWorks is `client-id` 
and `client-secret`.
When micronaut version >= 2.0.2, then the outcome is `clientSecret` and `clientId`