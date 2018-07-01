FROM jenkins/jenkins:lts

ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
COPY executors.groovy /usr/share/jenkins/ref/init.groovy.d/
COPY security.groovy /usr/share/jenkins/ref/init.groovy.d/

RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt