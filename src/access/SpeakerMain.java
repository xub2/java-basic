package access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        System.out.println("volume 필드(멤버 변수) 직접 접근");
        //speaker.volume = 200;
        speaker.showVolume();


    }
}
