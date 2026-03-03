package OOPS.ExamplesOfOops;
public class ProducerClass {
    int wheel;
    int steering;
    String color;
    static int value;
    public ProducerClass(int wheel,int steering,String color){
        this.wheel = wheel;
        this.steering = steering;
        this.color = color;
        ProducerClass.value++;
    }
    public static  void main(String[] args) {
        //Use of static
        int a = 10;
        System.out.println("The value of a is "+a);
    }
    public void display(){
        System.out.println("The no. of wheel is "+wheel);
        System.out.println("The colour is "+color);
    }
    public void displayValue(){
        System.out.println("The value is "+ProducerClass.value);
     
    }
    public void incrementValue(int value){
        ProducerClass.value = value + 1;
        System.out.println("The value is "+ProducerClass.value);
    }



}
