package OOPS.ExamplesOfOops;
public class ImporterClass extends ProducerClass{
    int Integer2 = 2;
    String String2 = "String2";
    boolean Boolean2 = true;
    
    ImporterClass(){
        super(2,"String2",true);
    }
    void importerfunction(){
        System.out.println("Importer function run");
        super.producerfunction();
    }
    
    void commonFunction(){
        System.out.println("Common Function in Importer Class");
    }
    
    
    
    
}