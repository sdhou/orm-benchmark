# orm benchmark

- nodejs native query
- nodejs prisma
- nodejs typeorm
- nodejs sequelize
- python sqlite3
- python sqlalchemy
- python peewee
- golang gorm
- golang sqlite
- java mybatis

## Table Structure

```txt
CREATE TABLE oye (
    id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, 
    Column1 TEXT(20) DEFAULT ('') NOT NULL, 
    Column2 TEXT(20) DEFAULT ('') NOT NULL, 
    Column3 TEXT(20) DEFAULT ('') NOT NULL, 
    Column4 TEXT(20) DEFAULT ('') NOT NULL, 
    Column5 TEXT(20) DEFAULT ('') NOT NULL, 
    Column6 TEXT(20) DEFAULT ('') NOT NULL, 
    Column7 TEXT(20) DEFAULT ('') NOT NULL, 
    Column8 TEXT(20) DEFAULT ('') NOT NULL, 
    Column9 TEXT(20) DEFAULT ('') NOT NULL, 
    Column10 TEXT(20) DEFAULT ('') NOT NULL, 
    Column11 TEXT(20) DEFAULT ('') NOT NULL, 
    Column12 TEXT(20) DEFAULT ('') NOT NULL, 
    Column13 TEXT(20) DEFAULT ('') NOT NULL, 
    Column14 TEXT(20) DEFAULT ('') NOT NULL, 
    Column15 TEXT(20) DEFAULT ('') NOT NULL, 
    Column16 TEXT(20) DEFAULT ('') NOT NULL, 
    Column17 TEXT(20) DEFAULT ('') NOT NULL, 
    Column18 TEXT(20) DEFAULT ('') NOT NULL, 
    Column19 TEXT(20) DEFAULT ('') NOT NULL
);
```

## data 20 row

```sql
INSERT INTO oye (Column1,Column2,Column3,Column4,Column5,Column6,Column7,Column8,Column9,Column10,Column11,Column12,Column13,Column14,Column15,Column16,Column17,Column18,Column19) VALUES ('abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst','abcdefghijklmnopqrst');
```

## query

```sql
select * from oye
```

## command

```cmd
npm i
tsc
time node sqlite.js
time node typeorm.js
time node prisma.js
time node sequelize.js
time poetry run python alchemy.py
time poetry run python sqlite.py
```

## operation result

```txt
# nodejs
node sqlite.js  5.10s user 1.69s system 127% cpu 5.310 total
node sqlite.js  5.12s user 1.67s system 127% cpu 5.325 total
node sqlite.js  5.12s user 1.67s system 127% cpu 5.338 total
node typeorm.js  25.06s user 1.71s system 102% cpu 26.244 total
node typeorm.js  25.24s user 1.68s system 102% cpu 26.343 total
node typeorm.js  25.42s user 1.89s system 101% cpu 26.833 total
node prisma.js  26.34s user 1.80s system 101% cpu 27.673 total
node prisma.js  26.41s user 1.79s system 101% cpu 27.738 total
node prisma.js  26.15s user 1.69s system 102% cpu 27.255 total
node sequelize.js  66.42s user 6.64s system 144% cpu 50.663 total
node sequelize.js  66.38s user 6.56s system 144% cpu 50.581 total
node sequelize.js  65.99s user 6.57s system 143% cpu 50.714 total

# python
poetry run python alchemy.py  1.96s user 0.06s system 98% cpu 2.054 total
poetry run python alchemy.py  1.97s user 0.06s system 97% cpu 2.071 total
poetry run python alchemy.py  1.97s user 0.06s system 97% cpu 2.068 total
poetry run python sqlite.py  4.90s user 0.33s system 99% cpu 5.270 total
poetry run python sqlite.py  4.91s user 0.33s system 99% cpu 5.284 total
poetry run python sqlite.py  4.91s user 0.34s system 99% cpu 5.295 total
poetry run python peewee1.py  31.95s user 0.59s system 99% cpu 32.649 total
poetry run python peewee1.py  31.50s user 0.43s system 99% cpu 31.994 total
poetry run python peewee1.py  31.63s user 0.53s system 99% cpu 32.257 total

# golang
./gorm  15.23s user 0.57s system 103% cpu 15.208 total
./gorm  15.26s user 0.58s system 104% cpu 15.209 total
./gorm  15.23s user 0.57s system 104% cpu 15.180 total
./sqlite  4.32s user 4.09s system 107% cpu 7.827 total
./sqlite  4.34s user 4.05s system 107% cpu 7.774 total
./sqlite  4.37s user 4.06s system 107% cpu 7.814 total

# java
curl -i 127.0.0.1:8080/mybatis  0.01s user 0.01s system 0% cpu 26.871 total
curl -i 127.0.0.1:8080/mybatis  0.01s user 0.01s system 0% cpu 26.769 total
curl -i 127.0.0.1:8080/mybatis  0.01s user 0.01s system 0% cpu 26.812 total
curl -i 127.0.0.1:8080/jdbc  0.01s user 0.02s system 1% cpu 2.476 total
curl -i 127.0.0.1:8080/jdbc  0.01s user 0.01s system 0% cpu 2.238 total
curl -i 127.0.0.1:8080/jdbc  0.01s user 0.01s system 0% cpu 2.290 total
curl -i 127.0.0.1:8080/jpa  0.01s user 0.01s system 0% cpu 5.681 total
curl -i 127.0.0.1:8080/jpa  0.01s user 0.01s system 0% cpu 5.506 total
curl -i 127.0.0.1:8080/jpa  0.01s user 0.01s system 0% cpu 5.463 total
```
