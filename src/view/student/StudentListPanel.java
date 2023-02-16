package view.student;

import model.Student;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentListPanel extends JPanel {

    public StudentListPanel(){
        JTable table = new JTable();
        table.setModel(Student.model);
        JScrollPane scroll = new JScrollPane(table);
        add(scroll);

        StudentJPopUpMenu studentJPopUpMenu = new StudentJPopUpMenu(table);

        table.setComponentPopupMenu(studentJPopUpMenu);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int currentRow = table.rowAtPoint(e.getPoint());
                table.setRowSelectionInterval(currentRow, currentRow);
            }
        });
    }

}
