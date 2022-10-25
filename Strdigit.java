class Strdigit{
public static void main(String args[]){
String str="Balamt15";
int count=1;
for(int i=0;i<str.length();i++){	
	if(str.charAt(i)<'0'||str.charAt(i)>'9'){
		count++;
		}
	}
if(count==str.length()){
	System.out.println("it fully contain digit");
	}
else{
	System.out.println("its not fully digit");
	}
}
}