	import java.awt.Menu;
import java.util.Scanner;
public class gui {
	public static Scanner reader = new Scanner(System.in);  
	public page currentPage = menu.Main;
	public gui() {
		while(true) {
		currentPage.display();
		currentPage = currentPage.input();
		}
	}

}
