package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class from1 {
    public JButton button1;
    public JPanel panel1;
    private JLabel nombreTXT;

    public from1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "jdbc:mysql://localhost:3306/estudiantes2024a";
                String usuario = "root";
                String password = "123456";


                try (Connection connection = DriverManager.getConnection(url, usuario, password)) {
                    System.out.println("Conectado a la base de datos");
                    String query = "select * from estudiantes";
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);

                    while (resultSet.next()) {
                        System.out.print(resultSet.getString("cedula"));
                        nombreTXT.setText(resultSet.getString("nombre"));
                        System.out.print("--");
                        System.out.print(resultSet.getString("nombre"));
                        System.out.print("--");
                        System.out.print(resultSet.getString("b1"));
                        System.out.print("--");
                        System.out.print(resultSet.getString("b2"));
                        System.out.println();

                    }
                } catch (SQLException e1) {
                    System.out.println(e1.getMessage());
                }
            }
        });
        }
    }