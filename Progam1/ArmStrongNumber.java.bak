import java.util.Scanner;
class ArmStrongNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int cnt=0;
		for(int i=num;i!=0;i/=10){
		cnt++;
		}
		int sum=0;
	 int temp=num;
	 while(temp!=0){
		 int rem=temp%10;
		 
		 int pow=1;
		 for(int i=0;i<cnt;i++){
			 pow*=rem;
		 }
		 sum+=pow;
		 temp/=10;
	 }
	 if(num==sum){
		 System.out.println("The number is ArmStrong Number");
	 }
	 else{
		 System.out.println("The Number is Not ArmStrong Number");
	 }
	}
}