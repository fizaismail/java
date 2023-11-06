import java.util.Scanner;

class calculator{
public static void main(String args[]){
int n1,n2,ch,cal;

System.out.println("Enter the two numbers");
Scanner r= new Scanner(System.in);

n1=r.nextInt();
n2=r.nextInt();

System.out.println("Select operation");
ch=r.nextInt();

if(ch==1)
{
cal=n1+n2;
System.out.println("ADDIDTION " +cal);
}

else if(ch==2)
{
cal=n1-n2;
System.out.println("SUBTRACTION " +cal);
}

else if(ch==3)
{
cal=n1*n2;
System.out.println("MULTIPLICATION " +cal);
}

else if(ch==4)
{
cal=n1/n2;
System.out.println("DIVISION " +cal);
}

else if(ch==5)
{
cal= n1%n2;
System.out.println("MODULUS " +cal);
}

else {
System.out.println("invalid statement");
}

}
}