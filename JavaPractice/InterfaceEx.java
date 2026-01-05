package JavaPractice;

class Phone {
    void call() {
        System.out.println("Calling...");
    }

    void sms() {
        System.out.println("Sending SMS...");
    }
}

interface Camera {
    void click();
    void record();
}

interface MusicPlayer {
    void play();
    void pause();
}

class Smartphone extends Phone implements Camera, MusicPlayer {

    // Implementing Camera methods
    public void click() {
        System.out.println("Photo clicked");
    }

    public void record() {
        System.out.println("Video recording started");
    }

    // Implementing MusicPlayer methods
    public void play() {
        System.out.println("Music playing");
    }

    public void pause() {
        System.out.println("Music paused");
    }

    // Own method
    void videoCalling() {
        System.out.println("Video calling...");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {

        Smartphone s = new Smartphone();

        /*s.call();
        s.sms();
        s.click();
        s.record();
        s.play();
        s.pause();
        s.videoCalling();*/

        Phone p = s;
        p.call();
        p.sms();

        Camera c = s;
        c.click();
        c.record();

        MusicPlayer m =s;
        m.play();
        m.pause();
    }
}
