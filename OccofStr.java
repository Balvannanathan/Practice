class OccofStr{
public static void main(String args[]){
String str = "Hai i am White Wolf King in the North i am the king of f** seven kingdom";
String check="i";
String n[]= str.split(" ");
int count=0;
for(int i =0;i<n.length;i++){
	if(check.equals(n[i])){
		count++;
		}
	}
System.out.println(count);
}
}