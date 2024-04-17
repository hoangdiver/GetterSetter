package advance.dev;

public class student {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private double averageScore;

    // Constructor
    public student(String name, int age, String address, String phoneNumber, double averageScore) {
        this.name = name;
        this.setAge(age);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.setAverageScore(averageScore);
    }

    // Getter và Setter cho name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter và Setter cho age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Tuổi phải là số nguyên lớn hơn 0.");
        }
    }

    // Getter và Setter cho address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter và Setter cho phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter và Setter cho averageScore
    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        if (averageScore >= 0) {
            this.averageScore = averageScore;
        } else {
            System.out.println("Điểm trung bình phải là số thực lớn hơn hoặc bằng 0.");
        }
    }
}

