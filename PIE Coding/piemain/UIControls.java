package piemain;

public class UIControls {

	private String up;
	private String down;
	private String left;
	private String right;
    //YUMMY! =)
	public UIControls() {
		up = "W";
		left = "A";
		down = "S";
		right = "D";

	}

	public void setUp(String u) {
		up = u;
	}
	public void setLeft(String l) {
		left = l;
	}
	public void setDown(String d) {
		down = d;
	}
	public void setRight(String r) {
		right = r;
	}

	public String getUp() {
		return up;
	}
	public String getLeft() {
		return left;
	}
	public String getDown() {
		return down;
	}
	public String getRight() {
		return right;
	}

}

