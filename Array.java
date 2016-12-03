import java.io.*;
import java.util.*;
import java.lang.*;

class Array
{
public static void main(String args[])
{
Integer a[] = new Integer[5];
Integer b[][] = new Integer[2][2];
int i,j;

Scanner s = new Scanner(System.in);

System.out.println("Enter  values for single Dimensional Array.");
for(i=0;i<5;i++)
{
a[i] = s.nextInt();
}

System.out.println("Enter  values for Multi Dimensional Array.");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
b[i][j] = s.nextInt();
}
}

System.out.println("single Dimensional Array.");
for(i=0;i<5;i++)
{
System.out.println("a["+i+"] = "+a[i]);
}

System.out.println("Multi Dimensional Array.");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.println("b["+i+"]["+j+"] = "+b[i][j]);
}
}

}
}