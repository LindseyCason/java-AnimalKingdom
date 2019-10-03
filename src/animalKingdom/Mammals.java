package animalKingdom;

public class Mammals extends AbstractAnimals
{
public String walk;
public String breathe;
public String reproduce;

    public Mammals(String name, int year ){
        super(name,year);
        this.name = name;
        this.year=year;
    }

    @Override
    public String getMove(){
        return "Walks";
    }
    @Override
    public String getBreathe(){
        return "Lungs";
    }
    @Override
    public String getReproduce(){
        return "Live Birth";
    }

    @Override
    public String toString()
    {
        return "Mammals{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

}