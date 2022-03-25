package televisores;

public class Control {
	private TV tv;
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	public TV getTV() {
		return tv;
	}
	public void setTV(TV tv) {
		this.tv= tv;
	}
}
