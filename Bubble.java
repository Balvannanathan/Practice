class Bubble{
public static void main(String args[]){
int arr[] ={50,10,40,30,60,20};
int n=arr.length;
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		if(arr[i]>arr[j]){
			int temp;
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
	}
for(int i=0;i<n;i++){
	System.out.print(arr[i]+" ");
	}
}
}