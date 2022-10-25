class PairIndex{
public static void main(String[] args){
int arr[]={4,2,1,5};
int n =7;
for(int i=0;i<arr.length;i++){
	for(int j=i;j<arr.length;j++){
		if(arr[i]+arr[j]==n){
			System.out.println(i+":"+j);
			}
		}
	}
}
}