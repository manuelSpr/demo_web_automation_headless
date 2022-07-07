FROM ubuntu:20.04
RUN apt-get update && apt-get upgrade -y
RUN apt-get install -y openjdk-8-jdk git curl zip unzip maven wget gnupg2
RUN curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip" \
   && unzip awscliv2.zip \
   && ./aws/install \
RUN git clone https://github.com/manuelSpr/demo_web_automation_headless.git
RUN wget https://chromedriver.storage.googleapis.com/103.0.5060.114/chromedriver_linux64.zip
RUN unzip chromedriver_linux64.zip
RUN mv chromedriver /usr/bin/chromedriver
RUN chown root:root /usr/bin/chromedriver
RUN chmod +x /usr/bin/chromedriver
ENV JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF8
CMD ["/bin/bash"]
