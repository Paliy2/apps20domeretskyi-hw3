package ua.edu.ucu;


class Student {

    private double GPA;
    private int year;
    private String name;
    private String surname;

    public Student(String name, String surname, double GPA, int year) {
        this.GPA = GPA;
        this.year = year;
        this.name = name;
        this.surname = surname;
    }

    public double getGPA() {
        return GPA;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{name=" + name + ", surname="
                + surname + ", " + "GPA=" + GPA + ", year=" + year + '}';
    }

    @Override
    public int hashCode() {
        return (int) GPA + 31 * year + 127 * name.hashCode()
                + 255 * surname.hashCode();
    }

    @Override
    public boolean equals(Object fictiveStudent) {
        if (!(fictiveStudent instanceof Student)) {
            return false;
        }

        Student normalizedStudent = (Student) fictiveStudent;

        return this.GPA == normalizedStudent.GPA
                && this.year == normalizedStudent.year
                && this.name.equals(normalizedStudent.name)
                && this.surname.equals(normalizedStudent.surname);

    }
}
