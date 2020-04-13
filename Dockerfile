FROM tomcat
MAINTAINER Akun akun@163.com
ADD target/docker-mvc.var /usr/local/tomcat/webapps/docker-mvc.var
EXPOSE 8080