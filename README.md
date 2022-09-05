42 day Kotlin
==========

Learning journey with Kotlin programming language - the "shorter" Java.

Some tips for beginners/novices as a "cheat sheet" to learn quicker.
Mostly language features & stdlib up to Kotlin 1.5 release (Apr 2021).

### Usage

**Basic Usage**

Build the project, install the artifact/plugin to local repository (or deploy to remote repository).
```bash
  $ ./mvnw clean install -DskipTests=true
```

See sample below.

### Samples

  $ mvn clean install -Dmaven.test.skip=true

When BUILD SUCCESS, we can proceed to running and testing.

#### Running samples

```bash
  $ ./mvnw compile exec:java -Dexec.mainClass=net.ducquoc.training.vn.App
  $ ./mvnw compile exec:java -Dexec.mainClass=net.ducquoc.ktlang.d01.Day01Kt
  $ mvn compile exec:java -Dexec.mainClass=net.ducquoc.ktlang.d02.Day02Kt
```

Likewise, you can run Day24Kt or Day42Kt, it's up to you!

#### References

https://gitlab.com/ducquoc/42-day-kotlin

https://github.com/ducquoc/fresher-training

https://bitbucket.org/ducquoc/dq-training

https://ducquoc.github.io/

https://medium.com/androiddevelopers/31daysofkotlin-week-1-recap-fbd5a622ef86

https://kotlinlang.org/docs/learning-materials-overview.html
