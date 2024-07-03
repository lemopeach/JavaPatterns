package ch1patternsmeet.myownexample.behavior.fly;

public class FlyInDreams implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Летаю только во сне и росту!");
    }

    @Override
    public void yourDreams(String dream){
        System.out.println("Перед сном я мечатю о всяком-привсяком!, Например, о "+dream);
    }
}
