package ch1patternsmeet.chapterexemple.behavior.quack;

public class MuteQuack implements QuackBehavior{

    public void quack(){
        System.out.println("Я не звучу");
    }
}
