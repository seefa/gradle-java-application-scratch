## Building Java Projects with Gradle

1-Make a *Pure* and *Empty* Java Project

2- create a folder in Java root project(mkdir -p src/main/java/)

3- Make Project package structure(**ir.seefa.sample.project**)

4- Generate Java main class

5- Generate any Java helper class

6- add **build.gradle** or **build.gradle.kts** with added codes(Project name, Project version, Java plugin, dependencies, Add a task to making JAR file, Java configuration, so on)

6- run command **gradle** in command line

7- run command **gradle tasks** in command line

8- Build your project with Gradle Wrapper => Run in command line(gradle wrapper --gradle-version 5.4.1)

9- After passing step No.8, we can only run this command to build project(**./gradlew build**)

10- Add **application** plugin to *build.gradle.kts* added from step 6

11- Add **Application** code block and define *mainClassName* in *build.gradle.kts*

12- Run this command will execute our Application from JAR main class(**./gradlew run**) 
