package org.o7planning.spring.lang.impl;

import org.o7planning.spring.lang.Language;

public class Vietnamese implements Language {
	
	@Override
	public String getGreetting() {
		return "Xin Chào!";
	}
	
	@Override
	public String getBye() {
		// TODO Auto-generated method stub
		return "Tạm biệt";
	}

}
