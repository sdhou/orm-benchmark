import sqlite3 from "sqlite3";
require("dotenv").config();
const db = new sqlite3.Database(process.env.OTHER_DATABASE_URL);
for (let i = 0; i < 100000; i++) {
  db.get("select * from oye", (_, ret) => {
    // console.log(ret);
  });
}
