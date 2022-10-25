class TriPair{
public static void main(String args[]){
int arr[]={-2,0,1,};
int n=arr.length;
for(int i=0;i<n;i++){
	for(int j=i;j<n;j++){
		for(int k=i;k<n;k++){
			if(arr[i]+arr[j]+arr[k]==0){
				System.out.println(arr[i]+":"+arr[j]+":"+arr[k]);
				}
			}
		}
	}
}
}