package fibonacci;
import java.util.*;

public class Fibonacci
{
public static int fibonaccir(int n) { //function for finding fibonacci using recursive method

if(n<=1)
{
return 1;
}
else {
return fibonaccir(n-1)+fibonaccir(n-2);
}
}

public static int fibonaccii(int n) { //function for finding fibonacci using iterative method
if(n<=1)
{
return 1;
}
int r=0,p=1,pp=1,i;
for(i=2;i<=n;i++)
{
r = p + pp;
pp =p;
p =r;
}
return r;
}
public static void main(String[] args) {

int i,n=40,f1,f2;
System.out.print("n\tIterative\tRecursive\n");
System.out.print("**\t*********\t*********\n");
long start_time,end_time;
int dif1,dif2;

//loop from 20 to 40
for(i=20;i<=n;i++) 
{
//initial time for iterative method
start_time = System.nanoTime(); 

//calling function for finding fibonacci using iterative method
f1 = fibonaccii(i); 

end_time = System.nanoTime(); 
//calculating difference
dif1 = (int)((end_time - start_time) / 1e6); 

//initial time for recursive method
start_time = System.nanoTime(); 
//calling function for finding fibonacci using recursive method
f2 = fibonaccir(i); 
//end time
end_time = System.nanoTime(); 
//calculating difference
dif2 = (int)((end_time - start_time) / 1e6); 
//print result
System.out.print(i+"\t\t"+dif1+"\t\t"+dif2 +"\t\n"); 
}
}
}