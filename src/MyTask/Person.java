package MyTask;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String lastName;
    private String firstName;
    private String gender;
    private int age;

    @Override
    public String toString() {
        return lastName + "," + firstName + "," + gender + "," + age + "\n";
    }

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.gender = "";
        this.age = 0;
    }

    public Person(String lastName, String firstName, String gender, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void parseFromString(String str) {
        String[] myFields = str.split(",");
        lastName = myFields[0];
        firstName = myFields[1];
        gender = myFields[2];
        age = Integer.parseInt(myFields[3]);
    }

    @Override
    public int compareTo(Person o) {
        int res = lastName.compareTo(o.getLastName());
        if (res == 0)
            return firstName.compareTo(o.getFirstName());
        return res;
    }

}

