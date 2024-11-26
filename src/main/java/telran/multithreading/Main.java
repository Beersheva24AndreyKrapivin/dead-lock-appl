package telran.multithreading;

public class Main {
    public static void main(String[] args) {
        new Worker().start();
        new Worker().start();
    }
}