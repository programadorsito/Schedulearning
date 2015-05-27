package co.edu.udea.schedulearning.note;
//Note{name String, description String}
public class Note
{
    private String name;
    private String description;

    public Note ()
    {

    }

    public Note (String name,String description)
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
