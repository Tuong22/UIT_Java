import java.util.Scanner;

class BT2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Nhap x:");
        int x = myObj.nextInt();
        System.out.println("Nhap n:");
        int n = myObj.nextInt();
        //Bat dau cho chạy giá trị S từ S = x trở đi
        float S = x;
        int k = 1;
        for (int i = 2; i <= n; i++){
            k = k + i;
            S += Math.pow(x, i)/k;
        }

        System.out.println("Gia tri cua S:");
        System.out.println(S);

        myObj.close();
    }
}