import java.util.ArrayList;
import java.util.List;

public class Users {
    private int id;
    private String firstName;
    private String lastName;
    private int moneyAmount;


    public Users(String firstName, String lastName, int moneyAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.moneyAmount = moneyAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String toString() {
        return "User {" + "id = " + getId() + " " +
                "First name = " + getFirstName() + " " +
                "Last name = " + getLastName() + " " +
                "Amount of money = " + getMoneyAmount() +
                "}";
    }
}
