import java.util.Arrays;

class Anagram{
public static void main(String args[]){
String str1="cseq";
String str2="escv";
String n1=" ";
String n2=" ";
char ch1[]=str1.toCharArray();
char ch2[]=str2.toCharArray();
if(ch1.length!=ch2.length){
	System.out.println("Not Anagram");
	}
else{
Arrays.sort(ch1);
Arrays.sort(ch2);
for(int i=0;i<ch1.length;i++){
	n1=n1+ch1[i];
	n2=n2+ch2[i];
	}

if(n1.equals(n2)){
	System.out.println("Anagram");
	}
else{
	System.out.println("Not Anagram");
	}
	}
}
}