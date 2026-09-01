# first-jdbc-project 

If you run `JDBCMySQLConnector.java` as a Java Application without adding the dependencies, the following error message pops up in the console:

```
Something went wrong: 
No suitable driver found for jdbc:mysql://localhost:3306/world

0 is row effected
```

Open `pom.xml` and add the following dependency inside `dependencies` tag. 
```
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <version>9.4.0</version>
    </dependency>
```

This adds the JDBC MySQL Driver to the Maven project.
