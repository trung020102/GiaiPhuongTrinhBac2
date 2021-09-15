import java.util.Scanner;



public class GiaiPhuongTrinhBac2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
          System.out.print("Nhập hệ số bậc 2, a = ");
          float a = scan.nextFloat();
          System.out.print("Nhập hệ số bậc 1, b = ");
          float b = scan.nextFloat();
          System.out.print("Nhập hệ số tự do, c = ");
          float c = scan.nextFloat();
          GiaiPhuongTrinhBac2.giaiPTBac2(a, b, c);
   
	  }
    public static void giaiPTBac2(float a, float b, float c) {
    	// kiem tra he so neu a=b=0 thi PT vo nghiem, neu a=b thi PT co 1 nghiem duy nhat
    	if (a == 0) {
    		if ( b == 0) {
    			System.out.println("Phương trình vô nghiệm");
    		} else {
				System.out.println("Phương trình có 1 nghiệm duy nhất: x = " + (-c / b) );
				
			}
    		return;
    	}
    	// delta
    	float delta = b*b - 4*a*c;
    	float x1;
    	float x2;
    	// tim x1, x2
    	if (delta > 0) {
    		x1 = (float) (-b + Math.sqrt(delta))/ (2*a); 
    		x2 = (float) (-b - Math.sqrt(delta))/ (2*a); 
    		System.out.println("Phương trình có 2 nghiệm phân biệt là: " + "x1 = " + x1 + ", " + "x2 = " + x2);
    	} else if (delta < 0) {
    		System.out.println("Phương trình vô nghiệm");
    	} else {
			System.out.println("Phuong trình có 1 nghiệm kép: x1 = x2 =" + (-b / 2 * a));
		}
    }
}
