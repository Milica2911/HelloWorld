
public class Car {
    
    int maxSpeed = 180;
    double weight = 1340.43;
    boolean isTheCarOn = false;
    String model = "Audi";
    
    double maxFuel = 100;
    double currentFuel = 50;
    int consumption = 5; // per 100 km 
    double mileagePassed = 2000;
    
    
    public void printVariables() {
        System.out.println("Maksimalna brzina: " + maxSpeed);
        System.out.println("Tezina: " + weight);
        System.out.println("Da li su kola upaljena: " + isTheCarOn);
        System.out.println("Model: " + model);
        System.out.println("Zapremina rezervoara: " + maxFuel);
        System.out.println("Trenutno goriva u rezervoaru: " + currentFuel);
        System.out.println("Potrosnja: " + consumption);
        System.out.println("Broj predjenih km: " + mileagePassed);
        
    
    }
    
}
