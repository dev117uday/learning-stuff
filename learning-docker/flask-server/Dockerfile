FROM python:alpine3.7 
COPY . /app
WORKDIR /app
RUN pip3 install Flask
EXPOSE 5001 
ENTRYPOINT ["python"] 
CMD ["app.py"]