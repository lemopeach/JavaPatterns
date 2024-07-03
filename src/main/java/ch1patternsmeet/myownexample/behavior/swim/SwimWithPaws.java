package ch1patternsmeet.myownexample.behavior.swim;

public class SwimWithPaws implements SwimBehavior {

    @Override
    public void swim() {
        System.out.println("У меня лапки и я ими плаваю!");
    }
}
