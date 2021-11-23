package champollion;

public class UE {
    private final String myIntitule;
    public int heuresCM;
    public int heuresTD;
    public int heuresTP;

    //constructeur n°1
    public UE(String intitule) {
        myIntitule = intitule;
    }

    //constructeur n°2
    public UE(String myIntitule, int heuresCM, int heuresTD, int heuresTP) {
        this.myIntitule = myIntitule;
        this.heuresCM = heuresCM;
        this.heuresTD = heuresTD;
        this.heuresTP = heuresTP;
    }
    

    public String getIntitule() {
        return myIntitule;
    }

    
}
