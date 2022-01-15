Java.perform(function () {
    var tv_class = Java.use("android.widget.TextView");
    var JString = Java.use("java.lang.String");
    tv_class.setText.overload("java.lang.CharSequence").implementation = function (x) {
        var string_to_send = x.toString();
        var string_to_recv;
        send(string_to_send); 
        recv(function (received_json_object) {
            string_to_recv = received_json_object.my_data
            console.log("string_to_recv: " + string_to_recv);
        }).wait();
        return this.setText(JString.$new(string_to_recv));
    }
});
