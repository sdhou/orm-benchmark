from sqlalchemy import create_engine, MetaData, Table, Column, Integer, String, select
import logging

# logging.basicConfig()
# logging.getLogger('sqlalchemy.engine').setLevel(logging.INFO)

engine = create_engine('sqlite:///../sqlite.db')
metadata = MetaData()
oye = Table('oye', metadata,
            Column('id', Integer, primary_key=True, autoincrement=True),
            Column('Column1', String(20), default='', nullable=False),
            Column('Column2', String(20), default='', nullable=False),
            Column('Column3', String(20), default='', nullable=False),
            Column('Column4', String(20), default='', nullable=False),
            Column('Column5', String(20), default='', nullable=False),
            Column('Column6', String(20), default='', nullable=False),
            Column('Column7', String(20), default='', nullable=False),
            Column('Column8', String(20), default='', nullable=False),
            Column('Column9', String(20), default='', nullable=False),
            Column('Column10', String(20), default='', nullable=False),
            Column('Column11', String(20), default='', nullable=False),
            Column('Column12', String(20), default='', nullable=False),
            Column('Column13', String(20), default='', nullable=False),
            Column('Column14', String(20), default='', nullable=False),
            Column('Column15', String(20), default='', nullable=False),
            Column('Column16', String(20), default='', nullable=False),
            Column('Column17', String(20), default='', nullable=False),
            Column('Column18', String(20), default='', nullable=False),
            Column('Column19', String(20), default='', nullable=False))

query = select(oye.c)
with engine.connect() as conn:
    for i in range(100000):
        result = conn.execute(query)
        # print(result.first())
