package com.class19;

public class Aplication {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		System.out.println(animal.age);
		System.out.println(animal.weigth);
		System.out.println(animal.breed);
		System.out.println(animal.name);

		animal.name = "Joe";
        animal.age = 40;
        System.out.println(animal.age);
        
Animal animal2 = new Animal();        

System.out.println("This is anim2" );

        System.out.println(animal2.age);
        System.out.println(animal2.weigth);
        System.out.println(animal2.breed);
        System.out.println(animal2.name);


        
        Animal animal3 = new Animal();        

        System.out.println("This is anim3" );

                System.out.println(animal3.age);
                System.out.println(animal3.weigth);
                System.out.println(animal3.breed);
                System.out.println(animal3.name);
		
                int my_array[] = { -1, 2, 3, 4, 5, 6, 7, 8, -98, 10 };
                System.out.println("Printing the minimun value");
                System.out.println(Minimum.minValues(my_array));
                
        		int[] array = { 25, 14, 56, 15, 36, 56, 1200, 77, 18, 29, 49 };
                System.out.println("Printing the max value");
                System.out.println(Minimum.maxOfValues(array));


	}
}
