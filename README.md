[![Build Status](https://travis-ci.org/lighthauz/trusona-build-plugin.svg?branch=release)](https://travis-ci.org/lighthauz/trusona-build-plugin)

# Trusona Build Plugin

A gradle plugin to provide consistent versioning of dependencies across disparate Java and Android projects.

## Usage

- First, in your project's top level `buildscript` block, add the plugin's classpath as a dependency:

```groovy
buildscript {
  dependencies {
    classpath "com.trusona.plugins:trusona-build-plugin:4.3.0"
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

- To see the [list](https://github.com/lighthauz/trusona-build-plugin/blob/master/src/main/resources/com/trusona/plugins/gradle/build/trusona-versions.properties)
of supported dependencies `short-codes` and version values, dump the output with:

```groovy
println trusona.versionsAsJson()
```

### Current `short-codes` and the corresponding `versions`:

```json
{
  "securesharedpreferences": "1.2.0",
  "ok-http": "3.9.0",
  "android-support": "26.1.0",
  "slf4j": "1.7.25",
  "jackson": "2.8.9",
  "calligraphy": "2.3.0",
  "groovy": "2.4.11",
  "guava8": "23.0",
  "guava7": "20.0",
  "dagger": "2.11",
  "play-services": "11.4.0",
  "rx-android": "1.2.1",
  "rx-java": "1.3.0",
  "conceal": "1.1.3"
}
```
