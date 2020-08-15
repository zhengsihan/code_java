package others;

public class OneWhoSeeSwimming {
    public String swim(String str) {
        AquaticObject ao1 = p1 -> "I saw " + str + " swimming!";
        return ao1.swim(str);
    }

    public static void main(String[] args) {
        OneWhoSeeSwimming oneWhoSeeSwimming = new OneWhoSeeSwimming();
        System.out.println(oneWhoSeeSwimming.swim("zsh"));
    }
}
