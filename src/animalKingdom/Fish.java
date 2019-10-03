package animalKingdom;

public class Fish extends AbstractAnimals
{
public String walk;
public String breathe;
public String reproduce;

    public Fish(String name, int year ){
        super(name,year);
        this.name = name;
        this.year=year;
    }

    @Override
    public String getMove(){
        return "Swims";
    }
    @Override
    public String getBreathe(){
        return "Gills";
    }
    @Override
    public String getReproduce(){
        return "Eggs";
    }

    @Override
    public String toString()
    {
        return "Fish{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

}