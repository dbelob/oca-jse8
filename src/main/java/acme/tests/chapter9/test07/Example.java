package acme.tests.chapter9.test07;

public class Example {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("radical")
//                .insert(sb.length(), "robots");
        StringBuilder sb = new StringBuilder("radical");
        sb.insert(sb.length(), "robots");
        System.out.println(sb);
    }
}