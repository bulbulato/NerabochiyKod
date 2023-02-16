package view.course;


import javax.swing.*;
import java.awt.*;

public class AddCourseFrame extends JFrame {
    public AddCourseFrame() {
        setTitle("Создание нового курса");
        setLocation(710, 290);
        setSize(500, 500);
        setLayout(new FlowLayout());
        add(new AddCoursePanel());

        setVisible(false);
    }
}