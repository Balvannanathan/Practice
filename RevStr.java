class RevStr{
public String rev(String str){
	if(str.isEmpty()){
		return str;
		}
	else{
		return rev(str.substring(1))+str.charAt(0);
		}
	}
public static void main(String args[]){
String str="Hello  world";

RevStr obj = new RevStr();
System.out.println(obj.rev(str));
}
}