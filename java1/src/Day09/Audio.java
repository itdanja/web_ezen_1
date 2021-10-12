package Day09;

public class Audio implements RemoteControl {
		// implements : 클래스에 인터페이스 연결
	//1. 필드 
	private int volume;
	//2. 생성자
	//3. 메소드
	@Override
	public void turnOn() {
		System.out.println("Audio 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio 끕니다");
	}
	@Override
	public void setVolume(int volume) {
		if( volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if( volume < RemoteControl.MIN_VOLUME ) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 audio 볼륨 : "+volume);
	}
	
	
}
