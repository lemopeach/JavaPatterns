package ch1patternsmeet.chapterexemple.behavior.quack;

public class Squeak implements QuackBehavior{

    @Override
    public void quack(){
        System.out.println("Я пищу!");
    }
}
