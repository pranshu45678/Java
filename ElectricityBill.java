import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        int bill;
        
if(units>=0&&units<=100){
	bill=units*5;
}else if(units>=101&&units<=200){
	bill=500;
	units=units-100;
	bill=bill+(units*7);
}else{
	bill=(100*5)+(200*7);
	units=units-200;
	bill=bill+(units*10);
}System.out.println(bill);


        
    }
}