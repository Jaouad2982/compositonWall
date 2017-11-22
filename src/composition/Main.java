package composition;
//Jaouad Sarouti
//Composition Demo, using a wall that has a window that has the following chars...
//Creation of 5 classes 
public class Main {

	public static void main(String[] args) {
		Material material = new Material(7, "circle");
		Cover cover = new Cover(5, 6, material);
		Window window = new Window(4, 4, "yellow", cover);
		Wall wall = new Wall(window, cover, material);
		wall.printInf();
		wall.ch();
		
	}

}
