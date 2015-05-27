package co.edu.udea.schedulearning.matter;
//Matter{name String, weight int, progress int}
public class Matter
{
    private String name;
    private int weight;
    private int progress;

    public Matter ()
    {

    }

    public Matter (String name,int weight,int progress)
    {
        this.name=name;
        this.weight=weight;
        this.progress=progress;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setWeight(int weight)
    {
        this.weight=weight;
    }

    public int getWeight()
    {
        return this.weight;
    }

    public void setProgress(int progress)
    {
        this.progress=progress;
    }

    public int getProgress()
    {
        return this.progress;
    }

}
