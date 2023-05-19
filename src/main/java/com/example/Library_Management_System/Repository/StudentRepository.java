package com.example.Library_Management_System.Repository;



import com.example.Library_Management_System.Models.Student;
        import org.springframework.data.jpa.repository.JpaRepository;

        import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findNameByEmail(String email);
}