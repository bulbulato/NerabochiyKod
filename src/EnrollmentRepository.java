import model.Course;
import model.CourseEnrollment;
import model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EnrollmentRepository {


        public static String url = "jdbc:postgresql://localhost:5432/postgres";
        private static String login = "postgres";
        private static String password = "root";

        public static void getAll() {

            String query = "Select * from enrollments";
            try {
                Connection connection = DriverManager.getConnection(url, login, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    String studentId = resultSet.getString("studentid");
                    String courseId = resultSet.getString("courseid");
                    new CourseEnrollment(Integer.parseInt(id), Student.getStudentById(studentId), Course.getCourseById(courseId));
               if (Student.getStudentById(studentId) != null && Course.getCourseById(courseId) != null
new CourseEnrollment(Integer.parseInt())

                }
                connection.close();

            } catch (Exception e) {
                System.out.println("Не удалось подключиться к базе данных");
                System.out.println(e.getMessage());
            }
        }

public static void insertEnrollment(int studentId, int courseId){
            String query = "insert into enrollments(studentId, courseId) values(?, ?)";

}


}
