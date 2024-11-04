class P4{
public static void main(String [] args){
        char c ='A';
        char c1 = 'B';
	char c2 ='C';
	char c3 ='D';
	for(int i=0; i<=4; i++)
 	{	   
	  for(int j=0; j<=4-i; j++)
	  {
            if(i==1)
	    {
	     System.out.print( c + " ");
               c+=2;
	    }   
            if(i==2)
	    {
	     System.out.print( c1 + " ");
               c1+=2;
	    }
	    if(i==3)
	    {
	     System.out.print( c2 + " ");
               c2+=2;
	    }  
	    if(i==4)
	    {
	     System.out.print( c3 + " ");
	    }                
	  }
       	System.out.println(); 
            
	}
	
   }
}