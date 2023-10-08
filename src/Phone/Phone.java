package Phone;

public class Phone {
    private int id;
    private String lastName;
    private String name;
    private String patronymic;
    private int accountNumber;
    private double timeForTownCalls;
    private double longDistanceCallTime;

    public Phone(int id, String lastName, String name, String patronymic,
                 int accountNumber, double timeForTownCalls, double longDistanceCallTime) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.accountNumber = accountNumber;
        this.timeForTownCalls = timeForTownCalls;
        this.longDistanceCallTime = longDistanceCallTime;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getTimeForTownCalls() {
        return timeForTownCalls;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setTimeForTownCalls(double timeForTownCalls) {
        this.timeForTownCalls = timeForTownCalls;
    }

    public void setLongDistanceCallTime(double longDistanceCallTime) {
        this.longDistanceCallTime = longDistanceCallTime;
    }

    public double getLongDistanceCallTime() {
        return longDistanceCallTime;
    }

    public String toString() {
        return "Id - " + getId()
                + "\nПрізвище - " + getLastName()
                + "\nІм'я - " + getName()
                + "\nПо батькові - " + getPatronymic()
                + "\nНомер рахунку - " + getAccountNumber()
                + "\nЧас міських розмов - " + getTimeForTownCalls()
                + "\nЧас міжміських розмов - " + getLongDistanceCallTime();
    }
}
