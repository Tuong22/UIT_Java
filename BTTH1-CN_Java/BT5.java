import java.util.Scanner;

class BT5 {
    public static void main(String[] args) {
        Scanner Bt5 = new Scanner(System.in);
        System.out.print("Nhap chuoi s1: ");
        String s1 = Bt5.nextLine();
        
        System.out.print("Nhap chuoi s2: ");
        String s2 = Bt5.nextLine();
        
        //Tổng chiều dài 2 chuỗi s1 và s2
        int S = s1.length() + s2.length();
        System.out.print("Tong chieu dai 2 chuoi s1 va s2 la: " + S);
        
        //Lấy 3 kí tự đầu tiên chuỗi s1
        System.out.println("3 ki tu dau tien cua chuoi s1 la: " + s1.substring(0, 3));
        //Lấy 3 kí tự cuối chuỗi s2
        System.out.println("3 ki tu dau tien cua chuoi s2 la: " + s2.substring(s2.length() - 3));
        //Lấy kí tự thứ 6 của chuỗi s1
        System.out.println("Ki tu thu 6 cua chuoi s1 la: " + s1.charAt(5));
        //Kiểm tra chuỗi s1 và s2 có bằng nhau không?
        if (s1.equals(s2)) {
            System.out.println("s1 va s2 bang nhau");
        }
        else {
            System.out.println("s1 va s2 khong bang nhau");
        }
        //s2 có xuất hiện trong s1 không? Nếu có thì đó là vị trí nào?
        int index = s1.indexOf(s2); //Xác định vị trí của kí tự đâu tiên của chuỗi s2 trong chuỗi s1
        if (index != -1) {
            System.out.println("Chuoi s2 xuat hien trong s1");
            System.out.println("Vi tri dau tien cua chuoi s2 trong s1 la: " + index);
        } else {
            System.out.println("Chuoi s2 khong xuat hien trong s1");
        }
        Bt5.close();
    }
}