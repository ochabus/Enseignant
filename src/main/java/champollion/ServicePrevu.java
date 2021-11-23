package champollion;

public class ServicePrevu {
    private UE myUE;
    private Enseignant myTeacher;
            
	// TODO : implémenter cette classe
    public int volumeCM;
    public int volumeTD;
    public int volumeTP;

    //constructeur n°1
    public ServicePrevu(int volumeCM, int volumeTD, int volumeTP) {
        this.volumeCM = volumeCM;
        this.volumeTD = volumeTD;
        this.volumeTP = volumeTP;
    }
//constructeur n°2
    public ServicePrevu(UE myUE, Enseignant myTeacher) {
        this.myUE = myUE;
        this.myTeacher = myTeacher;
    }

    public UE getMyUE() {
        return myUE;
    }

    public Enseignant getMyTeacher() {
        return myTeacher;
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
    
    
      
}
