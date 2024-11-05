class P4{
   public static void main(String [] args){
     char c='a';
     char c2 = 'c';
     char c3 ='e';
     char c4 ='g';

     for(int i=0 ; i<=4 ; i++)
     {
        for(int j=0; j<=4-i; j++)
	{  
	   if(i==1)
 	   {
	   System.out.print(c + " ");
	   c++;
	   }
	   if(i==2)
	    {
	     System.out.print( c2 + " ");
               c2++;
	    }
	    if(i==3)
	    {
	     System.out.print( c3 + " ");
               c3++;
	    }  
	    if(i==4)
	    {
	     System.out.print( c4 + " ");
	    }      
        }
      System.out.println();
    }
  }
} 