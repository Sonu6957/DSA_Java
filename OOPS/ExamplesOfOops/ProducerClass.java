package OOPS.ExamplesOfOops;
public class ProducerClass {
    int Integer1;
    String String1;
    boolean Boolean1;
    static int incrementValue1 = 5;
    public ProducerClass(int Integer1, String String1, boolean Boolean1){
        this.Integer1 = Integer1;
        this.String1 = String1;
        this.Boolean1 = Boolean1;
        ProducerClass.incrementValue1++;
    }
    public ProducerClass(){
        this.Integer1 = 1;
        this.String1 = "Default String1";
        this.Boolean1 = true;
    }
    void producerfunction(){
        System.out.println("Producer function run");
    }
    
    



}
