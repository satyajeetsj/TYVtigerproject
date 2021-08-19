package com.generic;

import java.util.Random;

public class GenerateRandomNum {
	public int randomnum()
	{
		Random r=new Random();
		int ran=r.nextInt(1000);
		return ran;
	}

}
