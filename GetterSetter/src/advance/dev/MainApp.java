package advance.dev;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    static Scanner scanner = new Scanner(System.in);

    // Phương thức nhập thông tin của sinh viên
    static student [] input() {
        student[] students = new student[10];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            System.out.print("Tên: ");
            String name = scanner.nextLine();
            System.out.print("Tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng newline
            System.out.print("Địa chỉ: ");
            String address = scanner.nextLine();
            System.out.print("Số điện thoại: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Điểm trung bình: ");
            double averageScore = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ dòng newline

            students[i] = new student(name, age, address, phoneNumber, averageScore);
        }
        return students;
    }

    // Phương thức in thông tin của sinh viên
    static void print(student[] students) {
        System.out.println("Danh sách sinh viên:");
        for (student student : students) {
            System.out.println("Tên: " + student.getName());
            System.out.println("Tuổi: " + student.getAge());
            System.out.println("Địa chỉ: " + student.getAddress());
            System.out.println("Số điện thoại: " + student.getPhoneNumber());
            System.out.println("Điểm trung bình: " + student.getAverageScore());
            System.out.println();
        }
    }

    // Phương thức sắp xếp mảng sinh viên theo thứ tự điểm trung bình tăng dần
    static void sortStudentsByAverageScore(student[] students) {
        Arrays.sort(students, (s1, s2) -> Double.compare(s1.getAverageScore(), s2.getAverageScore()));
    }

    public static void main(String[] args) {
        // Nhập thông tin sinh viên
        student[] students = input();

        // In thông tin sinh viên trước khi sắp xếp
        System.out.println("Danh sách sinh viên trước khi sắp xếp:");
        print(students);

        // Sắp xếp sinh viên theo thứ tự điểm trung bình tăng dần
        sortStudentsByAverageScore(students);

        // In thông tin sinh viên sau khi sắp xếp
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm trung bình tăng dần:");
        print(students);

        // Đóng Scanner sau khi sử dụng xong
        scanner.close();
    }
}
