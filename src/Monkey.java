//creating class Monkey
class Monkey extends RescueAnimal
{
    //declaring variables
    public String bodyLength;
    public String tailLength;
    public String height;
    public String species;
    //constructor to initialize the monkey specifications
    public Monkey(String name,String species, String tailLength,String height,String bodyLength,String gender,String age,String weight,String acqDate,String acqCountry,String ts,boolean res,String isc)
    {
        setName(name);
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acqDate);
        setAcquisitionLocation(acqCountry);
        setTrainingStatus(ts);
        setReserved(res);
        setInServiceCountry(isc);
    }

    //getter methods that return variable value
    public String getBodyLength()
    {
        return bodyLength;
    }
    public String getTailLength()
    {
        return tailLength;
    }
    public String getHeight()
    {
        return height;
    }
    public String getSpecies()
    {
        return species;
    }

    //setter methods that set variable value
    public void setBodyLength(String bodyLength)
    {
        //sets body length
        this.bodyLength = bodyLength;
    }
    public void setTailLength(String tailLength)
    {
        //sets tail length
        this.tailLength = tailLength;
    }
    public void setHeight(String height)
    {
        //sets height
        this.height = height;
    }
    public void setSpecies(String species)
    {
        //sets species
        this.species = species;
    }
}