console.log("Script loaded successfully ");
Java.perform(function x() {
    console.log("Inside java perform function");
    
    var my_class = Java.use("com.fr3y.demo1.MainActivity");
    console.log("Java.Use.Successfully!");
    
    my_class.fun.implementation = function(x,y){
        
        console.log( "original call: fun("+ x + ", " + y + ")");
       
        var ret_value = this.fun(2, 5);
        return ret_value;
    }
});
