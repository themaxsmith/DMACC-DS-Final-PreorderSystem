import java.util.ArrayList;
import java.util.Scanner;

public class menu extends page {
	public static menu EnterData = new menu("Enter User Data", new page[] {});
	public static menu PushSales = new menu("Push Sales", new page[] {});
	public static menu ViewStats = new menu("View User Stats", new page[] {});
	public static menu Settings = new menu("Settings", new page[] {});
	public static menu Main = new menu("Main", new page[] {EnterData,PushSales,ViewStats,Settings});
	public page[] pages = {};
	
	public type menu;
	
	public menu(String n,page[] main) {
	name = n;
	this.pages = main;
	}
	
	 public void display() {
		int i = 0;
		for ( page x : pages) {
			i ++;
		System.out.println("["+i+"]	"+x.name);

		}
	}
	
	public page input() {
	
		System.out.println("Enter a choice: ");
		
		if(gui.reader.hasNextInt()) 
		{
			int n = gui.reader.nextInt();
			
			return pages[n-1];
		}

		return this;
	}

	
}
