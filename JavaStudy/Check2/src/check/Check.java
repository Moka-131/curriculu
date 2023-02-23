package check;

import constants.Constants;

public class Check {
	private static String firstname = "萌華";
	private static String lastname = "小林";
    
	
	
	private static String printName(String firstname, String lastname) {
		
		return firstname + lastname;
		
    }
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		printName(lastname, firstname);
		System.out.println("printNameメソッド → " + lastname + firstname);
		System.out.println();
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		
		
		
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotpet.introduce();
		
	}
		

}
