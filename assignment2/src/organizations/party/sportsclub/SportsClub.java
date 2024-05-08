package organizations.party.sportsclub;

import assignment2.commons.Organization;

public class SportsClub extends Organization {
    private String sportType;
    private int numberOfTeams;

    public SportsClub(String name, String sportType) {
        super();
        this.sportType = sportType;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    public void setNumberOfTeams(int numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
    }


}
