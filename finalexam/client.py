import socket
import random
import os
os.system('pause')  # 按任意键继续
hostname = '127.0.0.1'
port = 5288
addr = (hostname, port)
clientsock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
clientsock.connect(addr)
watter = random.randint(0, 150)
weight = random.randint(0, 100)
data = ","+str(watter)+","+str(weight)
msg = data
clientsock.send(msg.encode())
server_respose = str(clientsock.recv(1024), encoding='utf-8')
print('Server response:', server_respose)
clientsock.close()
