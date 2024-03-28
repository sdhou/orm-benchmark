# orm benchmark

- nodejs native query
- nodejs prisma
- nodejs typeorm
- nodejs sequelize

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
```

## operation result

```txt
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
```
