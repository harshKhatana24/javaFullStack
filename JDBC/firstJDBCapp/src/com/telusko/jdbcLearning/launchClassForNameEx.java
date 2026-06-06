package com.telusko.jdbcLearning;

import java.sql.DriverManager;
import java.sql.SQLException;

public class launchClassForNameEx {
    static void main() throws ClassNotFoundException, SQLException {

//        Class.forName("com.mysql.cj.jdbc.Driver");

        Class.forName
                ("com.telusko.jdbcLearning.Demo");//only static block will be executed

//        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

    }
}

class Demo{
    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance block ==> Non static");
    }

}
