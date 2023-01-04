//creating class
class RescueAnimal
{
    //declaring variables
    private String name;
    private String animalType;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionCountry;
    private String trainingStatus;
    private boolean reserved;
    private String inServiceCountry;

    //default constructor
    public RescueAnimal()
    {
    }

    //getter & setter methods returns sets the values
//gets name
    public String getName()
    {
        return name;
    }
    //sets name
    public void setName(String name)
    {
        this.name = name;
    }
    //gets type
    public String getAnimalType()
    {
        return animalType;
    }
    //sets type
    public void setAnimalType(String animalType)
    {
        this.animalType = animalType;
    }
    //gets gender
    public String getGender()
    {
        return gender;
    }
    //sets gender
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    //gets age
    public String getAge()
    {
        return age;
    }
    //sets age
    public void setAge(String age)
    {
        this.age = age;
    }
    //gets weight
    public String getWeight()
    {
        return weight;
    }
    //sets weight
    public void setWeight(String weight)
    {
        this.weight = weight;
    }
    //gets date
    public String getAcquisitionDate()
    {
        return acquisitionDate;
    }
    //sets date
    public void setAcquisitionDate(String acquisitionDate)
    {
        this.acquisitionDate = acquisitionDate;
    }
    //gets location
    public String getAcquisitionLocation()
    {
        return acquisitionCountry;
    }
    //set location
    public void setAcquisitionLocation(String acquisitionCountry)
    {
        this.acquisitionCountry = acquisitionCountry;
    }
    //gets reservation status
    public boolean getReserved()
    {
        return reserved;
    }
    //sets reservation status
    public void setReserved(boolean reserved)
    {
        this.reserved = reserved;
    }
    //gets service location
    public String getInServiceLocation()
    {
        return inServiceCountry;
    }
    //sets service location
    public void setInServiceCountry(String inServiceCountry)
    {
        this.inServiceCountry = inServiceCountry;
    }
    //gets training status
    public String getTrainingStatus()
    {
        return trainingStatus;
    }
    //sets training status
    public void setTrainingStatus(String trainingStatus)
    {
        this.trainingStatus = trainingStatus;
    }
}