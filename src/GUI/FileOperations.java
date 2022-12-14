package GUI;

import Users.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperations {
    public static ArrayList<Object> read(String FilePath) {

        Scanner Reader = null;
        try {
            Reader = new Scanner(new File(FilePath));

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        if (FilePath.equals("admin.txt")) {

            ArrayList<Admin> admins = new ArrayList<Admin>();
            Admin x;

            while (Reader.hasNext()) {

                x = new Admin();
                String Line = Reader.nextLine();
                String[] seprated = Line.split(",");

                x.setUsername(seprated[0]);
                x.setPassword(seprated[1]);
                admins.add(x);
            }

            return (ArrayList<Object>) (Object) admins;


        }
        else if (FilePath.equals("employee.txt")) {

            ArrayList<Employee> employees = new ArrayList<Employee>();
            Employee x;

            while (Reader.hasNext()) {

                x = new Employee();
                String Line = Reader.nextLine();
                String[] seprated = Line.split(",");

                x.setID(Integer.parseInt(seprated[0]));
                x.setUsername(seprated[1]);
                x.setPassword(seprated[2]);
                employees.add(x);
            }

            return (ArrayList<Object>) (Object) employees;


        }

        else if (FilePath.equals("User.txt"))
        {

            ArrayList<User> Users = new ArrayList<User>();
            User x;

            while (Reader.hasNext()) {

                x = new User();
                String Line = Reader.nextLine();
                String[] seprated = Line.split(",");


                x.setID(Integer.parseInt(seprated[0]));
                x.setUsername(seprated[1]);
                x.setPassword(seprated[2]);
                x.setPhoneNumber(Integer.parseInt(seprated[3]));
                x.setEmail(seprated[4]);


                Users.add(x);
            }

            return (ArrayList<Object>) (Object) Users;

        }

        else if (FilePath.equals("products.txt"))
        {

            ArrayList<Product> Products = new ArrayList<Product>();
            Product x;

            while (Reader.hasNext()) {

                x = new Product();
                String Line = Reader.nextLine();
                String[] seprated = Line.split(",");


                x.setID(Integer.parseInt(seprated[0]));
                x.setName(seprated[1]);
                x.setPrice(seprated[2]);
                x.setExpireDate(seprated[3]);
                x.setQuantity(Integer.parseInt(seprated[4]));
                x.setDiscount(seprated[5]);
                x.setCategory(seprated[6]);
                if (seprated.length < 8)
                    x.setReport(" ");
                else
                    x.setReport(seprated[7]);


                Products.add(x);
            }

            return (ArrayList<Object>) (Object) Products;

        }

        else if (FilePath.equals("marketUsers.txt"))
        {

            ArrayList<MarketUser> marketUsers = new ArrayList<MarketUser>();
            MarketUser x;

            while (Reader.hasNext()) {

                x = new MarketUser();
                String Line = Reader.nextLine();
                String[] seprated = Line.split(",");


                x.setID(Integer.parseInt(seprated[0]));
                x.setUsername(seprated[1]);
                x.setPassword(seprated[2]);
                x.setPhoneNumber(Integer.parseInt(seprated[3]));
                x.setEmail(seprated[4]);


                marketUsers.add(x);
            }

            return (ArrayList<Object>) (Object) marketUsers;



        }
        else
            return null;
    }

    public static boolean write(String Query, String FilePath, boolean appendType) {

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(new File(FilePath), appendType));
            writer.println(Query);
            return true;
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            writer.close();
        }
        return false;
    }
}