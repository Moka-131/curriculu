package check;

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
		
		Pet pet = new Pet("java吉", "hoge");
		pet.introduce();
		RobotPet robotpet = new RobotPet("R2D2", "ルーク");
		robotpet.introduce();
	}
		

}
