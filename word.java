import java.util.*;


class word
{

public static void main(String args[])
{
Scanner ss = new Scanner(System.in);

System.out.println("Enter the String");
String letter= ss.nextLine();

String newletter [] = letter.split(" ");
System.out.println("Enter the Word for count");

String an =  ss.next(); 

int s=0;
for ( int i =0; i<newletter.length;i++)
{
if( newletter[i].equals (an))
{
 s=1;
count++;
}

}
System.out.println(count);
if(s==0)
{
System.out.println("not in string");

}
 
}
}

