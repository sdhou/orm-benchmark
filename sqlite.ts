import sqlite3 from "sqlite3";
const db = new sqlite3.Database("./sqlite.db");
for (let i = 0; i < 100000; i++) {
  db.get("select * from oye", (_, ret) => {
    let a = ret;
  });
}
