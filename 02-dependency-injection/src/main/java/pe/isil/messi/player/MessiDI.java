package pe.isil.messi.player;

import pe.isil.messi.team.ITeam;

public class MessiDI {

    private ITeam team;

    public MessiDI() {
    }

    //inyeccion de dependencias por constructor
    public MessiDI(ITeam team) {
        this.team = team;
    }

    //inyeccion de dependencias por setter
    public void setTeam(ITeam team) {
        this.team = team;
    }

    public void showClubName(){

        team.showClubName();

    }

}
