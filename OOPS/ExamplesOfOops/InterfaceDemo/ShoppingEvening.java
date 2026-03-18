package OOPS.ExamplesOfOops.InterfaceDemo;

public class ShoppingEvening implements Shopping{
    @Override
    public void start(){
        System.out.println("Started shopping in the evening");
    }
    @Override
    public void stop(){
        System.out.println("Stopped shopping in the evening.");
    }

}
