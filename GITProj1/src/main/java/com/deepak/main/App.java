package com.deepak.main;

/**
 * Hello world!
 */
public class App {
	
	public int Sum(int x,int y) {
		return x+y;	
	}
    public static void main(String[] args) {
        App app=new App();
        System.out.println("sum:"+app.Sum(10, 30));
    }
}
