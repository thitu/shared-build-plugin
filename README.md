# Trusona-Build-Plugin

A simple plugin to provide consistent versioning of dependencies across all Trusona's java and android projects.

## Usage

- First, in your project's top level buildscript block, add the plugin's classpath as a dependency:

```groovy
buildscript {
  dependencies {
    classpath "com.trusona.android:trusona-build-plugin:0.0.1"
  }
}
```

- Second, apply the plugin to your project module:

```groovy
apply plugin: "com.trusona.android.build-plugin"
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

- To see the [list](https://github.com/lighthauz/trusona-build-plugin/blob/master/src/main/resources/com/trusona/android/gradle/build/trusona-versions.properties)
of supported dependencies `short-codes` and version values, dump the output with:

```groovy
println trusona.versionsAsJson()
```


