package nag;

import java.util.ArrayList;

public class inv {
		public ArrayList<Video> inventory;
		
		public inv() {
			 inventory= new ArrayList<Video>();
		}
		
		public void addVideo(String title,int rating,boolean avail) {
			Video temp= new Video(title, rating, avail);
			inventory.add(temp);
		}
		
		public void displayInv() {
			for(Video temp:inventory) {
					System.out.println("Movie: " + temp.getName() + "\tRatings: "+ temp.getRating()+ "\tAvailable: " + temp.getAvail());
			}
		}
		
		public void rentVideo(String title) 
		{
			for(Video temp: inventory) 
			{
				if(temp.getName().equals(title) && temp.getAvail())
				{	
						temp.setAvail(false);
						System.out.println("Movie: "+ temp.getName()+"is successfully rented!");
						return;
					
				}
			}
					System.out.println("Sorry, the title is not available");
				
			}
		}


//import java.util.Scanner;

/*public class InventoryCentralSystem {
	public ArrayList<Video> inventory;
	public InventoryCentralSystem() 
	{
		inventory = new ArrayList<Video>();
	}
	
	public void addVideo() {
	Scanner in= new Scanner(System.in);
	
	System.out.println("Enter movie name:");
	String name= in.nextLine();
	
	System.out.println("Enter Availability Status - true/false:");
	boolean available=in.nextBoolean();
	
	System.out.println("Enter rating:");
	int rating=in.nextInt();
	
	Video video = new Video(name, available, rating);
	inventory.add(video);
	}
	
	public void displayInventory() 
	{
		for (Video video : inventory) {
		System.out.println("Movie: " + video.getName() + ", Available: " + video.isAvailable() + ",	Rating: " + video.getRating());
	}
	}
	
	public void rentVideo(String name) {
	for (Video video : inventory) 
	{
		if (video.getName().equals(name) && video.isAvailable()) 
		{
			video.setAvailable(false);
			System.out.println("Movie rented successfully: " + video.getName());
			return;
		}
	}
	System.out.println("Sorry, the movie is not available for rent.");
	}
	
}*/
 

