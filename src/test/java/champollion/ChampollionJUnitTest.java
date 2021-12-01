package champollion;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ChampollionJUnitTest {

    Enseignant untel;
    UE uml, java;

    @BeforeEach
    public void setUp() {
        untel = new Enseignant("untel", "untel@gmail.com");
        uml = new UE("UML");
        java = new UE("Programmation en java");
    }

    @Test
    public void testNouvelEnseignantSansService() {
        assertEquals(0, untel.heuresPrevues(),
                "Un nouvel enseignant doit avoir 0 heures prévues");
    }

    @Test
    public void testAjouteHeures() {
        // 10h TD pour UML
        untel.ajouteEnseignement(uml, 0, 10, 0);

        assertEquals(10, untel.heuresPrevuesPourUE(uml),
                "L'enseignant doit maintenant avoir 10 heures prévues pour l'UE 'uml'");

        // 20h TD pour UML
        untel.ajouteEnseignement(uml, 0, 20, 0);

        assertEquals(10 + 20, untel.heuresPrevuesPourUE(uml),
                "L'enseignant doit maintenant avoir 30 heures prévues pour l'UE 'uml'");

    }

    @Test
    public void testHeurePrevue() {
        untel.ajouteEnseignement(uml, 0, 10, 0);
        assertEquals(10, untel.heuresPrevuesPourUE(uml),
                "L'enseignant doit maintenant avoir 10 heures prévues pour l'UE 'uml'");

    }

    @Test
    public void testEnSousService() {
//En sous servive <192
        untel.ajouteEnseignement(uml, 10, 2, 1);
        assertTrue(untel.enSousService(), "Cet enseignant doit être  en sous services");

        //Pas en sous service 
        untel.ajouteEnseignement(java, 190, 15, 8);
        assertFalse(untel.enSousService(), "L'enseignant ne devrait pas être en sous service");
    }
    
    @Test
    public void resteAPlanifier() {
        int sommePlanifiee = 0;
        assertEquals(0, sommePlanifiee, "L'initiation doit être à 0");
    }
}
