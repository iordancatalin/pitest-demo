# PIT Demo

####Requirements:
- Java installed (app tested on java 11)
- Maven installed

A simple application that has only one method that receives multiple numbers and returns the sum of the even numbers.

This app is used to demonstrate the PIT library. PIT is used for mutation testing.

In order to generate a report based on the mutation testing run this command in the root directory of the project:

`mvn clean package org.pitest:pitest-maven:mutationCoverage`

You will find the report in `target/pit-reports/*` open `index.html` to view the report.

For more details about PIT checkout [PIT Page](https://pitest.org/)

##### Note: If you are using an IDE there is a high chance a plugin for PIT exists 