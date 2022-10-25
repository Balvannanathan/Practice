class Spalindrome{
public static void main(String args[]){
String str="amma";
int n=str.length();
String  nstr="";
for(int i=n-1;i>=0;i--){
char ch=str.charAt(i); 
nstr =nstr+ch;
}
if(str.equals(nstr)){
	System.out.println("Palindrome");
	}
else{
	System.out.println("Not Palindrome");
	}
}
}