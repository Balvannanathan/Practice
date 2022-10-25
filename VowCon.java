class VowCon{
public static void main(String[] args){
String str="bala";
char ch[]=str.toCharArray();
int vow=0;
int con=0;
for(int i=0;i<str.length();i++){
	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
		vow++;
		}
	else{
		con++;
		}	
	}
System.out.println("vowels :"+vow);
System.out.println("consontants:"+con);
}
}