package animalKingdom;

import java.util.*;
//Each Class gets it's own file.

public class Main
{

    public static ArrayList<AbstractAnimals> filteredList = new ArrayList<AbstractAnimals>();
    public static void printAnimals(ArrayList<AbstractAnimals> animals, CheckAnimal tester){
        filteredList.clear();
        for (AbstractAnimals a : animals)
        {
            if(tester.test(a))
            {
                System.out.println(a.getName());
            }
        }
    };



    ////
    public static void main(String[] args)
    {
        //In Here is where you're going to make your animals and tell them what to do. 
        // ex.
        // Horse seabiscuit = new Horse("Seabiscuit");
        //seabiscuit.eat(10);
        //this will trigger the interfaces and abstract classes.
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Big Foot", 2021);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);


        //ADDING TO ARRAY

        ArrayList<AbstractAnimals> newList = new ArrayList<AbstractAnimals>();
        newList.add(armadillo);
        newList.add(bigfoot);
        newList.add(catfish);
        newList.add(koala);
        newList.add(panda);
        newList.add(parrot);
        newList.add(peacock);
        newList.add(perch);
        newList.add(pigeon);
        newList.add(raccoon);
        newList.add(salmon);
        newList.add(swan);
        newList.add(sloth);
        newList.add(toucan);
        newList.add(zebra);

        System.out.println(newList.toString());
        System.out.println("all the animals in descending order by year named");
        newList.sort((a1, a2)->a2.getYear()-a1.getYear());
        newList.forEach((a) -> System.out.println(a.getName() + " was named in " + a.getYear())); 
        System.out.println("all the animals alphabetically"); 
        newList.sort((a1, a2)->a1.getName().compareToIgnoreCase(a2.getName()));
        newList.forEach((a) -> System.out.println(a.getName()));

        System.out.println("all the animals in order by how they move");
        newList.sort((a1, a2)-> a1.getMove().compareToIgnoreCase(a2.getMove()));
        newList.forEach((a) -> System.out.println(a.getMove() + ", moves by animal " + a.getName()));

        System.out.println("only those animals that breath with lungs"); 
        printAnimals(newList, a -> a.getBreathe() == "Lungs");

        System.out.println("only those animals that breath with lungs and were named in 1758");
        printAnimals(newList, a -> a.getBreathe() == "Lungs" && a.getYear() == 1758);

        System.out.println("only those animals that lay eggs and breath with lungs");
        printAnimals(newList, a -> a.getBreathe() == "Lungs" && a.getReproduce() == "Eggs"); 

        System.out.println("alphabetically only those animals that were named in 1758");
        newList.sort((a1, a2)->a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(newList, a -> a.getYear() == 1758); 

        System.out.println("Might as well try stretch For the list of animals, list alphabetically those animals that are mammals.");
        newList.sort((a1, a2)->a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(newList, a -> a instanceof Mammals); //instanceof all lowercase NOT camel
        
    }

    
}