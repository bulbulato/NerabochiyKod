package com.company;

import repository.CourseRepository;
import repository.StudentRepository;
import view.MainFrame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static MainFrame mainFrame = new MainFrame();

    public static void main(String[] args) {
        StudentRepository.getAll();
        CourseRepository.getAll();
    }
}
