import socket
import mysql.connector
from mysql.connector import Error
import time
hostname = '127.0.0.1'
port = 5288
addr = (hostname,port)
srv = socket.socket()
srv.bind(addr)
srv.listen(5)
print("waitting connect")

def connectDB_insertData(userName,userInput):
    try:
        localtime = time.localtime()
        result = time.strftime("%Y-%m-%d %I:%M:%S %p", localtime)

        connection = mysql.connector.connect(
            host='localhost',
            database='pet',
            user='root',
            password='root'
        )
        if connection.is_connected():
            print("資料庫連接成功")
            sql = '''INSERT INTO pet  (watter, weight,date) VALUES (%s,%s, %s)'''
            
            val = (userName, userInput,result)
            cursor = connection.cursor()
            cursor.execute(sql,val)
            connection.commit()

    except Error as e:
        print("資料庫連接失敗:", e)

while True:
    connect_socket,client_addr = srv.accept()
    print(client_addr)
    recevent = connect_socket.recv(1024)
    print(str(recevent,encoding='utf-8'))
    connect_socket.send(bytes("message:"+str(recevent) ,encoding='utf-8'))
    rpiData = str(recevent).split(",")
    print(rpiData)
    connectDB_insertData(rpiData[1],rpiData[2])
    connect_socket.close()
    break
