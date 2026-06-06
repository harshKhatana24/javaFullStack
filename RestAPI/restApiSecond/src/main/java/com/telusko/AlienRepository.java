package com.telusko;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AlienRepository {

    private Connection connection;

    public AlienRepository(){

        try{//1. Load and Register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. Establish the connection
            String url = "jdbc:mysql://127.0.0.1:3306/jdbcLearning";
            String user = "root";
            String password = "Root@123";
            connection = DriverManager.getConnection(url, user, password);
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public List<Alien> getAliens(){
        List<Alien> alienList=new ArrayList<>();

        try {

            PreparedStatement pstm1 = connection.prepareStatement("""
SELECT * FROM alien
""");
            ResultSet rs=pstm1.executeQuery();

            while (rs.next()){
                Alien a=new Alien();
                a.setId(rs.getInt("id"));
                a.setName(rs.getString("name"));
                a.setPoints(rs.getInt("point"));
                alienList.add(a);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return alienList;
    }


//
    public Alien getById(int id){

        Alien a=new Alien();

        try {

            PreparedStatement pstm = connection.prepareStatement("""
SELECT * FROM alien where id=?
""");
            pstm.setInt(1,id);

            ResultSet rs=pstm.executeQuery();
            if (rs.next()) {
                a.setId(rs.getInt("id"));
                a.setName(rs.getString("name"));
                a.setPoints(rs.getInt("point"));
            }else {
                return null;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }


    public Alien createAlien(Alien a){
        int id=a.getId();
        String name= a.getName();
        int point=a.getPoints();



        try {



            PreparedStatement pstm = connection.prepareStatement("""
INSERT INTO alien(id,name,point) VALUES(?,?,?)
""");



            pstm.setInt(1,id);
            pstm.setString(2,name);
            pstm.setInt(3,point);


            int rowAffected=pstm.executeUpdate();

            if (rowAffected==0){
                System.out.println("data insertion failed!");
                return null;
            }else {
                System.out.println("data insertion successful...");
                System.out.println(a.toString());
                return a;
            }

        } catch (SQLException e) {
             e.printStackTrace();
        }

        return a;
    }




    public boolean deleteAlien(int id){


        String str= """
        DELETE FROM alien WHERE id=?;
        """;

        try {
            PreparedStatement psmt=connection.prepareStatement(str);

            psmt.setInt(1,id);

            int del=psmt.executeUpdate();
            if (del==0){
                System.out.println("deletion failed from AlienRepo!");
                return false;
            }else{
                System.out.println("deletion successful...from AlienRepo");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }


    public Alien updateAlien(Alien alien) {
        try {
            PreparedStatement psmt=connection.prepareStatement("""
    UPDATE alien SET name=?,point=? WHERE id=?;
    """);

        psmt.setInt(3,alien.getId());
        psmt.setInt(2,alien.getPoints());
        psmt.setString(1,alien.getName());

        int affectedRow=psmt.executeUpdate();

        if (affectedRow==0) {
            System.out.println("Updation Failed!");
            return alien;
        }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getById(alien.getId());
    }
}
