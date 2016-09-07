import java.io.*;
import java.util.*;
class str
{
public static void main(String args[])
{
String st;
int i,j,n,c1=0;
Scanner s=new Scanner(System.in);
st=s.next();
char c[]=st.toCharArray();
Set<Character> sr=new TreeSet<Character>();
for(i=0;i<st.length();i++)
{
sr.add(c[i]);
}
System.out.println(sr.size());
if(sr.size()==26)
System.out.println("yes");
else
System.out.println("no");
}
}
