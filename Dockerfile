FROM ubuntu:20.04
RUN apt-get update && apt-get upgrade -y
RUN apt-get install -y openjdk-8-jdk gnupg2
RUN apt install -y git curl zip unzip maven wget
RUN curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip" \
   && unzip awscliv2.zip \
   && ./aws/install
#RUN apt install wget
#RUN apt-get update && apt-get install -y gnupg2
#RUN apt-get -y upgrade
RUN git clone https://github.com/manuelSpr/demo_web_automation_headless.git
RUN wget https://chromedriver.storage.googleapis.com/104.0.5112.29/chromedriver_linux64.zip
RUN unzip chromedriver_linux64.zip
RUN mv chromedriver /usr/bin/chromedriver
RUN chown root:root /usr/bin/chromedriver
RUN chmod +x /usr/bin/chromedriver
ENV JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF8
CMD ["/bin/bash"]
