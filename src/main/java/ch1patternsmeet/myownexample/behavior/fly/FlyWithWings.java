package ch1patternsmeet.myownexample.behavior.fly;

public class FlyWithWings implements FlyBehavior{

        @Override
        public void fly() {
            System.out.println("Мои крылья возносят меня на огромную высоту!");
        }

        @Override
        public void yourDreams(String dream){
        }

        public void flyHigh(int high){
            System.out.println("Мне так нравится смотреть на мир с высоты "+high+"километров!");
        }
}
