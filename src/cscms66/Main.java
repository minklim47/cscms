package cscms66;

import java.util.ArrayList;
import java.util.ArrayList;
class StockOwner{
    //write your code here
    private String name;
    private int money;
    private ArrayList<Stock> stocks = new ArrayList<Stock>();

    public StockOwner(String name, int money){
        this.name = name;
        this.money = money;
    }
    public String getName(){
        return name;
    }
    public int getMoney(){
        return money;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public void AddStock(Stock stock){
        stocks.add(stock);
    }
    public int calculateAllAsset(){
        int sum = 0;
        for (Stock stock : stocks){
            sum += stock.getStockPrice();
        }
        return sum;
    }
    public void buyCar(Stock stock, Car car){
        stock.buy(car);
        money -= car.getPrice();
    }
    public void buyAllCar(Stock s1, Stock s2){
        int sum = 0;
        for (int i = 0; i < s2.cars.size(); i++){
            s1.cars.add(s2.cars.get(i));
            sum += s2.cars.get(i).getPrice();
        }
        money -= sum;
    }
    public int getAmountofCar(){
        int sum = 0;
        for (Stock stock : stocks){
            sum += stock.getStockCar();
        }
        return sum;
    }

}
class Stock{
    //write your code here
    public ArrayList<Car> cars = new ArrayList<Car>();



    public void buy(Car car){
        cars.add(car);
    }
    public void printAllCar(){
        for (Car car : cars){
            System.out.println("Car Name : " +car.getName());
            System.out.println("Car Brand : " +car.getBrand());
            System.out.println("Car Price : " +car.getPrice());
        }
    }
    public int getStockPrice(){
        int sum = 0;
        for (Car car : cars){
            sum += car.getPrice();
        }
        return sum;
    }
    public int getStockCar(){
        int sum = 0;
        for (Car car : cars){
            sum++;
        }
        return sum;
    }
}
class Car{
    //write your code here
    private String brand;
    private String name;
    private int price;
    public Car(){
    }
    public Car(String name){
        this.name = name;
    }
    public Car(String name, String brand){
        this.name = name;
        this.brand = brand;
    }
    public Car(String name, String brand, int price){
        this.brand = brand;
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }
}
class Main{
    public static void main(String[] args){
        StockOwner Owner1 = new StockOwner("RichMan", 1000000000);
        Stock s1 = new Stock();
        Stock s2 = new Stock();
        Stock s3 = new Stock();
        Stock s4 = new Stock();
        Owner1.AddStock(s1);
        Owner1.AddStock(s3);
        Owner1.AddStock(s4);
        Car c1 = new Car();
        Car c2 = new Car("Rod");
        Car c3 = new Car("Spike","Benz",20000000);
        Car c4 = new Car("Lambo","Lambo");
        Car c5 = new Car("Noname");
        Car c6 = new Car("Unnamed","Unnamed",300000000);
        s2.buy(c1);
        s2.buy(c2);
        System.out.println("Money of Owner");
        System.out.println("Name : "+Owner1.getName());
        System.out.println("Money : "+Owner1.getMoney());
        System.out.println("___________________________");
        Owner1.buyCar(s1, c3);
        Owner1.buyCar(s3, c4);
        Owner1.buyCar(s3, c5);
        Owner1.buyCar(s4, c6);
        System.out.println("Money of Owner <After Buy>");
        System.out.println("Name : "+Owner1.getName());
        System.out.println("Money : "+Owner1.getMoney());
        System.out.println("___________________________");
        System.out.println("Car in Each Stock");
        System.out.println("Stock 1");
        s1.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 2");
        s2.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 3");
        s3.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 4");
        s4.printAllCar();
        System.out.println("___________________________");
        Owner1.buyAllCar(s4, s2);
        System.out.println("Money of Owner <After Buy 2nd time>");
        System.out.println("Name : "+Owner1.getName());
        System.out.println("Money : "+Owner1.getMoney());
        System.out.println("___________________________");
        System.out.println("All asset");
        System.out.println("Value of Asset : "+Owner1.calculateAllAsset());
        System.out.println("Cars : "+Owner1.getAmountofCar());
        System.out.println("___________________________");
        System.out.println("Car in Each Stock");
        System.out.println("Stock 1");
        s1.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 2");
        s2.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 3");
        s3.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 4");
        s4.printAllCar();
        System.out.println("___________________________");
    }
}


