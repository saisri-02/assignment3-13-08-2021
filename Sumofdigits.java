import java.util.*;
class Sumofdigits
{
static int sum=0;
public static int sumOfDigits(int num) 
{
if(num == 0)
return 0;
return num % 10 + sumOfDigits(num/10);
}
public static void main(String args[])	
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number : ");
int num=sc.nextInt();
System.out.println("The sum of digits of the number : "+sumOfDigits(num));
}
}

output:

Enter a number : 234
The sum of digits of the number : 9