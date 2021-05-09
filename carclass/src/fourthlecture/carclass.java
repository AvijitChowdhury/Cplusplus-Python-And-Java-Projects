package fourthlecture;
public class carclass{
	public String manufacturername;//public variables//
	//private variables & instance method//
	private String modelName;
	private String carkeyvalue;
	//default//
	int engineCC;
	private float fuelAmount;//private variables//
	public float carWeight;//public variables//
	final private float amountOfFuelConsumptionPerSecond = 10;//setting final value//
	//constructor//
	public carclass() {
		manufacturername=new String();
		engineCC=1200;
		fuelAmount=0;
		carWeight=0;
	}
	public carclass(String carName) {
		manufacturername=new String(carName);
		modelName=new String();
		
	}
	public carclass(String manu,String model,String key,float fuel,int engineCC) {
		manufacturername=manu;
		modelName=model;
		fuelAmount=fuel;
		this.engineCC=engineCC;
		carkeyvalue=key;
				
		
	}
	//getters method//
	public String getManufacturername() {
		return manufacturername;
	}
	public String getModelName() {
		return modelName;
	}
	public float presentAmountofFuel()//instance method//
	{
		return fuelAmount;
	}
	//setters//
	public void addfuelAmount(float fuel) {
		 this.fuelAmount+=fuel;
	}
	public void runForSecond(int timeSeconds) {
		this.fuelAmount-=timeSeconds*amountOfFuelConsumptionPerSecond;
		
	}
	public boolean matchpassword(String password) {
		 return carkeyvalue.equals(password);
	}
	public String getmodelName() {
		return modelName;
	}
	
	
	
}