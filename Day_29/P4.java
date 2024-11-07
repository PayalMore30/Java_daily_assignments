class P4 {
    public static void main(String[] args) {
	int inc;
	for(int i = 1; i<5; i++) 
	{
	   inc=3;
	   for(int j = 1; j <5; j++) 
	   {		
		if(j <5- i)
		 {			
		    System.out.print("    ");
		 }
		 else 
 	  	 {  		   
		       System.out.print(inc*inc +"  ");
	  	   	inc++;
		 }
	   }
	   System.out.println();
        }
     }
}

 
