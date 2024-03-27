# orm benchmark

- nodejs native query
- nodejs prisma
- nodejs typeorm

```cmd
npm i
tsc
time node sqlite.js
time node sqlite.js
time node sqlite.js
time node typeorm.js
time node typeorm.js
time node typeorm.js
time node prisma.js
time node prisma.js
time node prisma.js

node sqlite.js  5.10s user 1.69s system 127% cpu 5.310 total
node sqlite.js  5.12s user 1.67s system 127% cpu 5.325 total
node sqlite.js  5.12s user 1.67s system 127% cpu 5.338 total
node typeorm.js  25.06s user 1.71s system 102% cpu 26.244 total
node typeorm.js  25.24s user 1.68s system 102% cpu 26.343 total
node typeorm.js  25.42s user 1.89s system 101% cpu 26.833 total
node prisma.js  26.34s user 1.80s system 101% cpu 27.673 total
node prisma.js  26.41s user 1.79s system 101% cpu 27.738 total
node prisma.js  26.15s user 1.69s system 102% cpu 27.255 total
```
