
public class Program {

	public static void main(String[] args) {
		System.out.println(Human.getCountHumans());
		Human hans = new Human("Hans");		
		System.out.println(Human.getCountHumans());
		Human maria = new Human("Maria");
		System.out.println(Human.getCountHumans());
		System.out.println(hans.getName());
		System.out.println(maria.getName());
		
		House house1 = new House();
		House house2 = new House();
		
		house1.addHuman(hans);
		
		//house1.move(hans, house2);
		
		House.move(hans, house1, house2);
	}

}
