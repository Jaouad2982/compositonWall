package composition;

public class Material {
	public int number;
	private String form;
	
	public Material(int number, String form){
		this.number = number;
		this.form = form;
		
	}
	public void print(){
		System.out.println("The number of matters used are " + number);
	}
	public int getNumber(){
		return number;
	}
	public String getForm(){
		return form;
	}
}
