package org.example;

import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        String url = "jdbc:mysql://localhost:3306/estudiantes2024a";
        String usuario = "root";
        String password = "123456";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de cédula:");
        String cedula = sc.nextLine();



        try(Connection connection= DriverManager.getConnection(url, usuario, password)){
            System.out.println("Conectado a la base de datos");
            String query ="select *, round(b1+b2/2) as PromedioNotas from Estudiantes where cedula = '"+ cedula +"'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                System.out.print(resultSet.getString("cedula"));
                System.out.print("--");
                System.out.print(resultSet.getString("nombre"));
                System.out.print("--");
                System.out.print(resultSet.getString("b1"));
                System.out.print("--");
                System.out.print(resultSet.getString("b2"));
                System.out.println();

                Float p1 = resultSet.getFloat("PromedioNotas");



                if (p1 >= 28){
                    System.out.println("El estudiante aprobo");
                }else if (p1>=18 && p1<=27){
                    System.out.println("El estudiante pasa a supletorios");
                }else{
                    System.out.println("El estudiante se quedo ");
                }

            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }*/

        JFrame fr = new JFrame("Aplicación");
        fr.setContentPane(new from1().panel1);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(700, 700);
        fr.setVisible(true);


    }
}