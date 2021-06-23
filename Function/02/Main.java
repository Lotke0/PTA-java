/*
 * @Description: 
 * @Author: Catop
 * @Date: 2021-06-23 17:36:17
 * @LastEditTime: 2021-06-23 17:36:32
 */
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Media[] ms  = new Media[n];
        for (int i=0; i<n; i++) {
            String type = sc.next();
            if (type.equals("book")) {
                ms[i] = new Book(sc.next(), sc.nextDouble());
            }else {
                ms[i] = new DVD(sc.next());
            }
        }
        double rent = MediaShop.calculateRent(ms, sc.nextInt());
        System.out.printf("%.2f", rent);
    }
}
