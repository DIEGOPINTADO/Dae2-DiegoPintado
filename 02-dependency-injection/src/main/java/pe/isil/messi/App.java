package pe.isil.messi;

import pe.isil.messi.player.MessiDI;
import pe.isil.messi.team.Barcelona;
import pe.isil.messi.team.Juventus;
import pe.isil.messi.team.Manchester;

public class App {

    public static void main(String[] args) {

//        Messi messi = new Messi();
//        messi.showClubName();

        //Inyección de dependencias por constructor
        MessiDI messiDI = new MessiDI(new Barcelona());

        //Inyección de depedencias por Setter
//        messiDI.setTeam(new Juventus());
        messiDI.showClubName();

    }

}
