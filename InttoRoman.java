class InttoRoman{
public static void main(String args[]){
int x=125;
int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
String roman[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
StringBuilder rom =new StringBuilder();

for(int i=0;i<val.length;i++){
	while(x>val[i]){
		x=x-val[i];
		rom.append(roman[i]);
		}
	}
System.out.print(rom.toString());
}
}		