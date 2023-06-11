/*
bai1:

public class Rectangle {
    private int length;
    private int width;
    
    public Rectangle() {
        // Constructor without arguments
    }
    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getLength() {
        return this.length;
    }
    
    public int getWidth() {
        return this.width;
    }
public class Square extends Rectangle {
    private String unit;
    
    public Square(int side) {
        super(side, side); // Gọi constructor của lớp Rectangle để đặt giá trị cho length và width
        this.unit = "cm";
    }
    
    public void setSquare(int side) {
        if (side > 0) {
            setLength(side);
            setWidth(side);
        }
    }
    
    public int getPerimeter() {
        return (getLength() + getWidth()) * 2;
    }
    
    public void output() {
        System.out.println("The side of the square = " + getLength() + "(" + unit + ")");
        System.out.println("The perimeter of the square = " + getPerimeter() + "(" + unit + ")");
    }
}
///////////////////////////////////////////
Bai 2 
import java.util.ArrayList;

public class TaskList extends ArrayList<String> implements ITask {

    public void addTask(String task) {
        this.add(task);
    }

    public double getWorkingHours(String place) {
        double totalWorkingHours = 0.0;
        for (String task : this) {
            String[] taskInfo = task.split("@");
            String taskPlace = taskInfo[1].trim().toLowerCase();
            if (taskPlace.equals("hcm")) {
                totalWorkingHours += 5.0;
            } else {
                totalWorkingHours += 2.0;
            }
        }
        return totalWorkingHours;
    }

    public String getTaskName(String place) {
        StringBuilder taskNames = new StringBuilder();
        for (String task : this) {
            String[] taskInfo = task.split("@");
            String taskPlace = taskInfo[1].trim().toLowerCase();
            if (taskPlace.equals(place.toLowerCase())) {
                taskNames.append(taskInfo[0].trim() + ";");
            }
        }
        // Remove the last semicolon
        taskNames.deleteCharAt(taskNames.length() - 1);
        return taskNames.toString();
    }
}
//////////////////////////////////////////////
bài3:

// Factory.java
public abstract class Factory {
    protected String type;
    protected String dataSource;
    
    public Factory() {
        this.type = "";
        this.dataSource = "";
    }
    
    public Factory(String type, String dataSource) {
        this.type = type;
        this.dataSource = dataSource;
    }
    
    public String getType() {
        return type;
    }
    
    public String getDataSource() {
        return dataSource;
    }
    
    public abstract void readData();
    
    public abstract String writeData();
}

// IConnect.java
public interface IConnect {
    boolean makeConnection();
}

// WorldData.java
public class WorldData extends Factory implements IConnect {
    private String content;
    
    public WorldData(String type, String dataSource) {
        super(type, dataSource);
        this.content = "this is a string";
    }
    
    @Override
    public boolean makeConnection() {
        return dataSource.contains("localhost:8080");
    }
    
    @Override
    public void readData() {
        if (type.endsWith(".doc")) {
            content = "humpty dumpty sat on the wall";
        }
    }
    
    @Override
    public String writeData() {
        String[] words = content.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
              .append(word.substring(1))
              .append(" ");
        }
        return sb.toString().trim();
    }
}
/////////////////////////////////////////////////////
bai4
import java.util.ArrayList;

public class Service {
    private String name;
    private int price;
    
    public Service(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }
}

public interface ITax {
    public final double VAT = 0.1;
    
    public double getTax();
    public double getTotalMoney();
}

public class Pet implements ITax {
    private String name;
    private String birthday;
    private ArrayList<Service> usedServices;
    
    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        usedServices = new ArrayList<Service>();
    }
    
    public void addService(String nameService, int price) {
        Service service = new Service(nameService, price);
        usedServices.add(service);
    }
    
    public double getTotalMoney() {
        double totalMoney = 0.0;
        for (Service service : usedServices) {
            totalMoney += service.getPrice();
        }
        
        // check if pet's birthday is in Q4
        String[] birthdayArr = birthday.split("-");
        int month = Integer.parseInt(birthdayArr[1]);
        if (month >= 10 || month <= 12) {
            totalMoney *= 0.95; // 5% discount
        }
        
        return totalMoney;
    }
    
    public double getTax() {
        double totalMoney = getTotalMoney();
        return totalMoney * ITax.VAT;
    }
    
    @Override
    public String toString() {
        double totalMoney = getTotalMoney();
        double tax = getTax();
        double totalPrice = totalMoney + tax;
        return name + "-" + totalPrice + "-" + tax;
    }
}







}

//////////////////////////////////////////////////////////////////////////////////
1,
Rectangle

length: int
width:int 

+Rectangle()
+Rectangle(length:int,width:int)
+setLenghth(length:int):void
+setWidth(width:int):void
+getLength():int
+getWidth():int
Write a class Square that extends the Rectangle class(in the default package) width the following information:

Square

-unit: String

+Square(side:int)
+setSquare(side:int):void
+getPerimeter():int
+output():void
where: 
Square(side) assign the given side to two fields (length , width),assign the default value is ‘cm’ to the unit field
setSquare(side) if the given side is the positive number then assign it to the length , width fields
getPerimeter() : return the perimeter of the square
output() : display the content with format
the side of the square = length(unit)
the perimeter of the square = (length + width ) *2(unit)

2,
The interface ITask below is already compiled and given in byte code format , thus you can use it without creating Itask.java.file
public interface ITask{
	public double getWorkingHours(String place);
	public String getTaskName(String place);
}
Write a class named TaskList extends ArrayList<String>, and implements the interface ITask. The class TaskList implements method in the ITask as below 👍
	TaskList
+addTask(task String):void

where : 
addTask : add the given parameter to this class.
getWorkingHours(String place): return total of working hours of all tasks at the given place. if the place equals “HCM” or “hcm” then working hour = 5 on each task, otherwise working hour = 2;
Assume that, task list = {“fix bugs@at HCM”,”test module A@hcm city”,”delivery module B@dn”} and the given place is “hcm”, this function return 10.0
getTaskName(String place) return task names, which are performed at the given parameter.Assume that,  task list = {“fix bugs@at HCM”,”test module A@hcm city”,”delivery module B@dn”} and the given place is “hcm” , this function return “fix bugs;test module A;”
Note: use the symbol”@” to delimit task name and the place of the task 

3,Where:
Write an abstract class named “Factory” and an interface “IConnect” (in the default package)

<<abstract>>
   Factory
-type:String
-dataSource:String

+Factory() /*default values are empty string*/
//+Factory(type:String,dataSource:String)
//+ getType():String /*getter*/
//+getDataSource():String /*getter*/
//+readData():void,abstract
//+writeData:String,abstract
//
//<<interface>>
//Iconnect
//makeConnection():boolean,abstract
//write an class named WorldData that extends Factory and implements IConnects(in the default package) with the following information:
//	WorldData
//-content:String 
//+WordData:(typeString,dataSource:String)
//
//Where:
//+WordData:(typeString,dataSource:String) : init two fields (type and dataSource) by the given parameters, assign “this is a string” to the content field.
//+ make Connection():return true if the dataSource field contains a substring “localhost:8080”,otherwise return false 
//+ readData(): if the type field contains’.doc’ at the end of it , then assign “humpty dumpty sat on the wall” to the content field.
//+WriteDta(): to capitalize a first letter of each world in the content field and return the result string . For example: assume that the content is “humpty dumpty sat on the wall”, this method will return “Humpty Dumpty Sat On The Wall”
//4,
//Write a class Service in the default package with the following information:
//	Service
//-name:String
//-price:int
//+Service(name String, price:int)
//+getName():String
//+getPrice():int
//+setPrice(price int) : void
//where:
//getName():String-return name
//setPrice():int - return price
//setPrice:void - if the given price is the positive number then update the price field otherwise not update.
//
//The interface Itax below is already complied and given in byte in byte code format , thus you can use it without creating ITax,java,file
//
//public interface ITax{
//public final double VAT = 0.1;
//public double getTax();
//public double getTotalMoney();
//}
//
//Pet
//-name:String
//-birthday:String
//-useServices:ArrayList<Service>list
//
//+Pet(name:String, birthday:String)
//+addService(nameService:String,price:int):void
//+toString():override, String
//
//Where:
//usedServices: tracking services is used of the pet. name: pet’s name, birthday: the pet’s birthday
//Pet(name:String, birthday :String): assign the given parameters to the name, birthday fields and allocate the memory for the usedServices fields
//addService: to create a new service from the given parameters, and add it to the usedServices list .
//tostring() : return the String with format: name-total money-tax . for example: dog-100.0-10.0
//
//
//method in the ITax as below (you can add other function in Pet class if any):
//getTotalMoney:to return the paid total money of the usedServices fields.If the pet’s birthday belong to the quarter 4 then discount 5% of the total money
//getTax():return ther tax value.Tax value + Vat*paid total money
//
//










*/
