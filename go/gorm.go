package main

import (
	// "fmt"
	"gorm.io/driver/sqlite"
	"gorm.io/gorm"
	"gorm.io/gorm/schema"
	// "gorm.io/gorm/logger"
)

type Oye struct {
	ID       int    `gorm:"primaryKey;autoIncrement"`
	Column1  string `gorm:"type:text;default:''"`
	Column2  string `gorm:"type:text;default:''"`
	Column3  string `gorm:"type:text;default:''"`
	Column4  string `gorm:"type:text;default:''"`
	Column5  string `gorm:"type:text;default:''"`
	Column6  string `gorm:"type:text;default:''"`
	Column7  string `gorm:"type:text;default:''"`
	Column8  string `gorm:"type:text;default:''"`
	Column9  string `gorm:"type:text;default:''"`
	Column10 string `gorm:"type:text;default:''"`
	Column11 string `gorm:"type:text;default:''"`
	Column12 string `gorm:"type:text;default:''"`
	Column13 string `gorm:"type:text;default:''"`
	Column14 string `gorm:"type:text;default:''"`
	Column15 string `gorm:"type:text;default:''"`
	Column16 string `gorm:"type:text;default:''"`
	Column17 string `gorm:"type:text;default:''"`
	Column18 string `gorm:"type:text;default:''"`
	Column19 string `gorm:"type:text;default:''"`
}

func main() {
	db, err := gorm.Open(sqlite.Open("../sqlite.db"), &gorm.Config{
		// Logger: logger.Default.LogMode(logger.Info),
		NamingStrategy: schema.NamingStrategy{
			SingularTable: true, // 禁用表名复数形式
		},
	})
	if err != nil {
		panic("failed to connect database")
	}
	var oye []Oye
	for i := 0; i < 100000; i++ {
		db.Find(&oye)
		// fmt.Println(len(oye))
	}
}
