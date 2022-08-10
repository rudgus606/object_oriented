// 승객
package classpart;

class Student {
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        this.money -= 1000;
        bus.take(1);
    }

    public void takeTaxi(Taxi taxi) {
        this.money -= 1500;
        taxi.take(1);
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void showInfo() {
        System.out.println(this.getName() + " has " + this.getMoney());
    }
}
// 택시

class Taxi {
    int taxiNum;
    int intake = 0;
    int passenger;

    public Taxi(int num) {
        this.taxiNum = num;
    }

    public void take(int passenger) {
        this.passenger++;
        this.intake+=1500;
    }

    public int gettaxiNum() {
        return taxiNum;
    }

    public int getIntake() {
        return intake;
    }

    public int getPassenger() {
        return passenger;
    }

    public void showInfo() {
        System.out.println("Taxi "+this.gettaxiNum()+" got "+this.getPassenger()+" passengers and earned "+this.getIntake()+" won");
    }
}
// 버스

class Bus {
    int busNum;
    int intake = 0;
    int passenger;

    public Bus(int num) {
        this.busNum = num;
    }

    public void take(int passenger) {
        this.passenger++;
        this.intake+=1000;
    }

    public int getBusNum() {
        return busNum;
    }

    public int getIntake() {
        return intake;
    }

    public int getPassenger() {
        return passenger;
    }

    public void showInfo() {
        System.out.println("Bus "+this.getBusNum()+" got "+this.getPassenger()+" passengers and earned "+this.getIntake()+" won");
    }
}

class Test {
    public static void main(String[] args) {

        Student stu1 = new Student("John", 10000);
        Student stu2 = new Student("Kelly", 20000);
        Student stu3 = new Student("Harry", 14000);

        Bus bus100 = new Bus(100);
        Taxi taxi2 = new Taxi(2);
        Taxi taxi7 = new Taxi(7);

        stu1.takeBus(bus100);
        stu2.takeTaxi(taxi2);
        stu1.takeTaxi(taxi7);
        stu3.takeTaxi(taxi7);

        stu1.showInfo();
        stu2.showInfo();
        stu3.showInfo();
        bus100.showInfo();
        taxi2.showInfo();
        taxi7.showInfo();
    }
}