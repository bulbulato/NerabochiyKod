package model;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Course {
    private int id;
    private String title;
    private String description;

    static ArrayList<Course> list = new ArrayList<>();
    private static int lastID = 0;
    static String headers[] = {"ID", "Title", "Description"};
    public static DefaultTableModel model = new DefaultTableModel(headers, 0);


    public Course(String title, String description) {
        this.id = ++lastID;
        this.title = title;
        this.description = description;
        list.add(this);
        addRow(this);
    }

    public static void addRow(Course course){
        model.addRow(
                new Object[] {
                        course.getId(),
                        course.getTitle(),
                        course.getDescription()
                });
    }

    public static Course getCourseById(int courseID) {
    }

    public String toString() {
        return this.id + " " + this.title + " " + this.description;
    }

    ArrayList<Student> getStudents() {
        return CourseEnrollment.getStudentsByCourse(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Course> getList() {
        return list;
    }

    public static void setList(ArrayList<Course> list) {
        Course.list = list;
    }

    public Course(int id, String title, String description) {
        this.id = id;
        this.setProperties(title, description);
    }
    public void setProperties

    public static DefaultTableModel getModelCourses(Student student) {
        DefaultTableModel model = new DefaultTableModel(headers, 0);
        for (Course course : student.getCourses()) {
model.addRow(
        new Object[]{
                course.getId(),
                        course.getTitle(),
                        course.getDescription(),
                )
        }
)
        }
    }
}
    public static Course getCourseById(int courseID){
 for (Course course : list)
     if (course.id == courseID)
         return course;
 return null


}
