package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment04_Arrays_Collection {

	public static void main(String[] args) {
		//1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		System.out.println("------------------Ans1--------------------------");
		List<String> cities=new ArrayList<String>();
		cities.add("Delhi");
		cities.add("Bengalore");
		cities.add("Hydrabad");
		cities.add("Vishakapatnam");
		cities.add("Lucknow");

		List<Integer> areas =new ArrayList<Integer>();
		areas .add(1484);
		areas .add(741);
		areas .add(650);
		areas .add(640);
		areas .add(631);

		int totalarea3rdand4th= areas.get(2)+areas.get(3);
		//		System.out.println(totalarea3rdand4th);

		System.out.println("Combined area of "+cities.get(3) + " and " + cities.get(4)+ " is:- "+ totalarea3rdand4th +"sqKm " );

		//		2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		System.out.println("------------------Ans2--------------------------");
		Set<String> touristAttraction=new HashSet<String>();
		touristAttraction.add("EiffelTower");
		touristAttraction.add("Colosseum");
		touristAttraction.add("Basilica de la Sagrada Famila");
		touristAttraction.add("TajMahal");
		touristAttraction.add("Great Wall of China");
		touristAttraction.add("Niagara Falls");
		touristAttraction.add("Machu Picchu");
		touristAttraction.add("Cayman Crystal Caves");
		touristAttraction.add("Louvre Museum");
		touristAttraction.add("Iguazu Falls");
		System.out.println(touristAttraction);
		System.out.println(touristAttraction.size());

		System.out.println("------------------Ans3--------------------------");
		//	3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
		int Numbers[]= {345,642,35,98766,40,90,87655,453,8,78};
		//int fifth=Numbers[4]; int sixth=Numbers[5];
		double average=(Numbers[4]+Numbers[5])/2.0;
		System.out.println("Average of 5th and 6th number in a Array is:- "+average);


		System.out.println("------------------Ans4--------------------------");
		//		4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.

		ArrayList<String> moviesName= new ArrayList<String>();
		moviesName.add("Dangal (2016):- ₹1,914–2,200 crore");
		moviesName.add("Baahubali 2: The Conclusion (2017):- ₹1,747–1,810.60 crore");
		moviesName.add("Pushpa:-The Rule-Part-2(2024):- ₹1,642–1,800 crore");
		moviesName.add("RRR (2022) :- ₹1,253–1,387 crore");
		moviesName.add("Jawan (2023) :- ₹643.87 crore");
		System.out.println("Third Highest-grossing Movie is :- "+ moviesName.get(2));
	}

}
