import java.util.*; 

class dupli{
public static void main(String []args){
int arr[] = {10,20,30,10,20};
int n = arr.length;
for(int i=0;i<n;i++){
	int count=0;
	for(int j=i;j<n;j++){
		if(arr[i]==arr[j]){
			count++;
			}
		}
	if(count>1){
		System.out.println(arr[i]);
		}
	}
}
}		
