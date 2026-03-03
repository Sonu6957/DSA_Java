package OOPS.ExamplesOfOops;
public class ImporterClass {
    
    public static void main(String[] args) {
        ProducerClass pc = new ProducerClass(2,0,"blue");
        ProducerClass pc1 = new ProducerClass(4,0,"red");
        
       System.out.println(pc.value);
       System.out.println(pc1.value);
    }
    
}