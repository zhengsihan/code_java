package lambda.p1;

public class OneWhoSeeFlying<T> {

    void sawAFlying(FlyingObject flyObj){
        System.out.println(flyObj.fly());
    }

    public static void main(String[] args) {
        OneWhoSeeFlying o1 = new OneWhoSeeFlying();
        o1.sawAFlying( () -> "I see something flying!");
    }
}
