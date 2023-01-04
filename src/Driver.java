//invoking the package to create the array list for class objects
import java.util.ArrayList;

//package will get the input
import java.util.Scanner;

//creating the driver class
public class Driver
{
    //Naming & Initializing the array list
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    //using displayMenu method to display menu and get choice form user
    //executing the necessary functions
    public static void displayMenu()
    {
        System.out.println("\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();

        //get user menu choice
        System.out.println("Enter a menu selection");
        Scanner sc=new Scanner(System.in);

        //get user input as character variable
        char input=sc.nextLine().charAt(0);
        switch(input)
        {
            case '1':
                intakeNewDog(sc);
                break;
            case '2':
                intakeNewMonkey(sc);
                break;
            case '3':
                reserveAnimal(sc);
                break;
            case '4':
                printAnimals('4');
                break;
            case '5':
                printAnimals('5');
                break;
            case '6':
                printAnimals('6');
            case 'q':
                System.exit(0);
            default:
                System.out.println("Select an existing menu");
                displayMenu();
        }
    }

    //method initializes the array list(dogList)
    public static void initializeDogList()
    {
        Dog dog1 = new Dog("Zeus", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Benji", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }
    //method initializes the array list(monkeyList)
    public static void initializeMonkeyList()
    {
        Monkey monkey1 = new Monkey("Bolt", "Capuchin", "5.2", "9.4", "19.6", "male", "2", "15.3", "07-01-2018", "Australia", "Phase I", true, "Australia");
        Monkey monkey2 = new Monkey("Popeye", "Macaque", "4.8", "10.2", "20.7", "male", "1", "17.4", "12-05-2010", "United Kingdom", "in service", false, "United Kingdom");
        Monkey monkey3 = new Monkey("Jake", "Tamarin", "5.5", "8.6", "18.4", "male", "3", "18.2", "12-10-2016", "United States", "intake", false, "United States");
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }
    //method gets input from the user, validates the input, initializes to dogList
    public static void intakeNewDog(Scanner scanner)
    {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList)
        {
            if(dog.getName().equalsIgnoreCase(name))
            {
                System.out.println("\n\nThis dog is already in our system\n\n");
                displayMenu();
            }
        }
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the dog's acquisition date?");
        String acqDate = scanner.nextLine();
        System.out.println("What is the dog's acquisition country?");
        String acqCountry = scanner.nextLine();
        //get status
        System.out.println("What is the dog's training status?");
        String ts = scanner.nextLine();
        //get the reserved status
        System.out.println("Is the dog reserved?");
        //get it as boolean value
        boolean res = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("What is the dog's in Service Country?");
        String isc = scanner.nextLine();
        Dog newdog = new Dog(name,breed,gender,age,weight,acqDate,acqCountry,ts,res,isc);
        dogList.add(newdog);
        displayMenu();
    }

    //method gets input from the user, validates the input, initializes to monkeyList
    public static void intakeNewMonkey(Scanner scanner)
    {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for(Monkey monkey: monkeyList)
        {
            if(monkey.getName().equalsIgnoreCase(name))
            {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                displayMenu();
            }
        }
        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine();
        if(!(species.equalsIgnoreCase("Capuchin")) && !(species.equalsIgnoreCase("Guenon")) && !(species.equalsIgnoreCase("Macaque")) && !(species.equalsIgnoreCase("Marmoset")) && !(species.equalsIgnoreCase("Squirrel Monkey")) && !(species.equalsIgnoreCase("Tamarin"))){
            System.out.println("\n\nThis monkey's species is not allowed\n\n");
            return;
        }
        System.out.println("What is the monkey's tail length?");
        String tailLength = scanner.nextLine();
        System.out.println("What is the monkey's height?");
        String height = scanner.nextLine();
        //get body length
        System.out.println("What is the monkey's body length?");
        //get it as string
        String bodyLength = scanner.nextLine();
        //get gender
        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();
        //get age
        System.out.println("What is the monkey's age?");
        //get it as string
        String age = scanner.nextLine();
        //get weight
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();
        //get date
        System.out.println("What is the monkey's acquisition date?");
        String acqDate = scanner.nextLine();
        //get country
        System.out.println("What is the monkey's acquisition country?");
        String acqCountry = scanner.nextLine();
        //get status
        System.out.println("What is the monkey's training status?");
        String ts = scanner.nextLine();
        //get reservation status
        System.out.println("Is the monkey reserved?");
        boolean res = scanner.nextBoolean();scanner.nextLine();
        //get service country
        System.out.println("What is the monkey's in Service Country?");
        String isc = scanner.nextLine();
        Monkey newmonkey=new Monkey(name,species,tailLength,height,bodyLength,gender,age,weight,acqDate,acqCountry,ts,res,isc);
        monkeyList.add(newmonkey);
        displayMenu();
    }

    //method gets input from user, checks availability, sets it to reserve
    public static void reserveAnimal(Scanner scanner)
    {
        System.out.println("Enter animal type");
        String animalType=scanner.next();
        System.out.println("Enter In Service Country");
        String isc=scanner.next();
        if(animalType.equalsIgnoreCase("Dog"))
        {
            for(int i=0;i<dogList.size();i++)
            {
                if(dogList.get(i).getInServiceLocation().equals(isc))
                {
                    dogList.get(i).setReserved(true);
                    break;
                }
            }
            displayMenu();
        }
        else if(animalType.equalsIgnoreCase("Monkey"))
        {
            for(int i=0;i<monkeyList.size();i++)
            {
                if(monkeyList.get(i).getInServiceLocation().equals(isc))
                {
                    monkeyList.get(i).setReserved(true);
                    break;
                }
            }
            displayMenu();
        }
        else
        {
            System.out.println("Given animal type is not exist");
            System.out.println("Existing animal type are Dog and Monkey");
            displayMenu();
        }
    }

    //method prints list of available animals
    //based on user choice, the list of animals is displayed
    public static void printAnimals(char choice)
    {
        if(choice=='4')
        {
            System.out.println("Name\tTraining_Status In_Service_Location Is_Reserved");
            for(int i=0;i<dogList.size();i++)
            {
                System.out.println(dogList.get(i).getName()+"\t"+dogList.get(i).getTrainingStatus()+"\t\t"+dogList.get(i).getInServiceLocation()+"\t "+dogList.get(i).getReserved());
            }
            displayMenu();
        }
        else if(choice=='5')
        {
            System.out.println("Name\tTraining_Status In_Service_Location Is_Reserved");
            for(int i=0;i<monkeyList.size();i++)
            {
                System.out.println(monkeyList.get(i).getName()+"\t"+monkeyList.get(i).getTrainingStatus()+"\t\t"+monkeyList.get(i).getInServiceLocation()+"\t "+monkeyList.get(i).getReserved());
            }
            displayMenu();
        }
        else if(choice=='6')
        {
            System.out.println("Name\tTraining_Status In_Service_Location Is_Reserved");
            for(int i=0;i<dogList.size();i++)
            {
                if(!dogList.get(i).getInServiceLocation().isEmpty()&&!dogList.get(i).getReserved())
                {
                    System.out.println(dogList.get(i).getName()+"\t"+dogList.get(i).getTrainingStatus()+"\t\t"+dogList.get(i).getInServiceLocation()+"\t "+dogList.get(i).getReserved());
                }
            }
            for(int i=0;i<monkeyList.size();i++)
            {
                if(!monkeyList.get(i).getInServiceLocation().isEmpty()&&!monkeyList.get(i).getReserved())
                {
                    System.out.println(monkeyList.get(i).getName()+"\t"+monkeyList.get(i).getTrainingStatus()+"\t\t"+monkeyList.get(i).getInServiceLocation()+"\t "+monkeyList.get(i).getReserved());
                }
            }
            displayMenu();
        }
    }

    //main methods initialize the class members
    public static void main(String[] args)
    {
        initializeDogList();
        initializeMonkeyList();
        displayMenu();
    }
}