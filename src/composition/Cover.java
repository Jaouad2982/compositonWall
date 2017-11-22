package composition;

public class Cover {

	private int width;
	private int length;
	private Material material;
	
	public Cover(int width, int length, Material material){
		this.width=width;
		this.length=length;
		this.material=material;
		
	}
	public void checkCover(){
		System.out.println("Cover is made of " + width +" and " + length);
	}
	public int getWidth(){
		return width;
	}
	public int getLength(){
		return length;
	}
	public Material material(){
		return material;
	}
}
