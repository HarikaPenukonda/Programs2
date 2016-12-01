package programs2;

public class EvenandOddCount {
	
	public void method1()
	{
		int i,num=100,Ecount=0,Ocount=0;
		
		for(i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				Ecount++;
				
			}
			else
			{
				Ocount++;
			}
			
	}
		System.out.println(Ecount);
		System.out.println(Ocount);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EvenandOddCount o1 = new EvenandOddCount();
		o1.method1();

	}

}
