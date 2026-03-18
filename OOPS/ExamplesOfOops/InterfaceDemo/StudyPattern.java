package OOPS.ExamplesOfOops.InterfaceDemo;

public class StudyPattern implements Study{
    @Override
    public void start(int time){
        System.out.println("I will play for "+time + " hours.");
    }
    
    @Override
    public void studyEnd(String task){
        System.out.println("I will "+task+" after study.");
    }

}
