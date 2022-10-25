class Printarr{
public static void main(String []args){
int arr[]={10,20,10,40,20,30};
int ar[]=new int[arr.length];
int k=0;
for(int i=0;i<arr.length;i++){
	int count=0;
	 for(int j=0;j<arr.length;j++){
		if(arr[i]==arr[j]){
			count++;
			}
		}
	if(count==1){
		ar[k]=arr[i];
		k++;
		}
	}
for(int i=0;i<k;i++){
	System.out.print(ar[i]+" ");
	}
}
}