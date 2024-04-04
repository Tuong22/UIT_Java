import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class BT7 {
    public static void main(String[] args) {
        Scanner Bt7 = new Scanner(System.in);
        Random random = new Random();
        //Cho mảng số nguyên A (kích thước n)
        int A[] = {2,7,3,-1};
        //1. Tạo mảng nguyên B vói các giá trị ngẫu nhiên
        System.out.println("Nhap m phan tu:");
        int m = Bt7.nextInt();
        int[] B = new int[m];
        for(int i = 0; i<m; i++) {
            B[i] = random.nextInt();
        }
        //2. Xuất toàn bộ các phần tử của B ra màn hình
        String B_String = Arrays.toString(B);
        System.out.println(B_String);
        //3. Tạo mảng C từ A
        int[] C = Arrays.copyOf(A, A.length);
        //4. Thay thế phần tử
        System.arraycopy(B, m-3, C, 0, 3);
        //5. Sắp xếp mảng C theo tăng dần và xuất ra màn hình
        Arrays.sort(C);
        String C_String = Arrays.toString(C);
        System.out.println(C_String);   
        Bt7.close();
    }
}

