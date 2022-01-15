import time
import frida

def my_message_handler(message, payload):
    print message
    print payload
    if message["type"] == "send":
        print message["payload"]
        data = message["payload"].split(":")[1].strip()
        print 'message:', message
        data = data.decode("base64")
        user, pw = data.split(":")
        data = ("admin" + ":" + pw).encode("base64")
        print "encoded data:", data
        script.post({"my_data": data}) 
        print "Modified data sent"

device = frida.get_usb_device()
pid = device.spawn(["com.fr3y.demo3"])
device.resume(pid)
time.sleep(1)
session = device.attach(pid)
with open("demo3.js") as f:
    script = session.create_script(f.read())
script.on("message", my_message_handler)  
script.load()
raw_input()
