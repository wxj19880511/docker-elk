FROM python:3

VOLUME ["/etc/ansible"]

RUN easy_install pip
RUN pip install ansible-container[docker]

ENTRYPOINT ["ansible"]