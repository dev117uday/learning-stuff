import express from "express";
const app = express();

app.use(express.static('public'));
app.use(express.urlencoded({ extended: true }));
app.use(express.json());

app.get("/users", async (req, res) => {

    const limit = req.query.limit;
    console.log(limit)

    console.log("hello")
    const users = [
        { "id": 1, "name": "uday yadav" },
        { "id": 2, "name": "kunal bhatia" },
        { "id": 3, "name": "vishal malhotra" },
    ]

    await new Promise(r => setTimeout(r, 2000));

    res.send(`<ul class="list-group"> ${users.map(user => { return `<li class="list-group-item">${user.id} : ${user.name} </li>` }).join('')} </ul>`);
})


app.post("/convert", (req, res) => {
    let temp = req.body.temp;
    let newtemp = temp * 9 / 5 + 32;
    res.send(`<h4>temperature  is ${newtemp}</h4>`);
})

app.listen(3000, () => {
    console.log("server listening on port 3000")
})