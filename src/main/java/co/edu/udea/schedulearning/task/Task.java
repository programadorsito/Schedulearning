package co.edu.udea.schedulearning.task;
//Task{name String, description String}
public class Task
{
    private String name;
    private String description;

    public Task ()
    {

    }

    public Task (String name,String description)
    {
        this.name=name;
        this.description=description;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setDescription(String description)
    {
        this.description=description;
    }

    public String getDescription()
    {
        return this.description;
    }

}
