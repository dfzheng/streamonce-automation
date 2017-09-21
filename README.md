#Streamonce Inergation Test

This repo is use to test if the streamonce worked about sync discussion between jive and gmail.

How to run it on local
 
1. Change the webdriver setting to local. Explain in stepdefinitions.java
2. Run "mvn test"


Requirements

Install Java (1.8.0_131)

https://docs.oracle.com/javase/8/docs/technotes/guides/install/mac_jdk.html#CHDBADCG


Install Maven (3.5.0)

https://maven.apache.org/install.html




How to run specific features:

In runTest.java, list the feature you want to run. e.g.
 
features = {"features/QuestionJive2Email.feature", "features/Email2Jive.feature"})


