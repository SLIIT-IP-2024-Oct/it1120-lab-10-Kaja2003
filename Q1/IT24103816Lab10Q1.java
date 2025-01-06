import java.util.Scanner;
public class IT24103816Lab10Q1{
public static void main(String[]args){
//char Grade=0;
Scanner input=new Scanner(System.in);
System.out.print("Enter the marks(0-100) : ");
double num=input.nextDouble();
System.out.println();
assert(num<=100 && num>=0):"Invalid Marks";
System.out.println("Marks is validated");
if(num>=75){
System.out.println("The Grade for the Entered Marks is :A");
}
else if(num>=60){
System.out.println("The Grade for the Enterd marks is : B");
}
else if(num>=50){
System.out.println("The Grade for the Enterd marks is : C");
}
else if(num>=40){
System.out.println("The Grade for the Enterd marks is : D");
}else {
System.out.println("The Grade for the Enterd marks is : F");
}
}
}