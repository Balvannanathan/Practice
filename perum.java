class Perum{
public static void main(String args[]){
String str="ABC";
int n=str.length();
Perum obj=new Perum();
obj.permute(str,0,n-1);
}

public void  permute(String s,int l,int r){
if(l==r){
	System.out.println(s);
	}
else{
	for(int i=l;i<=r;i++){
		s=swap(s,l,i);
		permute(s,l+1,r);
		s=swap(s,l,i);
		}
	}	
}
public String swap(String a,int i,int j){
	char temp;
	char ch[] = a.toCharArray();
	temp=ch[i];
	ch[i]=ch[j];
	ch[j]=temp;
	return String.valueOf(ch);
	}
}