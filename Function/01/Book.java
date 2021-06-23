/*
 * @Description: sdust-Java-可实现多种排序的Book类
 * @Author: Catop
 * @Date: 2021-06-23 17:27:28
 * @LastEditTime: 2021-06-23 17:31:53
 */


import java.util.*;

class Book{
    public String name;
    public Date publishDate;
    public double price;
    
    public Book(String name, Date publishDate, double price){
        this.name = name;
        this.publishDate = publishDate;
        this.price = price;
    }

    //覆写toString()方法
    @Override
    public String toString(){
        String msg = "";
        msg += "书名:"+this.name+",定价:"+this.price;

        return msg;
    }

}


//实现Comparator接口
class BookComparatorByPubDate implements Comparator<Book>{
    //覆写compare方法
    @Override
    public int compare(Book obj1, Book obj2){
        if(obj1!=null && obj2!=null){
            return obj2.publishDate.compareTo(obj1.publishDate);
        }

        return 0;
    }
}


class BookComparatorByPrice implements Comparator<Book>{
    @Override
    public int compare(Book obj1, Book obj2){
        if(obj1!=null && obj2!=null){
            if(obj1.price>obj2.price){
                return 1;
            }
            else if(obj1.price<obj2.price){
                return -1;
            }
            else{
                //价格相同则比较名称
                return obj1.name.compareTo(obj2.name);
            }
        }

        return 0;

    }
}