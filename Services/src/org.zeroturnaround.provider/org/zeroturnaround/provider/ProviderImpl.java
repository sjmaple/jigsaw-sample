package org.zeroturnaround.provider;

import org.zeroturnaround.api.*;

public class ProviderImpl implements MyService {
	public String getMessage(){
		return "Hello World, from org.zeroturnaround.provider.ProviderImpl!";
	}
}