package org.zeroturnaround.hello;

import org.zeroturnaround.world.*;

public class Hello {
	public static void main(String ...args){
		System.out.println(hello() + " " + World.world());
	}

	public static String hello(){
		return "Hello";
	}
}