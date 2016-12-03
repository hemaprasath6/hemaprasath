import java.util.Scanner;
class prime{  
 public static void main(String args[]){  
  int i,m=0,flag=0;    
  Scanner n = new Scanner(System.in);
  System.out.println("enter the no");
  int no= n.nextInt();
  m=no/2;    
  for(i=2;i<=m;i++){    
   if(no%i==0){    
   System.out.println("Number is not prime");    
   flag=1;    
   break;    
   }    
  }    
  if(flag==0)    
  System.out.println("Number is prime");
  n.close();
}  
}  