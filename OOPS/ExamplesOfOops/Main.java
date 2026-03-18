package OOPS.ExamplesOfOops;

public class Main { 
    public static void main(String[] args) {
        ImporterClass ic1 = new ImporterClass();
        ProducerClass pc = new ProducerClass();
        ImporterClass ich = new ImporterChild();
        // System.out.println(ic1.Integer1);
        ich.commonFunction();
        
    }

}
