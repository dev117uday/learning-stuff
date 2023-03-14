# A basic flask server containerized for heroku

A simple flask server that returns `Hello World` when a HTTP Request is sent to `/` url

This directory contains :

```
├── app.py
├── Dockerfile
'── readme.md


0 directories, 3 files
```

To build the docker image, run (with admin rights, inside the flask-server directory) :
```
docker build -t flask-server .
```

To run the docker image while interacting with the container terminal

```
docker run -it -p 5000:5001 flask-server
```
- `5001` is the internal exposed port number, dont change that. 

For heroku Deployment

```
heroku container:login
heroku create uday-flask-server
heroku container:push web --app uday-flask-server
heroku container:release web --app uday-flask-server
```

For more information, go the docker section of my notes :  [Notes.md](https://dev117uday.github.io/notes-md/)