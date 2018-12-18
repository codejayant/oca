public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 1; i++) {
            System.out.println("args = [" + "]");
        }

        for (int i = 0, j = 0; i == j; i++, System.out.println("ulaaaa"));



        Move.print();


        StringBuilder s = new StringBuilder();


//        System.out.println("Hello World!");
    }

    interface Move {
        public static void print() {}

        public static void main(String[] args) {
            System.out.println("Main");
        }
    }
}
