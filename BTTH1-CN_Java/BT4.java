import java.util.Scanner;

class BT4 {
    public static void main(String[] args) {
        Scanner Bt4 = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = Bt4.nextInt();
        //Liệt kê ước số của n
        System.out.println("Cac uoc so cua n:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println("");
        //Kiểm tra n phải là số đối xứng không?
        //Ép kiểu sang String từ Int n
        String N = String.valueOf(n);
        String reversed = "";
        for (int i = N.length() - 1; i >= 0; i--) {
            reversed += N.charAt(i);
        }
        if (N.equals(reversed)) {
            System.out.println("n la so doi xung");
        }
        else {
            System.out.println("n khong la so doi xung");
        }
        //Kiểm tra n là số chính phương không?
        if (Math.sqrt(n) % 1 == 0) {
            System.out.println("n la so chinh phuong");
        }
        else {
            System.out.println("n khong la so chinh phuong");
        }
        Bt4.close();
    }
}