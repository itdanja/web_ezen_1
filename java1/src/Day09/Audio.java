package Day09;

public class Audio implements RemoteControl {
		// implements : Ŭ������ �������̽� ����
	//1. �ʵ� 
	private int volume;
	private boolean mute; 
	
	//2. ������
	//3. �޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("Audio �մϴ�");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio ���ϴ�");
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
		System.out.println("���� audio ���� : "+ this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if( mute ) {System.out.println("����� ���� ó�� �մϴ�");}
		else {System.out.println("����� ���� �����մϴ�.");}
	}
	
	
}
