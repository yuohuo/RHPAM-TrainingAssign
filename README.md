# RHPAM-TrainingAssign

![Alt text](snapshot.png?raw=true "Title")

Solar Village POC is a home work assignment for advanced process development with Red Hat JBoss BPM Suite. It contains following projects:

poc-kjar: "New Order Permitting" business process. This process calls Government Services in every 15 seconds to track the permit approval status.

gov-services: Government REST services simulator project. It provides RESTful CRUD APIs for permit applications.

poc-model: POJO data model which is used by both of SolarPermitApp and SolarPermitService.

poc-service: Front-end project of Solar Village POC, utilising React.JS to build

git remote set-url origin ssh://yuohuo@github.com/yuohuo/RHPAM-TrainingAssign.git