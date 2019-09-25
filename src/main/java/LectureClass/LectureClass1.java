package LectureClass;
// currenttly going over classes and objects constructers invoking methods
//object.method syntax
// refrencing eployee project
//double MY_PI = Math.PI;
//currently going over getter and setter
//
public class LectureClass1 {
    private String items;
    private double cost;
    private double total;

    public LectureClass1(String items, double cost, double total){
        this.items = items;
        this.cost = cost;
        this.total =total;
    }
    public void itemsCost(){
        double x = 10.00;
        double y = 5.00;
        double z = 1.00;
        System.out.println(x + y + z);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "LectureClass1{" +
                "items='" + items + '\'' +
                ", cost=" + cost +
                ", total=" + total +
                '}';
    }
    //    private String name;
//    private double age;
//
//public LectureClass1(String name,double age){
//    this.name = name;
//    this.age = age;
//    }
//
//    public void  printName(){
//        System.out.println(getName());
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "LectureClass1{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}