class Pair{
public static void main(String[] args){
int arr[]={2,4,6,1,5,8};
int n =10;
for(int i=0;i<arr.length;i++){
	for(int j=0;j<arr.length;j++){
		if(arr[i]+arr[j]==n){
			System.out.println(arr[i]+":"+arr[j]);
			}
		}
	}
}
}