import java.util.*;
public class And{
public static void main(String[] args){
String str,str1="and";
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
String temp="";
String[] s=str.split(" ");
for(int j=0;j<s.length;j++){ 
if(s[j].equals("and")){
temp=s[j-1];
s[j-1]=s[j+1];
s[j+1]=temp;
}

}
String st="";
int i;
for(i=0;i<s.length-1;i++){

st=st+s[i]+" ";
}
st=st+s[i];
System.out.print(st);
}
}


