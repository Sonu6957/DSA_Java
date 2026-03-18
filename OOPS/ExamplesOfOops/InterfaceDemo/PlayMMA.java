package OOPS.ExamplesOfOops.InterfaceDemo;

public class PlayMMA implements Play {
    @Override
    public void start(){
        System.out.println("Started Playing MMA");
    }
    @Override
    public void stop(){
        System.out.println("Stopped Playing MMA");
    }

}
