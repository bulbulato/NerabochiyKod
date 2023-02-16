package view.course;




import model.Course;

import javax.swing.*;

public class CourseListPanel extends JPanel {
    JTable table;
    public CourseListPanel(){


         table = new JTable();
        table.setModel(Course.model);

        JScrollPane scroll = new JScrollPane(table);
        add(scroll);
    }
}