// Filename Automobile.java
// Written by <Jorge Villalobos>
// Written on <11/18/2023

public class Automobile {
    private int ID;
    private String Make;
    private String Model;
    private String Color;
    private int Year;
    private String VinNumber;
    private int MilesPerGallon;
    private int Speed;

    public Automobile(int ID, String Make, String Model, String Color, int Year, String VinNumber, int MilesPerGallon) {
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
    public void setYear(int Year) {
        if (Year >= 2000 & Year <= 2017) {
            this.Year = Year;
        } else {
            this.Year = 0;
        }
    }
    public void setMilesPerGallon(int MilesPerGallon) {
        if (MilesPerGallon >= 10 & MilesPerGallon <= 60) {
            this.MilesPerGallon = MilesPerGallon;
        } else {
            this.MilesPerGallon = 0;
        }
    }
    public void Accelerate() {
        Speed += 5;
    }
    public void Accelerate(int increase) {
        Speed = increase;
    }
    public void Brake() {
        Speed -= 5;
        if (Speed < 0) {
        }else{
            this.Speed = 0;
        }
    }
}