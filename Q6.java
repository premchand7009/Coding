import java .util.Scanner;
public class Q6 {
    class Vehicle {
        String model;
        int year;
        Vehicle(){

        }
        Vehicle(String a,int b){
            model=a;
            year=b;
        }
    }
    class Car extends Vehicle{
        int carId;
        double price;
        Car(String model,int year,int carId,double price){
            super(model,year);
            this.carId=carId;
            this.price=price;
        }
        void carDisplay(){
            System.out.println("Car Model:"+model+",year:"+year+",Car ID:"+carId+"price:"+price);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Car c1 = new Car("BMW",2007,2569,200.25);
        
    }
}
