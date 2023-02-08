package nag;

public class Video{
		public String title;
		public int rating;
		public boolean avail;
		
		public Video( String title, int rating,boolean avail) {
			this.title=title;
			this.rating=rating;
			this.avail=avail;
		}
		
		public String getName() {
			return title;
		}
		
		public void setName(String title) {
			this.title=title;
		}
		
		public int getRating() {
			return rating;
		}
		
		public void setRating(int rating) {
			this.rating=rating;
		}
		
		public boolean getAvail() {
			return avail;
		}
		
		public void setAvail(boolean avail) {
			this.avail=avail;
		}
}

/*
public class Video {
	public String name;
	public boolean available;
	public int rating;
	
	public Video(String name, boolean available, int rating) {
	this.name = name;
	this.available = available;
	this.rating = rating;
	}
	
	public String getName() {
	return name;
	}
	
	public void setName(String name) {
	this.name = name;
	}
	
	public boolean isAvailable() {
	return available;
	}
	
	public void setAvailable(boolean available) {
	this.available = available;
	}
	
	public int getRating() {
	return rating;
	}
	
	public void setRating(int rating) {
	this.rating = rating;
	}
}*/
