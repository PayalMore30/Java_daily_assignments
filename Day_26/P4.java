class P4 {
    public static void main(String[] args) {
	for(int i = 1; i <5; i++) 
	{
	   for(int j = 1; j <5; j++) 
	   {		
		if(j <5- i)
		 {			
		    System.out.print("  ");
		 }
		 else 
 	  	 {  
		    if(j==1 && i==4 || j==2 && i==3 || j==3  && i==2 || j==4 && i==1)
		    {
		       System.out.print("= ");
		    }
		    if(j==2 && i==4 || j==3 && i==3 || j==4  && i==2)
		    {
		       System.out.print("1 ");
		    }
		    if(j==3 && i==4 || j==4 && i==3)
		    {
		       System.out.print("2 ");
		    }
		   if(j==4 && i==4)
		    {
		       System.out.print("3 ");
		    }

		 }
	   }
	   System.out.println();
        }
     }
}

 
