package composition;

public class Wall {

	private Window window;
	private Cover cover;
	private Material material;
	
	public Wall(Window window, Cover cover , Material material){
		this.window =window;
		this.cover =cover;
		this.material=material;
	}
	
	public void printInf(){
		material.print();
	}
	public void ch(){
		cover.checkCover();
	}
}
