class P1{	
	public static void main(String [] args){
		int flag = 0;

		for(int num = 2 ; num<=100 ;num++)
		{
		    flag=0;
		    for(int i = 2 ; i<=num/2;i++)
		    {			
			if(num%i==0){
			flag = 1;
			break;
		     }

		     }	
	          if(flag==0)
		  System.out.print(num + " ");
		}
	}	
}
