package main

import (
	"database/sql"
	// "fmt"
	"log"
	_ "github.com/mattn/go-sqlite3"
)

func main() {
	db, err := sql.Open("sqlite3", "../sqlite.db")
	if err != nil {
		log.Fatal(err)
	}
	defer db.Close()
	for i:=0; i<100000;i++{
		db.Query("SELECT * FROM oye")
		// for rows.Next() {
		// 	fmt.Println(rows)
		// }
	}
}
