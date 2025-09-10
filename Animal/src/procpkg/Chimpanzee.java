package procpkg;

public class Chimpanzee extends Animal {
	public Chimpanzee(double length, int speed) {
		super("チンパンジー", length, speed);
	}

@Override
	public String getScientificName() {
		return "パン・トゥログロディテス";
	}
}