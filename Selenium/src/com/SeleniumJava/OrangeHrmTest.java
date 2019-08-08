package com.SeleniumJava;

public class OrangeHrmTest extends OrangeHrmPage{

	public static void main(String[] args) {
		
		OrangeHrmPage ohrm = new OrangeHrmPage();
		ohrm.BrowserLaunch();
		ohrm.Subscription("Shravani","Munja","munja@gmail.com","System Engineer");

	}

}
