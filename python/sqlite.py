import sqlite3

conn = sqlite3.connect('../sqlite.db')
cursor = conn.cursor()
for i in range(100000):
    cursor.execute('SELECT * FROM oye')
    cursor.fetchall()
    # for row in rows:
    #     print(row)

cursor.close()
conn.close()
