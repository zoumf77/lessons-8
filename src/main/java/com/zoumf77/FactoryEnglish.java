package com.zoumf77;

public class FactoryEnglish implements IFactory {

	@Override
	public ISayHi getSayHi() {
		// TODO Auto-generated method stub
		return new ISayHiEnglishImpl();
	}

}
