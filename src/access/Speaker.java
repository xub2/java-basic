package access;

public class Speaker {

    private int volume; //private 접근제어자로 현재 클래스에서만 필드 사용 가능

    Speaker (int volume){
        this.volume = volume; //초기 볼륨값 받기
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        }
        else{
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("볼륨을 10 감소합니다.");
    }

    void showVolume(){
        System.out.println("현재 음량 : " + volume);
    }
}
