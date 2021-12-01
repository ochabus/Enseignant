package champollion;

public class UE {

    private final String myIntitule;
    public int heuresCM;
    public int heuresTD;
    public int heuresTP;

    //constructeur n°1
    public UE(String myIntitule) {
        this.myIntitule = myIntitule;
    }

    public String getMyIntitule() {
        return myIntitule;
    }

    public int getHeuresCM() {
        return heuresCM;
    }

    public int getHeuresTD() {
        return heuresTD;
    }

    public int getHeuresTP() {
        return heuresTP;
    }

}
