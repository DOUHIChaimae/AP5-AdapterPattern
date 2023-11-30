package ma.enset.computer;

public class VideoProjector implements VGA{
    @Override
    public void print(String message) {
        System.out.println("............ VP ...........");
        System.out.println(message);
        System.out.println("...........................");
    }
}
