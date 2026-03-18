package OOPS.ExamplesOfOops;

public class ImporterChild extends ImporterClass {
    int Integer3;
    String String3;
    boolean Boolean3;

    void iChildfunction(){
        System.out.println("Child class has run.");
        
        super.importerfunction();
    }
    
    void commonFunction(){
        System.out.println("Common Function in Importer Child Class");
    }


}
