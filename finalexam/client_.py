import socket
import random
import os

class Sever:
    def __init__(self,hostname="127.0.0.1",port=5288,encoding="utf-8"):
        self.hostname = hostname
        self.port = port
        self.encoding = encoding
    def sendData(self):
        watter = random.randint(0,150)
        weight = random.randint(0,100)
        data = ","+str(watter)+","+str(weight)
        return data

while True:
    os.system('pause')#按任意键继续
    sever = Sever("127.0.0.1",5288,"utf-8")
    addr = (sever.hostname,sever.port)
    clientsock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    clientsock.connect(addr)
    msg = sever.sendData() 
    clientsock.send(msg.encode())
    server_respose = str(clientsock.recv(1024), encoding=sever.encoding)
    print('Server response:', server_respose)
    clientsock.close()