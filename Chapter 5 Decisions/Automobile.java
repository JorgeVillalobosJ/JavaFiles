// Filename Automobile.java
// Written by <Jorge Villalobos>


public class Automobile {
    private int ID;
    private String Make;
    private String Model;
    private String Color;
    private int Year;
    private int VinNumber;
    private int MilesPerGallon;
    private int Speed;

    public Automobile(int ID, String Make, String Model, String Color, int Year, int VinNumber, int MilesPerGallon) {
        setID(ID);
        setMake(Make);
        setModel(Model);
        setColor(Color);
        setYear(Year);
        setVinNumber(VinNumber);
        setMilesPerGallon(MilesPerGallon);
        this.Speed = 0;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        if (ID >= 0 & ID <= 9999) {
            this.ID = ID;
        } else {
            this.ID = 0;
        }
    }
      public String getMake() {
        return Make;
    }
    public void setMake(String setMake) {
        Make = setMake;
    }
    public String getModel() {
        return Model;
    }
    public void setModel(String setModel) {
        Model = setModel;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String setColor) {
        Color = setColor;
    }
    public int getYear() {
        return Year;
    }
    public void setYear(int setYear) {
        if (setYear >=2000 && setYear<= 2017) {
            Year = setYear;
        } else {
            Year = 0;
        }
    }
    public int getVinNumber() {
        return VinNumber;
    }
    public void setVinNumber(int VinNumber){
        VinNumber = getVinNumber();
    }
    public int MilesPerGallon() {
        return MilesPerGallon;
    }
    public void setMilesPerGallon(int setMilesPerGallon) {
        if (setMilesPerGallon >= 10 && setMilesPerGallon <= 60) {
            MilesPerGallon = setMilesPerGallon;
        } else {
            MilesPerGallon = 0;
        }
    }
    public int getSpeed() {
        return Speed;
    }
    public void setSpeed(int setSpeed) {
        Speed = setSpeed;
    }

    public void displayAutomobile() {
        System.out.println("ID Number: " + ID + "Make: " + Make + "Model: " + Model + "Color: " + Color + "Year: " + Year + "VIN: " + VinNumber + "MPG: " + MilesPerGallon + "Current Speed: " + Speed);
    }

    public void accelerate(int x) {
        x += 5;
        System.out.println(Make + " " + Model + " speed is now " + x + "miles per gallon");
    }
    public void accelerate(double x) {
        x += 5;
        System.out.println(Make + " " + Model + " speed is now " + x + "miles per gallon");
    }
    public void brake(int x) {
        x -= 5;
        if (x < 0) {
            Speed = 0;
        }
        System.out.println(Make + " " + Model + " speed is now " + x + "miles per gallon");
    }
    public void brake(double x) {
        x -= 5;
        if (x < 0) {
            Speed = 0;
        }
        System.out.println(Make + " " + Model + " speed is now " + x + "miles per gallon");
    }
}