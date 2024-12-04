package com.crm.AdvanceSeleniumE4;

import java.util.Random;

import org.testng.annotations.Test;

public class RandomNumbers 
{
	@Test
  public void main() {
		Random r = new Random();
		int num = r.nextInt(1000);
		System.out.println(num);
	  
  }
}
