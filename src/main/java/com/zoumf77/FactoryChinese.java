package com.zoumf77;

public class FactoryChinese implements IFactory{
	
	@Override
	public ISayHi getSayHi() {
		// TODO Auto-generated method stub
		return new ISayHiChineseImpl();
	}


}
