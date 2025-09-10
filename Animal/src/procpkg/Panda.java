package procpkg;

public class Panda extends Animal {
	public Panda(double length, int speed) {
		super("パンダ", length, speed);
	}

@Override
	public String getScientificName() {
		return "アイルロポダ・メラノレウカ";
	}
}