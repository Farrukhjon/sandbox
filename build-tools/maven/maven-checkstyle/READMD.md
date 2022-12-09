# Checkstyle and Maven Checkstyle Plugin

## Literature and Resources

- [checkstyle](https://checkstyle.sourceforge.io/)
- [maven-checkstyle-plugin](https://maven.apache.org/plugins/maven-checkstyle-plugin/index.html)
- [Custom Checker Config](https://maven.apache.org/plugins/maven-checkstyle-plugin/examples/custom-checker-config.html)

## Maven Checkstyle Plugin Documentation

### Goals Overview

The Checkstyle Plugin has three goals:

- `checkstyle:checkstyle` is a reporting goal that performs Checkstyle analysis and generates a report on violations.
- `checkstyle:checkstyle-aggregate` is a reporting goal that performs Checkstyle analysis and generates an aggregate
  HTML
  report on violations in a multi-module reactor build.
- `checkstyle:check` is a goal that performs Checkstyle analysis and outputs violations or a count of violations to the
  console, potentially failing the build. It can also be configured to re-use an earlier analysis.

### Usage

```xml

<project>
    ...
    <build>
        <!-- To define the plugin version in your parent POM -->
        <pluginManagement>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-checkstyle-plugin</artifactId>
                    <version>3.2.0</version>
                </plugin>
                ...
            </plugins>
        </pluginManagement>
        <!-- To use the plugin goals in your POM or parent POM -->
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-checkstyle-plugin</artifactId>
                <version>3.2.0</version>
            </plugin>
            ...
        </plugins>
    </build>
    ...
    <!-- To use the report goals in your POM or parent POM -->
    <reporting>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-checkstyle-plugin</artifactId>
                <version>3.2.0</version>
            </plugin>
            ...
        </plugins>
    </reporting>
    ...
    <!-- To use the plugin goals in your POM or parent POM with defined checkstyle version -->
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-checkstyle-plugin</artifactId>
                <version>${maven.checkstyle.plugin.version}</version>
                <dependencies>
                    <dependency> <!--defined checkstyle version-->
                        <groupId>com.puppycrawl.tools</groupId>
                        <artifactId>checkstyle</artifactId>
                        <version>${checkstyle.version}</version>
                    </dependency>
                </dependencies>
            </plugin>
        </plugins>
    </build>
    ...
</project>
```

## Predefined Checkstyle configuration definitions that ship with the Checkstyle Plugin

- `sun_checks.xml` - Sun Microsystems Definition (default).
- `google_checks.xml` - Google Definition.

## Custom checkstyle configuration

```xml

<plugins>
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-checkstyle-plugin</artifactId>
        <version>${maven.checkstyle.plugin.version}</version>
        <configuration>
            <configLocation>src/main/resources/custom_checkstyle.xml <!--Can be google_checks.xml/sun_checks.xml-->
            </configLocation>
        </configuration>
    </plugin>
</plugins>
```