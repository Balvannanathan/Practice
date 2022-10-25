class lar{
public static void main(String []args){
int arr[]={10,30,20,40,70};
int max=arr[0];
for(int i=1;i<arr.length;i++){
	if(max<arr[i]){
		max=arr[i];
		}
	}
int min=arr[0];
for(int i=0;i<arr.length;i++){
	if(min>arr[i]){
		min=arr[i];
		}
	}
System.out.println(max);

System.out.println(min);
}
}