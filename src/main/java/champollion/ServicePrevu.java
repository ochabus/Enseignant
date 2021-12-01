package champollion;

public class ServicePrevu {

    public int volumeCM;
    public int volumeTD;
    public int volumeTP;
    private Enseignant enseignant;
    private UE ue;

    //constructeur n°1
    public ServicePrevu(int volumeCM, int volumeTD, int volumeTP, Enseignant enseignant, UE ue) {
        this.volumeCM = volumeCM;
        this.volumeTD = volumeTD;
        this.volumeTP = volumeTP;
        this.enseignant = enseignant;
        this.ue = ue;
    }

    public int getVolumeCM() {
        return volumeCM;
    }

    public int getVolumeTD() {
        return volumeTD;
    }

    public int getVolumeTP() {
        return volumeTP;
    }

    public UE getUe() {
        return ue;
    }

}
