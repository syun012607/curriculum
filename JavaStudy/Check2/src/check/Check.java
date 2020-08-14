package check;

import constants.Constants;

public class Check{


    private static String firstName="桑村";
    private static String lastName="駿";

public static void main(String[] args) {
	System.out.print("printNameメソッド →");
	printName(firstName,lastName);
	Pet p = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
	RobotPet c = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
	p.introduce();
	c.introduce();

	}

private static void printName(String f,String l) {
	System.out.println(f+l);
}

}
