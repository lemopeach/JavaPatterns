package ch1patternsmeet.myownexample.behavior.swim;

public class SwimNoWay implements SwimBehavior {

    @Override
    public void swim() {
        System.out.println("Не плаваю и не хочу.");
    }
}
