package com.wipro.test;

public class Message {
String msg;

public Message(String msg) {
	super();
	this.msg = msg;
}

public String getMsg() {
	System.out.println(msg);
	return msg;
}

public String salutationMessage(){
    msg = "Hi!" + msg;
    System.out.println(msg);
    return msg;
 }   


}
