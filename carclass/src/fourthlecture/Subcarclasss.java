package fourthlecture;

public class Subcarclasss extends carclass{
	public float chargeinbattery;//new instance method//
	private String colourString;
	public Subcarclasss() {
		super();
	}
	public Subcarclasss(String manu,String model,String key,int cc,float fl,float charge,String colour) {
		super(manu,model,key,fl,cc);//inherits method from super class//
		chargeinbattery=charge;
		colourString=colour;
		
	}
	//getters//
	public float getchargeInBattery() {
		return chargeinbattery;
		}
	//setters//
	public void SetChargeInBattery(int charge) {
		chargeinbattery=charge;
	}
	//getters//
	public String getColourString() {
		return colourString;
	}//setters//
	public void setColourString(String colourString) {
		this.colourString = colourString;
	}
}
