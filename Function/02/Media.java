/*
 * @Description: Media类
 * @Author: Catop
 * @Date: 2021-06-23 17:36:45
 * @LastEditTime: 2021-06-23 17:50:10
 */

abstract class Media {
    public abstract double getDailyRent();
}


class Book extends Media{

    String name;
    double price;
    
    public Book(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public double getDailyRent(){
        return 0.01*this.price;
    }
}


class DVD extends Media{

    String name;
    public DVD(String name){
        this.name = name;
    }

    @Override
    public double getDailyRent(){
        return 1;
    }
}


class MediaShop{
    public static double calculateRent(Media[] medias, int days){
        double sum = 0;
        for(Media md : medias){
            sum += md.getDailyRent()*days;
        }

        return sum;
    }
}