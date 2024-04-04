import java.util.Scanner;

class BT3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Nhap canh thu nhat: ");
        float a = myObj.nextFloat();
        
        System.out.print("Nhap canh thu hai: ");
        float b = myObj.nextFloat();
        
        System.out.print("Nhap canh thứ ba: ");
        float c = myObj.nextFloat();

        System.out.print("Chu vi cua tam giac: ");
        System.out.println(a+b+c);
        
        System.out.print("Dien tich cua tam giac: ");
        //Nửa chu vi tam giác
        float p = (a+b+c)/2;
        float S = (float) Math.sqrt(p*(p - a)*(p - b)*(p - c));
        System.out.println(S);
        myObj.close();
    }
}