package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public void show(){
        System.out.println("The battery load is " + this.load);
    }

    public static void main(String[] args) {
        Battery firstBattery = new Battery(10);
        Battery secondBattery = new Battery(5);
        firstBattery.show();
        secondBattery.show();
        firstBattery.exchange(secondBattery);
        firstBattery.show();
        secondBattery.show();
    }
}
