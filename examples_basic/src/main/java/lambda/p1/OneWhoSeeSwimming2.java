package lambda.p1;

public class OneWhoSeeSwimming2 {
    AquaticObject ao;
    public OneWhoSeeSwimming2(AquaticObject ao) {
        this.ao = ao;
    }

    String swim(String str) {
        return ao.swim(str);
    }

    public static void main(String[] args) {
        System.out.println(new OneWhoSeeSwimming2(p1 -> "第一个看到游泳的人是" + p1).swim("zsh"));
        System.out.println(new OneWhoSeeSwimming2(p1 -> "next saw it is " + p1).swim("Minus"));
    }
}
