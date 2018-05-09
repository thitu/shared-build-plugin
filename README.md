# Shared Build Plugin

A gradle plugin to provide consistent versioning of dependencies across disparate Java and Android projects.

## Usage

- First, in your project's top level `buildscript` block, add the plugin's classpath as a dependency:

```groovy
buildscript {
  dependencies {
    classpath "com.trusona.plugins:trusona-build-plugin:5.0.0"
  }
}
```

- Second, apply the plugin to your project module:

```groovy
apply plugin: "com.trusona.plugins.build-plugin"
```

- Third, update your dependencies. 
- Before the plugin, a typical [SLF4J](https://www.slf4j.org) dependency entry would look like this:

```groovy
compile "org.slf4j:slf4j-api:1.7.25"
```

With the plugin, it would be modified to this:

```groovy
compile "org.slf4j:slf4j-api:${trusona.version('slf4j')}"
````

- To see the [list](https://github.com/thitu/shared-build-plugin/blob/master/src/main/resources/com/trusona/plugins/gradle/build/internal/trusona-versions.properties)
of supported dependencies `short-codes` and version values, dump the output with:

```groovy
println trusona.versionsAsJson()
```
