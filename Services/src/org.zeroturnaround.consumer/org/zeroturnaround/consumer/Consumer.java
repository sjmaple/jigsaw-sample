package org.zeroturnaround.consumer;

import org.zeroturnaround.api.*;
import java.util.*;

public class Consumer {
	public static void main(String[] args){
		Iterable<MyService> services = ServiceLoader.load(MyService.class);

		for(MyService service : services)
		{
			System.out.println(service.getMessage());
		}
	}
}