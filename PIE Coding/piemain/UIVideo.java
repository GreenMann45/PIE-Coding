package piemain;

public class UIVideo {

	private String resolution;
	private String texture;
	private String shadow;
	private String particle;

	public UIVideo() {
		resolution = "1900x1800";
		texture = "HIGH";
		shadow = "HIGH";
		particle = "ALL";
	}

	public void setResolution(String r) {
		resolution = r;
	}

	public void setTexture(String t) {
		texture = t;
	}

	public void setShadow(String s) {
		shadow = s;
	}

	public void setParticle(String p) {
		particle = p;
	}

	public String getResolution() {
		return resolution;
	}

	public String getTexture() {
		return texture;
	}

	public String getShadow() {
		return shadow;
	}

	public String getParticle() {
		return particle;
	}


}
