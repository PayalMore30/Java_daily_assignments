class P1{
   public static void main(String [] args){
	int n1=0;
	int n2=1;
	int n3=0;
	System.out.println(n1);
	System.out.println(n2);
        for(int num=2;num<=5;num++)
	{
            n3=n1+n2;
	    System.out.println(n3);
	   n1=n2;
           n2=n3;

        }
   }
}