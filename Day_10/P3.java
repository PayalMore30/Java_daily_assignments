class P3
{
	public static void main(String args[])
	{
	  for(int i=4;i>=1;i--) 
        { 
            for(int j=4;j>=1;j--) 

	    {
		if(j>=6-i){	
		     System.out.print("  ");
		}else{
		     System.out.print(j+" ");
		}
            }
            System.out.println(); 
        }

       }
}