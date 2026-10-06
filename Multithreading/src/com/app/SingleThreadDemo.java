package com.app;
class  Addition{
	public void add(int a,int b) {
		try {
			Thread.sleep(3000);
			System.out.println("Addition Result:"+ (a+b));
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class SingleThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Addition addition = new Addition();
	for(int i=0;i<50;i++){
		System.out.print("User Request:" + (i+1));
		addition.add(10,20);
		
	}

	}

}
