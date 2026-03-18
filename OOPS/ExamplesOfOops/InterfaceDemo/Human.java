package OOPS.ExamplesOfOops.InterfaceDemo;

public class Human implements Play,Shopping,Study{
    @Override
    public void start(){
        System.out.println("Started Playing");
    }
    @Override
    public void stop(){
        System.out.println("Stopped Playing");
    }
    
    
     


}
