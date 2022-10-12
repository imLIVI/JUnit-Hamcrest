# JUnit + Hamcrest
## Description
In this task you need:
1. Rewrite the tests from the <a href="https://github.com/imLIVI/UsingJUnit.git"> UsingJUnit task </a> in the Hamcrest style
2. Add at least 2 more tests, trying to use those Hamcrest features that are not in the standard JUnit asserts

## Realization
I used:
1. Project <a href="https://github.com/imLIVI/UsingJUnit.git"> UsingJUnit task </a>
2. JUnit - framework
```xml
<dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.9.1</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```
3. Maven
```xml
<build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
            </plugin>
        </plugins>
    </build>
```
4. Hamcrest
```xml
<dependency>
            <groupId>org.hamcrest</groupId>
            <artifactId>java-hamcrest</artifactId>
            <version>2.0.0.0</version>
        </dependency>
```
