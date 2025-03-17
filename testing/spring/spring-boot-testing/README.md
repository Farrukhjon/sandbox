# Spring and Spring Boot Testing Features
## Test modules (jars) and Dependencies (tree)
- spring-boot-starter-test.jar
  - spring-test.jar
  - spring-boot-test.jar
  - spring-boot-test-autoconfigure.jar
  - junit-jupiter.jar
## [Spring Test spring-test.jar](https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html)
### [Spring’s testing Annotations(spring-test.jar)](https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html#integration-testing-annotations):
 - Spring Testing Annotations
 - Standard Annotation Support
 - Spring JUnit 4 Testing Annotations
 - Spring JUnit Jupiter Testing Annotations
 - Meta-Annotation Support for Testing
### [Spring Testing Annotations](https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html#integration-testing-annotations-spring):
 - @BootstrapWith
 - @ContextConfiguration
 - @WebAppConfiguration
 - @ContextHierarchy
 - @ActiveProfiles
 - @TestPropertySource
 - @DynamicPropertySource
 - @DirtiesContext
 - @TestExecutionListeners
 - @RecordApplicationEvents
 - @Commit
 - @Rollback
 - @BeforeTransaction
 - @AfterTransaction
 - @Sql
 - @SqlConfig
 - @SqlMergeMode
 - @SqlGroup
### [Standard Annotation Support](https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html#integration-testing-annotations-standard)
 - @Autowired
 - @Qualifier
 - @Value
 - @Resource (javax.annotation) if JSR-250 is present
 - @ManagedBean (javax.annotation) if JSR-250 is present
 - @Inject (javax.inject) if JSR-330 is present
 - @Named (javax.inject) if JSR-330 is present
 - @PersistenceContext (javax.persistence) if JPA is present
 - @PersistenceUnit (javax.persistence) if JPA is present
 - @Required
 - @Transactional (org.springframework.transaction.annotation) with limited attribute support

### [Spring JUnit5 (Jupiter) Testing Annotations](https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html#integration-testing-annotations-junit-jupiter)
The following annotations are supported when used in conjunction with the SpringExtension and JUnit5 (Jupiter) (that is,
the programming model in JUnit 5):
 - @SpringJUnitConfig
 - @SpringJUnitWebConfig
 - @TestConstructor
 - @NestedTestConfiguration
 - @EnabledIf
 - @DisabledIf

### [Meta-Annotation Support for Testing](https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html#integration-testing-annotations-meta)
You can use most test-related annotations as meta-annotations to create custom composed annotations and reduce
configuration duplication across a test suite. You can use each of the following as a meta-annotation in conjunction
with the TestContext framework.
 - @BootstrapWith
 - @ContextConfiguration
 - @ContextHierarchy
 - @ActiveProfiles
 - @TestPropertySource
 - @DirtiesContext
 - @WebAppConfiguration
 - @TestExecutionListeners
 - @Transactional
 - @BeforeTransaction
 - @AfterTransaction
 - @Commit
 - @Rollback
 - @Sql
 - @SqlConfig
 - @SqlMergeMode
 - @SqlGroup
 - @SpringJUnitConfig (only supported on JUnit Jupiter)
 - @SpringJUnitWebConfig (only supported on JUnit Jupiter)
 - @TestConstructor (only supported on JUnit Jupiter)
 - @TestConfiguration  
 - @NestedTestConfiguration (only supported on JUnit Jupiter)
 - @EnabledIf (only supported on JUnit Jupiter)
 - @DisabledIf (only supported on JUnit Jupiter)

## [Spring Boot Testing Features](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-testing)
 - Test Scope Dependencies
 - Testing Spring Applications (spring-test.jar)
 - Testing Spring Boot Applications (Spring Boot Testing Feature)
 - Test Utilities
### [Test Scope Dependencies](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-test-scope-dependencies)
 - The spring-boot-starter-test “Starter” (in the test scope) contains the following provided libraries:
 - JUnit 5: The de-facto standard for unit testing Java applications.
 - Spring Test & Spring Boot Test: Utilities and integration test support for Spring Boot applications.
 - AssertJ: A fluent assertion library.
 - Hamcrest: A library of matcher objects (also known as constraints or predicates).
 - Mockito: A Java mocking framework.
 - JSONassert: An assertion library for JSON.
 - JsonPath: XPath for JSON.
### [Testing Spring Applications](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-testing-spring-applications)
Often, you need to move beyond unit testing and start integration testing (with a Spring ApplicationContext). It is useful to be able to perform integration testing without requiring deployment of your application or needing to connect to other infrastructure.
The Spring Framework includes a dedicated test module for such integration testing. You can declare a dependency directly to org.springframework:spring-test or use the spring-boot-starter-test “Starter” to pull it in transitively.
If you have not used the spring-test module before, you should start by reading the relevant section of the Spring Framework reference documentation.

### [Testing Spring Boot Applications](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-testing-spring-boot-applications)
#### Spring Boot Testing Annotations
- @SpringBootTest
- ApplicationContextRunner
- @MockBean and @MockBeans
- @SpyBean and @SpyBeans
- @TestComponent
#### Spring Boot Test Utilities
- ConfigFileApplicationContextInitializer (ConfigDataApplicationContextInitializer)
- TestPropertyValues
- OutputCapture
- TestRestTemplate
#### Spring Boot Autoconfiguration Testing Annotations
- @OverrideAutoConfiguration
- @AutoConfigureCache
- @RestClientTest
- @AutoConfigureWebClient
- @AutoConfigureMockMvc
- @AutoConfigureWebMvc
- @WebMvcTest
- @PropertyMapping
  