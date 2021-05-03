FROM centos

MAINTAINER anupam.agarwal@nagarro.com

RUN yum -y update && yum install -y curl 

FROM tomcat
RUN rm -rf /usr/local/tomcat/webapps/* 
COPY target/demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/

EXPOSE 9090
CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]
