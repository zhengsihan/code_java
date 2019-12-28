public class Example_Static {
    static {
        System.out.println("block I");
    }

    public static void main(String[] args) {
        System.out.println("--> function main");
    }

    static {
        System.out.println("block II");
    }
}
