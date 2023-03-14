FROM python:alpine3.7 
RUN apk add py3-pip
COPY . /app
WORKDIR /app
RUN pip3 install Flask
ENTRYPOINT ["python"] 
CMD ["app.py"]