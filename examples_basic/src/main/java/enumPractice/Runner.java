package enumPractice;

public class Runner {
    public static void main(String[] args) {
        System.out.println(Console2.XBOX.exclusive());
    }

    public static void func1() {
        System.out.println(Status.UPLOADING.ordinal());
        System.out.println(Status.AUDITING.ordinal());
        System.out.println(Status.PLAYING.ordinal());
    }

    public static void func2() {
        Object[] o = Console.values();
        System.out.println(o);
        System.out.println(Console.getPriceByCompany("nintendo"));
    }
}
