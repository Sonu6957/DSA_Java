package OOPS.ExamplesOfOops.InterfaceDemo;

public class PlayFootball implements Play {
    @Override
    public void start(){
        System.out.println("Started Playing football");
    }
    @Override
    public void stop(){
        System.out.println("Stopped Playing football");
    }

}
