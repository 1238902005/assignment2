package organizations.party;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;

import java.util.ArrayList;
import java.util.List;

public class Party extends Organization implements Contactable {
    private String email;
    private String address;
    private String phoneNumber;
    private final List<Election> elections;

    public Party(String name, String mission) {
        super();
        this.elections = new ArrayList<>();
    }

    public void addElection(Election e) {
        elections.add(e);
    }

    public boolean removeElection(Election e) {
        return elections.remove(e);
    }

    public List<Election> getFairElections() {
        List<Election> fairElections = new ArrayList<>();
        for (Election e : elections) {
            if (e.isFair()) {
                fairElections.add(e);
            }
        }
        return fairElections;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

