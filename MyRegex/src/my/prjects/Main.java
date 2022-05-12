package my.prjects;

public class Main {
    public static void main(String[] args) {

        Regex regex = new Regex();
        regex.deleteURL("Url is http://www.smth.com");
        regex.deleteURL("Url is http://www.crack.com");
    }
}
