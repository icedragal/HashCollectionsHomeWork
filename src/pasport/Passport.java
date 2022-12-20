package pasport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private String number;
    private String name;
    private String surname;
    private String patronymicName;
    private LocalDate birthDay;

    public Passport(String number, String name, String surname, String patronymicName, LocalDate birthDay) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.patronymicName = patronymicName;
        this.birthDay = birthDay;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return number + " " + name + " " + surname + " " + patronymicName + " " + birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
