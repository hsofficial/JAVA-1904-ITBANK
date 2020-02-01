package example;

public class TvExample {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.powerSwitch();
		tv.setChannel(15);
		tv.setVolume(8);
		
		IpTv iptv = new IpTv();
		iptv.settopSwitch();
		iptv.powerSwitch();
		iptv.setChannel(15);
		iptv.setVolume(8);
		iptv.search();
		iptv.powerSwitch();
		iptv.settopSwitch();
	}
}
