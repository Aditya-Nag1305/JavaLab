package nag;
//import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		inv lib= new inv();
		lib.addVideo("Abcd", 3, true);
		lib.addVideo("kal ho no", 4, true);
		lib.addVideo("DDLJ", 5, true);
		
		lib.displayInv();
		
		lib.rentVideo("DDLJ");
		
		lib.displayInv();
		
		lib.rentVideo("A");
		
		lib.displayInv();
	}
}

/*	public class Main {
		
	public static void main(String[] args) 
	{
		InventoryCentralSystem system = new InventoryCentralSystem();
		
		/*system.addVideo("The Shawshank Redemption", true, 5);
		system.addVideo("The Godfather", true, 5);
		system.addVideo("The Godfather: Part II", true, 5);
		
		system.displayInventory();
		
		system.rentVideo("The Shawshank Redemption");
		
		system.displayInventory();*/
		
		/*int choice;
		while(true) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter your Choice:");
			System.out.println("1.Add\t2.Display\t3.Rent");
			choice=in.nextInt();
			switch(choice) 
			{
			case 1:system.addVideo();
					break;
			case 2:system.displayInventory();
					break;
			case 3: System.out.println("Enter title to rent:");
					in.nextLine();
					system.rentVideo(in.nextLine());	
					break
			}
		}
	}
} */
