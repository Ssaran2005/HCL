class Student {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Setter methods (to set values)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods (to get values)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class encap {
    public static void main(String[] args) {
        Student s = new Student();

        // Setting values using setter
        s.setName("Saran");
        s.setAge(20);

        // Getting values using getter
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
