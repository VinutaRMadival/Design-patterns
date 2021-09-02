package flyweight;

public class Cat implements Animal{

	private String name=null;
	
	
	
	
	@Override
	public void setName(String name) {
	this.name=name;
}
	@Override
	public void printAnimalAttributes() {
		// TODO Auto-generated method stub
		System.out.println("name of the animal"+ " "+this.name);
		System.out.println("number of eyes is"+CommonSharableclass.eyes);
		System.out.println("number of legs is"+CommonSharableclass.legs);
		System.out.println("number of nose is"+CommonSharableclass.nose);
		System.out.println("number of tail is"+CommonSharableclass.tail);
		
	}
	

}
