import java.util.*;
public class ex1 {
	//public static int prime(int a){
		//for(int l=2;l<a;l++){
			//if(a%l!=0)
			//{a=0;}
	//	}
	//return a;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner x=new Scanner(System.in);
	 int n=x.nextInt();
	  int factor[]=new int[n];
	  for(int i=1;i<n;i++) {
		  if(n%i==0) {
			  factor[i-1]=i;
		  }
		 
	  }
	  for(int j=0;j<factor.length;j++) {
		 // if(prime(factor[j])==0)
		  if(factor[j]==0)

		  {System.out.print("");}
		  else
		  { System.out.print(factor[j]+" ");}
	  }
	  
	  
	  

	}

}
