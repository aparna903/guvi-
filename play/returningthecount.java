public class Sam{
public static void main(String[] args){
String str="timtimtomtim";
String s="tim";
int n2=s.length();
int n=str.length();
int count=0,i=0;
while(i<=(n-n2)){
String s1=str.substring(i,i+n2);
System.out.println(s1);
if(s1.equals(s)){
count=count+1;
System.out.println(count);}
i++;
}
System.out.print(count);
}
}

