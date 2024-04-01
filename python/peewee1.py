from peewee import *

# import logging
# logger = logging.getLogger('peewee')
# logger.addHandler(logging.StreamHandler())
# logger.setLevel(logging.DEBUG)

db = SqliteDatabase('../sqlite.db')


class Oye(Model):
    id = AutoField()
    Column1 = TextField(default='')
    Column2 = TextField(default='')
    Column3 = TextField(default='')
    Column4 = TextField(default='')
    Column5 = TextField(default='')
    Column6 = TextField(default='')
    Column7 = TextField(default='')
    Column8 = TextField(default='')
    Column9 = TextField(default='')
    Column10 = TextField(default='')
    Column11 = TextField(default='')
    Column12 = TextField(default='')
    Column13 = TextField(default='')
    Column14 = TextField(default='')
    Column15 = TextField(default='')
    Column16 = TextField(default='')
    Column17 = TextField(default='')
    Column18 = TextField(default='')
    Column19 = TextField(default='')

    class Meta:
        database = db


db.connect()
for i in range(0, 100000):
    list(Oye.select())
db.close()
