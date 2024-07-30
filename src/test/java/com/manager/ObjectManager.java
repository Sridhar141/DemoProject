package com.manager;

import com.pages.FirstPage;

public class ObjectManager {
	
	private FirstPage fp ;

	public FirstPage getFp() {
		return (fp==null)?new FirstPage():fp;
	}
	
	
	
	

}
