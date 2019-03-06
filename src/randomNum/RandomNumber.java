package randomNum;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random obj=new Random();
		for(int count=1000;count<10000;count++)
		{
		int randomNumber=obj.nextInt(10000);
		System.out.println("random number:"+randomNumber);
		}
	}

}
