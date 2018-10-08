package acme.tests.chapter7.test03;

public class Song {
    public void playMusic() {
        System.out.print("Play!");
    }

//    private static int playMusic() {
//        System.out.print("Music!");
//    }

    public static void main(String[] tracks) {
        new Song().playMusic();
    }
}