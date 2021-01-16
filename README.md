# PIT Demo

A simple application that has only one method that receive multiple numbers and 
returns the sum of the event numbers.

This app is used to demonstrate the PIT library. PIT is use for mutation testing.

In order to generate a report based on the mutation testing run this command in the root 
directory of the project:

`mvn clean package org.pitest:pitest-maven:mutationCoverage`

You will find the report in `target/pit-reports/*` open `index.html` to view the report.

##### Note: If you are using an IDE there is a high chance a plugin for PIT exists 