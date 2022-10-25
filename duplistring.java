class duplistring{
public static void main(String args[]){
String str="balaammu";
char ch[]=new char[str.length()];
for(int i=0;i<str.length();i++){
	ch[i]=str.charAt(i);
}

for(int i=0;i<ch.length;i++){
	int count=0;
	for(int j=i;j<ch.length;j++){
		if(ch[i]==ch[j]){
			count++;
		}
	}
	if(count>1){
		System.out.print(ch[i]+" ");
		}
	}
	System.out.println();
}
}