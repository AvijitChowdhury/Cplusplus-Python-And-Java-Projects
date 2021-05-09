package fourthlecture;

public class learningclass {
	private int aNumber=12;
	static private carclass ourcar=new carclass();
	static private carclass ourAnotherCar;

	public static void main(String[] args) {
	Subcarclasss ourSubCar=new Subcarclasss("BMW","7series","fdf",3000,232,50,"blue");	
    ourAnotherCar=new carclass("TOYOTA","ALLIEN","a",30,10);
    //our first car//
	System.out.println("manufacturername:"+ourAnotherCar.manufacturername);
	System.out.println("manufacturername:"+ourAnotherCar.getmodelName());
	System.out.println("passwordMatch: "+ourAnotherCar.matchpassword("fdfd"));
	System.out.println("1stcarCC: "+ourcar.engineCC);
	System.out.println("ouranothercarCC: "+ourAnotherCar.engineCC);
	System.out.println("amountOfFuel: "+ourAnotherCar.presentAmountofFuel()+"L");
	
	ourAnotherCar.addfuelAmount(2);
	System.out.println("amount of fuel after consuming 2L:"+ourAnotherCar.presentAmountofFuel()+"L");
	ourAnotherCar.runForSecond(60);
	System.out.println("amount of fuel after consuming 2L and run for 60s:"+ourAnotherCar.presentAmountofFuel()+"L"+"\n");
	
	
	
	//our sub car//
	System.out.println("manufacturer name:"+ourSubCar.manufacturername);
	
	System.out.println("manufacturername:"+ourSubCar.getmodelName());
	System.out.println("passwordMatch: "+ourSubCar.matchpassword("fdfd"));
	System.out.println("1stcarCC: "+ourSubCar.engineCC);
	
	System.out.println("amountOfFuel: "+ourSubCar.presentAmountofFuel()+"L");
	
	ourAnotherCar.addfuelAmount(2);
	System.out.println("amount of fuel after consuming 2L:"+ourSubCar.presentAmountofFuel()+"L");
	ourAnotherCar.runForSecond(60);
	System.out.println("amount of fuel after consuming 2L and run for 60s:"+ourSubCar.presentAmountofFuel()+"L");
	
	}
	static void print(Object a) {
		System.out.println(a);
	}

}
