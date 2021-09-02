package flyweight;

public class AnimalClient {

	public static void main(String[] args)
	{
		Animal catAnimal=AnimalFactory.getCat("CAT");//creating object is time consuming so use AnimalFactory
		catAnimal.printAnimalAttributes();
		
		Animal catAnimal2=AnimalFactory.getDog("DOG");
		catAnimal2.printAnimalAttributes();
		System.out.println(catAnimal.hashCode());
		System.out.println(catAnimal2.hashCode());
		

	}

}
