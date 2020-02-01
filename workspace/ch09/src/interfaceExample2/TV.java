package interfaceExample2;

public class TV implements RemoteControl{
	
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME)
			this.volume = MAX_VOLUME;
		else if(volume < MIN_VOLUME)
			this.volume = MIN_VOLUME;
		else
			this.volume = volume;
		System.out.println("VL : " + this.volume);
	}
}
