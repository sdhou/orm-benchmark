import { DataTypes, Sequelize } from "sequelize";
require("dotenv").config();

const sequelize = new Sequelize({ dialect: "sqlite", storage: process.env.OTHER_DATABASE_URL, logging: false });
const Oye = sequelize.define(
  "Oye",
  {
    id: { type: DataTypes.INTEGER, autoIncrement: true, primaryKey: true },
    Column1: DataTypes.STRING,
    Column2: DataTypes.STRING,
    Column3: DataTypes.STRING,
    Column4: DataTypes.STRING,
    Column5: DataTypes.STRING,
    Column6: DataTypes.STRING,
    Column7: DataTypes.STRING,
    Column8: DataTypes.STRING,
    Column9: DataTypes.STRING,
    Column10: DataTypes.STRING,
    Column11: DataTypes.STRING,
    Column12: DataTypes.STRING,
    Column13: DataTypes.STRING,
    Column14: DataTypes.STRING,
    Column15: DataTypes.STRING,
    Column16: DataTypes.STRING,
    Column17: DataTypes.STRING,
    Column18: DataTypes.STRING,
    Column19: DataTypes.STRING,
  },
  { freezeTableName: true, timestamps: false }
);
for (let i = 0; i < 100000; i++) {
  Oye.findAll().then((r) => {
    // console.log(r);
  });
}
