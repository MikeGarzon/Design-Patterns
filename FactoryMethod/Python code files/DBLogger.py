from Logger import *
import psycopg2 

class DBLogger(Logger):

    def log (self,msg):
        conexion1 = psycopg2.connect(database="LoggerTest", user="postgres", password="pass")
        cursor1 = conexion1.cursor()

        cursor1.execute("INSERT INTO LOGS (mesg) VALUES ('"+msg+"');")

        conexion1.commit()
        conexion1.close() 