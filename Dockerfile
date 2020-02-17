FROM java:8
EXPOSE 8081
ADD /target/LoanEMIScheduler-0.0.1-SNAPSHOT.jar LoanEMIScheduler-0.0.1.jar
ENTRYPOINT ["java","-jar","LoanEMIScheduler-0.0.1.jar"]