import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class BoardingPass  {
    //Imported values
    private String name;
    private String email;
    private String destination;
    private String gender;
    private String departureTime;
    private String date;
    private String origin;
    private int phoneNumber;
    private int age;
    //Calculated values
    private String ETA ;//TODO, set via main program, otherwise default is 7 hours
    private String boardingPassNumber; //TODO needs to set from in main program
    private double price; //Random price between  120 and 1000.




    BoardingPass() {
        getData();
        System.out.println("Name is: " + name);
        System.out.println("Email is: " + email);
        System.out.println("Destination is: " + destination);
        System.out.println("Gender is: " + gender);
        System.out.println("Departure time is: " + departureTime);
        System.out.println("Date is: " + date);
        System.out.println("Origin: " + origin);
        System.out.println("Phone number is: " + phoneNumber);
        System.out.println("Age is: " + age);

        setETA("19:00");

    }

    public void getData() {
        //Text file is filled out by gui, [name, email, phone number, gender, age, date, origin, destination, and departure time]
        ArrayList<Object> output=new ArrayList<Object>();

        try {
            File dataFile = new File("C:\\Users\\Gabrielle\\Dropbox\\Genspark\\Java\\genspark-java-core\\Group_BoardingPass\\src\\Passenger.txt");
            Scanner reader = new Scanner(dataFile);
            String data="";
            int number =1;
            while (reader.hasNextLine()) {
                data= reader.nextLine();
                //System.out.println(data);
            }
            data=data.substring(1, data.length()-1);
            //System.out.println(data);
            reader.close();

            List<String> splitData = Arrays.asList(data.split(", "));
            //System.out.println(splitData);

            //[name, email, phone number, gender, age, date, origin, destination, and departure time]
            name=splitData.get(0);//0 1 2 3 4 5 6 7 8
            email=splitData.get(1);
            phoneNumber= Integer.parseInt(splitData.get(2));
            gender=splitData.get(3);
            age=Integer.parseInt(splitData.get(4));
            date=splitData.get(5);
            origin=splitData.get(6);
            destination=splitData.get(7);
            departureTime=splitData.get(8);

        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) { this.gender = gender; }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getETA() {
        return ETA;
    }

    public void setETA(String ETA)
    {
        //String [] Continents = ["Asia","Africa","Europe", "North America", "South America", "Australia/Oceania", "Antarctica"];
        this.ETA = ETA;
    }

    public String getBoardingPassNumber() {
        return boardingPassNumber;
    }

    public void setBoardingPassNumber(String boardingPassNumber) {
        this.boardingPassNumber = boardingPassNumber;
    }

    public double getPrice() {
        if(this.age <= 12)
            this.price= price*.50;
        else if(this.age >= 60)
            this.price= price*.60;
        else if(this.gender.equals("Female"))
            this.price= price*.75;

        return price;
    }

    public void setPrice(double price) {
            int min = 120;
            int max = 1000;
            int ticketPrice = (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}