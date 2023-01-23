import socket
import mysql.connector
from mysql.connector import Error
import time


class Client:
    def __init__(self, hostname="127.0.0.1", port=5288, encoding="utf-8", listen=5):
        self.hostname = hostname
        self.port = port
        self.encoding = encoding
        self.listen = listen


class Sql:
    def __init__(self, host='localhost', database='pet', user='root', password='root'):
        self.host = host
        self.database = database
        self.user = user
        self.password = password

    def connectDB_insertData(self, watterData="None", weightData="None"):
        try:
            localtime = time.localtime()
            result = time.strftime("%Y-%m-%d %I:%M:%S %p", localtime)

            connection = mysql.connector.connect(
                host=self.host,
                database=self.database,
                user=self.user,
                password=self.password
            )
            if connection.is_connected():
                print("資料庫連接成功")
                sql = '''INSERT INTO pet  (watter, weight,date) VALUES (%s,%s, %s)'''
                val = (watterData, weightData, result)
                cursor = connection.cursor()
                cursor.execute(sql, val)
                connection.commit()
                print("資料上傳成功")
        except Error as e:
            print("資料庫連接失敗:", e)


while True:
    client = Client("127.0.0.1", 5288, "utf-8", 5)
    addr = (client.hostname, client.port)
    srv = socket.socket()
    srv.bind(addr)
    srv.listen(client.listen)
    print("waitting connect")
    connect_socket, client_addr = srv.accept()
    print(client_addr)
    recevent = connect_socket.recv(1024)
    connect_socket.send(
        bytes("message:"+str(recevent), encoding=client.encoding))
    rpiData = str(recevent).split(",")
    print(rpiData)
    sql = Sql('localhost', 'pet', 'root', 'root')
    sql.connectDB_insertData(rpiData[1], rpiData[2])
    connect_socket.close()
    break
