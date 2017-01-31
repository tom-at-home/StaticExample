import java.util.ArrayList;

public class House {
	 private ArrayList<Human> humans = new ArrayList<>();
	 
	 public void addHuman(Human human) {
		 this.humans.add(human);
	 }
	 
	 public void removeHuman(Human human) {
		 this.humans.remove(human);
	 }
	 
	 /*public void move(Human human, House destination) {
		 this.humans.remove(human);
		 destination.humans.add(human);
	 }*/
	 
	 public static void move(Human human, House origin, House destination) {
		 origin.humans.remove(human);
		 destination.humans.add(human);
	 }
}
