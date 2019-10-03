package animalKingdom;

public class Birds extends AbstractAnimals
{
public String walk;
public String breathe;
public String reproduce;
public String name;
public int year;

    public Birds(String name, int year){
        super(name,year);
        
        this.name = name;
        this.year=year;
        //this.id=id;
    }

    @Override
    public String getMove(){
        return "Flys";
    }
    @Override
    public String getBreathe(){
        return "Lungs";
    }
    @Override
    public String getReproduce(){
        return "Eggs";
    }
    
    public int getID(int id){
        return id;
    }

    @Override
    public String toString()
    {
        return "Birds{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

}