package composition;
public class Window {
 
	private int width;
	private int length;
	private String color;
	private Cover cover;
	
	public Window(int width, int length, String color, Cover cover){
		this.width=width;
		this.length=length;
		this.color=color;
		this.cover=cover;
		
	}

	public int getWidth(){
		return width;
	}
	public int getLength(){
		return length;
		
	}
	public String getColor(){
		return color;
	}
	public Cover getCover(){
		return cover;
	}
}
