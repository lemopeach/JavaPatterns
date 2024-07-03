package ch1patternsmeet.myownexample.behavior.swim;

public class SwimWithFins implements SwimBehavior {

    @Override
    public void swim(){
        System.out.println("Стучу плавничками по воде!");
    }
}
