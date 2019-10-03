package animalKingdom;

public abstract class AbstractAnimals
{
    // private static int maxId = 0; //first project has this info    
    
    public String name; //Must be public, couldn't be seen by other files
    public int year;//Must be public, couldn't be seen by other files

    public AbstractAnimals(String name, int year)
    {
        // this.maxId=maxId++; //this is to get unique id.
        this.name = name;
        this.year=year;
    }
    
    public abstract String getMove(); //The child gets to decide how to use these
    public abstract String getBreathe();//
    public abstract String getReproduce();//
    
    public String getName(){
            return name;
        }
    public int getYear(){
        return year;
        }

    // public AbstractAnimals(String name){
    //     this.name=name;
    //     //constructor?
    // }
    // public void setName(String name){
    //     this.name=name;
    //     //setter
    // }
    // public void setId(int id){
    //     this.id=id;
    //     //setter
    // }
    // public int getId(){
    //     return id;
    //     //getter
    //     //look into first project for unique ID
    // }
    
    
    // public void setyear(int year){
    //     this.year=year;
    // }
    // public int getEat(){
    //     return eat;
    // }
    // public String getMove(String name, String type, String move){
    //     return name + " is a " + type + " and " + move + " to move.";
    // }

}