class Prime{
public static void main(String args[]){
int x=37;
int count=0;
for(int i=1;i<=x;i++){
	if(x%i==0){
		count++;
		}
	}
if(count==2){
	System.out.print("Prime");
}
else{
	System.out.print("Not Prime");
	}
}
}