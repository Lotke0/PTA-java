/*
 * @Description: 裁判程序
 * @Author: Catop
 * @Date: 2021-06-23 17:35:12
 * @LastEditTime: 2021-06-23 17:35:56
 */

import java.util.*;
import java.text.*;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book[] books = new Book[4];
        //1. 从键盘接收用户输入的4本书的名称（仅有英文字符构成）、出版日期（格式：1998-10-09）、价格，生成Book对象，构造包含4本书的数组
        for(int i=0;i<4;i++){
            String name = scan.next();
            String date_str = scan.next();
            Date date = null;
            //将键盘录入的日期字符串转换为Date
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                date = sdf.parse(date_str);
            } catch (ParseException e) {
                System.out.println("日期格式有误");;
            }

            double price = Double.parseDouble(scan.next());

            Book book = new Book(name, date, price);
            books[i] = book;
        }

        //2.将books按照出版日期降序排序；然后输出books
        Arrays.sort(books, new BookComparatorByPubDate());
        for(Book book:books){
            System.out.println(book);
        }

        //3.将books按照价格升序排序，如果价格相同，则按照书名字母顺序排列。然后输出books
        Arrays.sort(books, new BookComparatorByPrice());
        for(Book book:books){
            System.out.println(book);
        }

        scan.close();
    }

}

/* 请在这里填写答案 */