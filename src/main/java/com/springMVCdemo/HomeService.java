package com.springMVCdemo;

import org.springframework.stereotype.Service;

@Service("hs")
public class HomeService {
	public int add(int x, int y) 
	{
		return x+y;
	}
	public int sub(int x, int y) 
	{
		return x-y;
	}
	public int mul(int x, int y) 
	{
		return x*y;
	}
	public int div(int x, int y) 
	{
		try {
			return x/y;
		}
		catch(Exception e)
		{
			System.out.println("Illegal Operation");
		}
		return 0;
	}
}
