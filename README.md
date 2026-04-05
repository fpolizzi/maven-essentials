# Maven Essentials

Maven is a powerful build automation tool primarily used 
for Java projects. It simplifies the build process by 
managing project dependencies, compiling source code, 
running tests, and packaging the final product. 
Maven uses a Project Object Model (POM) file to define 
project structure, dependencies, and build configurations. 
This allows developers to easily manage and share their 
projects, ensuring consistency and reproducibility across 
different environments. 
With its extensive plugin ecosystem, Maven can be extended 
to support various tasks, making it an essential tool 
for modern Java development.

## How to install Maven?

### Windows

- Download the Maven zip file from the [official website](https://maven.apache.org/install.html).
- Extract the zip file to a directory of your choice.
- Add the bin directory of the extracted Maven directory.
to the PATH environment variable.
- Open a new command prompt and run `mvn -v` to verify the installation.

### macOS

- Open Terminal.
- Install Homebrew if you haven't already by running:

```bash
  /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```
- Install Maven using Homebrew:

```bash
  brew install maven
```
- Run `mvn -v` to verify the installation.

### Linux

- Open Terminal.
- Update the package index:
```bash
   sudo apt update
```
- Install Maven:
```bash
   sudo apt install maven
```
- Run `mvn -v` to verify the installation.

By following these steps, you can install 
Maven on Windows, macOS, and Linux. Once installed, you can start using Maven 
to manage your Java projects efficiently.

## Creating a Maven Project

There are different options to create a Maven Project:

- in IntelliJ under `New Project - Generators` choose the option: **Maven Project**   
- if you open a Non Maven project in IntelliJ, you can choose **Add Framework Support**
to convert the project to a Maven Project
- you can create a maven project by using the `mvn` command in the commandline
for a more in deepth insight please have a look at [Maven in 5 Minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)

## Project Object Model (pom.xml)

### What is XML?

XML stands for Extensible Markup Language. It is a markup language that defines a set of rules for encoding documents in a format that is 
both human-readable and machine-readable. XML is widely used for data interchange between systems, particularly in web services and 
enterprise applications.

### Project Object Model (pom.xml)

The **pom.xml** file is the heart of a Maven project. POM stands for Project Object Model, and this XML file contains information about 
the project and configuration details used by Maven to build the project. It includes the following key elements:

- **Project Information:** Basic details about the project such as its name, version, and description.
- **Dependencies:** A list of external libraries required by the project. Maven will download these dependencies from a central repository and include them in the build.
- **Build Configuration:** Custom build settings, including plugins that extend Maven's functionality.
- **Repositories:** Locations where Maven can find dependencies and plugins.
- **Profiles:** Custom build configurations for different environments, such as development, testing, and production.

For more information have a look at [Maven in 5 Minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)

## Target Folder

The target folder is the default output directory for Maven projects. It contains the compiled classes, generated documentation, and other build artifacts. 
Maven uses this folder to store the results of the build process.

## Maven Repository

Maven repository is a storage location for Maven dependencies. It is a central repository where Maven can find and download dependencies for your project.

[Maven Central Repository](https://mvnrepository.com/)

Maven Central Repository is the default repository for Maven dependencies. It is a public repository maintained by the Maven project. 
You can find a wide range of dependencies here, including popular libraries like Apache Commons, Guava, and Jackson.

## Installing Maven Dependency

To install a Maven dependency, you need to add the dependency information to your **pom.xml file**. Maven will then automatically 
download the specified dependency from the central repository and include it in your project.

Here are the steps to install a Maven dependency:
- **Open the pom.xml file:** This file is located in the root directory of your Maven project. 
- **Add the dependency information:** Inside the **<dependencies>** section of the **pom.xml** file, add the dependency information. 
- The dependency information includes the group ID, artifact ID, and the version of the library you want to include.

Here is an example of how to add a dependency for the Java Faker library:

```xml
    <dependency>
        <groupId>net.datafaker</groupId>
        <artifactId>datafaker</artifactId>
        <version>2.5.4</version>
    </dependency>
```

- **Save the pom.xml file:** After adding the dependency information, save the **pom.xml** file.
- **Run the Maven build:** Open a terminal or command prompt, navigate to the root directory 
of your Maven project, and run the following command to build your project:

```bash
    mvn clean install
```
This command will download the Datafaker library and include it in your project.

## .M2 Folder

The **.m2** folder is a directory used by Maven to store its local repository and configuration settings. This folder is 
typically located in the user's home directory. The local repository is where Maven caches downloaded dependencies, 
plugins, and other artifacts to avoid repeatedly downloading them from remote repositories.

### Structure of .m2 Folder

The **.m2** folder contains the following key parts:

- **repository:** This subdirectory is the local repository where Maven stores all the downloaded dependencies, plugins, 
and other artifacts. The structure of this directory mirrors the group ID, artifact ID, and version of the artifacts.
- **settings.xml:** This file contains user-specific configuration for Maven, such as repository locations, proxy settings, 
and authentication information. If this file is not present, Maven uses the default settings.

### Importance of .m2 Folder

The **.m2** folder plays a crucial role in the Maven build process by:

- **Caching Dependencies:** By storing downloaded dependencies locally, Maven reduces the need to repeatedly download the 
same dependencies, speeding up the build process.
- **Custom Configuration:** The **settings.xml** file allows users to customize Maven's behavior, such as specifying custom 
repositories, configuring proxies, and setting up authentication for private repositories.
- **Offline Builds:** With a populated local repository, Maven can perform builds even when offline, as long as all required 
dependencies are already cached in the **.m2** folder.

Understanding the **.m2** folder and its contents is essential for effectively managing Maven projects and optimizing the build process.

## Maven Lifecycle

For further information: [Maven - Introduction to the lifecycle](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)

Maven uses a concept called "lifecycle" to manage the build process. Each lifecycle is a sequence of phases that 
Maven executes to build your project.
Maven has three built-in lifecycles: **default**, **clean**, and **site**. Each lifecycle consists of a sequence of phases. 
Here is a table of all the phases for each lifecycle:

| Lifecycle   | Phases                                                    |
|-------------|-----------------------------------------------------------|
| **default** | validate, compile, test, package, verify, install, deploy |
| **clean**   | pre-clean, clean, post-clean                              |
| **site**    | pre-site, site, post-site, site-deploy                    |

### Default Lifecycle Phases

- **validate:** Validate the project is correct and all necessary information is available.
- **compile:** Compile the source code of the project.
- **test:** Test the compiled source code using a suitable unit testing framework.
- **package:** Take the compiled code and package it in its distributable format, such as a JAR.
- **verify:** Run any checks to verify the package is valid and meets quality criteria.
- **install:** Install the package into the local repository, for use as a dependency in other projects locally.
- **deploy:** Done in an integration or release environment, copies the final package to the remote repository for sharing 
with other developers and projects.

### Clean Lifecycle Phases

- **pre-clean:** Execute processes needed prior to the actual project cleaning.
- **clean:** Remove all files generated by the previous build.
- **post-clean:** Execute processes needed to finalize the project cleaning.

### Site Lifecycle Phases

- **pre-site:** Execute processes needed prior to the actual project site generation.
- **site:** Generate the project's site documentation.
- **post-site:** Execute processes needed to finalize the site generation.
- **site-deploy:** Deploy the generated site documentation to the specified web server.

## Maven Commands

Maven provides a variety of commands to manage the build lifecycle, dependencies, and plugins. 
Here is a table of some commonly used Maven commands:

| Command                         | Description                                                                   |
|---------------------------------|-------------------------------------------------------------------------------|
| **mvn clean**                   | Cleans the project by deleting the **target** directory.                      |
| **mvn compile**                 | Compiles the source code of the project.                                      |
| **mvn test**                    | Runs the tests using a suitable unit testing framework.                       |
| **mvn package**                 | Packages the compiled code into a distributable format, such as a JAR.        |
| **mvn install*                  | Installs the package into the local repository for use as a dependency.       |
| **mvn deploy**                  | Deploys the final package to a remote repository for sharing.                 |
| **mvn validate**                | Validates the project is correct and all necessary information is available.  |
| **mvn verify**                  | Runs any checks to verify the package is valid and meets quality criteria.    |
| **mvn site**                    | Generates the project's site documentation.                                   |
| **mvn clean install**           | Cleans the project and then installs the package into the local repository.   |
| **mvn dependency:resolve**      | Resolves all project dependencies.                                            |
| **mvn help:describe**           | Describes the attributes of a plugin.                                         |
| **mvn help:effective-pom**      | Displays the effective POM for the current build.                             |
| **mvn help:effective-settings** | Displays the effective settings for the current build.                        |


These commands can be run from the command line in the root directory of your Maven project.