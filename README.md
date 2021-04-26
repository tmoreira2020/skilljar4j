Skilljar4j
==========
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/br.com.thiagomoreira.skilljar/skilljar4j/badge.svg)](https://maven-badges.herokuapp.com/maven-central/br.com.thiagomoreira.skilljar/skilljar4j)

Skilljar4j is a Java/REST client to access the Skilljar API available at [Skilljar's Developer Documentation](https://api.skilljar.com/docs). It was developed based on [OpenFeign](https://github.com/OpenFeign/feign).

### License

Skilljar4j is licensed under [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) license.

### Getting Started

It's really simple to use the client, first of all you need credentials, e.g. client_id and client_secret that must be requested at [Skilljar Add App](https://skilljar.com/api/register?register=new)

The second step is create a object of `br.com.thiagomoreira.skilljar.Skilljar` class and  start to invoke its methods. That's it!


```java
import br.com.thiagomoreira.skilljar.Skilljar;

public static void main(String[] args) {
    Skilljar skilljar = Feign.builder()
        .target(Skilljar.class, "https://api.skilljar.com");

    skilljar.ping();
}
```

### Maven/Gradle

Skilljar4j is available on Maven central, the artifact is as follows:

Maven:

```xml
<dependency>
    <groupId>br.com.thiagomoreira.skilljar</groupId>
    <artifactId>skilljar4j</artifactId>
    <version>1.0.0</version>
</dependency>
```
Gradle:

```groovy
dependencies {
    compile(group: "br.com.thiagomoreira.skilljar", name: "skilljar4j", version: "1.0.0");
}
```
### Support
Skilljar4j tracks [bugs and feature requests](https://github.com/tmoreira2020/skilljar4j/issues) with Github's issue system. Feel free to open your [new ticket](https://github.com/tmoreira2020/skilljar4j/issues/new)!

### Contributing

Skilljar4j is a project based on Maven to improve it you just need to fork the repository, clone it and from the command line invoke

```shell
mvn package
```
After complete your work you can send a pull request to incorporate the modifications.

Enjoy!