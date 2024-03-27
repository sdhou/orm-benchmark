import { DataSource, BaseEntity, Column, Entity, PrimaryGeneratedColumn } from "typeorm";
import "reflect-metadata";

@Entity()
export class Oye extends BaseEntity {
  @PrimaryGeneratedColumn()
  id: number;
  @Column()
  Column1: string;
  @Column()
  Column2: string;
  @Column()
  Column3: string;
  @Column()
  Column4: string;
  @Column()
  Column5: string;
  @Column()
  Column6: string;
  @Column()
  Column7: string;
  @Column()
  Column8: string;
  @Column()
  Column9: string;
  @Column()
  Column10: string;
  @Column()
  Column11: string;
  @Column()
  Column12: string;
  @Column()
  Column13: string;
  @Column()
  Column14: string;
  @Column()
  Column15: string;
  @Column()
  Column16: string;
  @Column()
  Column17: string;
  @Column()
  Column18: string;
  @Column()
  Column19: string;
}

const AppDataSource = new DataSource({
  type: "sqlite",
  database: "/opt/code/testnode/sqlite.db",
  synchronize: false,
  logging: false,
  migrationsRun: false,
  entities: [Oye],
  migrations: [],
  subscribers: [],
});

AppDataSource.initialize()
  .then(async () => {
    for (let i = 0; i < 100000; i++) {
      const a = await AppDataSource.manager.find(Oye);
    }
  })
  .catch((error) => console.log(error));
