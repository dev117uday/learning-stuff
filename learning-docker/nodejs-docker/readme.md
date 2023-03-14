# Deploying Nodejs on Heroku using Docker

A simple flask server that returns a json with  `{ "message" : "Hello World from Docker !!" }` when a HTTP Request is sent to `/` url

This directory contains :

```
.
├── Dockerfile
├── package.json
├── package-lock.json
├── readme.md
└── server.js

5 files
```

To build the docker image, run (with admin rights, inside the nodejs-docker-heroku directory) :
```
docker build -t nodejs-docker-heroku .
```

To run the docker image while interacting with the container terminal

```
docker run -it nodejs-docker-heroku
```

For more information, go the docker section of my notes :  [Notes.md](https://dev117uday.github.io/notes-md/)