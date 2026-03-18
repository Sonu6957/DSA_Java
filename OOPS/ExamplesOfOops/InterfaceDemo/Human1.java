package OOPS.ExamplesOfOops.InterfaceDemo;

public class Human1 {
    private Play playpreference;
    private Study sp = new StudyPattern();

    Human1(){
        this.playpreference = new PlayFootball();
    }

    Human1(Play playPreference){
        this.playpreference = playPreference;
    }

    void startStudy(int time){
        sp.start(time);
    }
    void studyEnd(String task){
        sp.studyEnd(task);
    }
    void getPlayPreference(){
     playpreference.start();
    }
    
    



}
