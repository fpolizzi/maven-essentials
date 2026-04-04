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
