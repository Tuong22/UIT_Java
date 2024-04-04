import java.util.Scanner;  // Import the Scanner class
import java.util.Calendar;

class BT6 {
  public static void main(String[] args) {
    Scanner Bt6 = new Scanner(System.in); 
    
    System.out.println("Ngay a");
    System.out.println("Nhap ngay cua a: ");
    int a_day = Bt6.nextInt();
    System.out.println("Nhap thang cua a: ");
    int a_month = Bt6.nextInt();
    System.out.println("Nhap nam cua a: ");
    int a_year = Bt6.nextInt();
    
    Calendar aDay = Calendar.getInstance();
    aDay.set(Calendar.YEAR, a_year);
    aDay.set(Calendar.MONTH, a_month);
    aDay.set(Calendar.DAY_OF_MONTH, a_day);

    System.out.println("Ngay b");
    System.out.println("Nhap ngay cua b: ");
    int b_day = Bt6.nextInt();
    System.out.println("Nhap thang cua b: ");
    int b_month = Bt6.nextInt();
    System.out.println("Nhap nam cua b: ");
    int b_year = Bt6.nextInt();

    Calendar bDay = Calendar.getInstance();
    bDay.set(Calendar.YEAR, b_year);
    bDay.set(Calendar.MONTH, b_month);
    bDay.set(Calendar.DAY_OF_MONTH, b_day);

    //Xuất ngày a và ngày b
    System.out.println("Ngay a: " + aDay.getTime());
    System.out.println("Ngay b: " + bDay.getTime());
    //So sánh 2 ngày a và b
    int comparison = aDay.compareTo(bDay);
    if (comparison < 0) {
        System.out.println("Ngay b lon hon ngay a");
    } else if (comparison == 0) {
        System.out.println("Ngay a va ngay b bang nhau");
    } else {
        System.out.println("Ngay a lon hon ngay b");
    }
    //Cho biết a là ngày thứ mấy trng năm
    int dayOfWeek = aDay.get(Calendar.DAY_OF_WEEK);
    System.out.println("Ngay " + a_day + "/" + (a_month + 1) + "/" + a_year + " la ngay thu " + dayOfWeek + " trong tuan");
    //Cho biết tháng chứa a có bao nhiêu ngày
    int daysInMonth = aDay.getActualMaximum(Calendar.DAY_OF_MONTH);
    System.out.println("Thang " + (a_month + 1) + "/" + a_year + " co " + daysInMonth + " ngay.");
    //Cho biết năm chứa a có phải là năm nhuần không
    if ((a_year % 4 == 0 && a_year % 100 != 0) || (a_year % 400 == 0)) {
        System.out.println("Nam chua a la nam nhuan");
    } else {
        System.out.println("Nam chua a khong la nam nhuan");
    }
    Bt6.close();
  }
}