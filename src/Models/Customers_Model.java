/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
// <editor-fold defaultstate="collapsed" desc="Import Code">
import Database.Rental_Connection;
import Interfaces.ModelsProcess_Interface;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
// </editor-fold>
/**
 *
 * @author adi_irsyadi
 */

public class Customers_Model implements ModelsProcess_Interface{
    private String CustomersId;
    private String CustomersName;
    private String CustomersAddress;
    private String PhoneNumber;
    private String BornPlace;
    private String BornDate;
    private String CustomersIdentitas;
    private String Gender;
    private String CustomersWork;
    private Rental_Connection Connex;
    private String[][] DataRecord;
    
    // <editor-fold defaultstate="collapsed" desc="Constructor Code">

    public Customers_Model() {
        Connex = new Rental_Connection();
    }

    public Customers_Model(String CustomersId, String CustomersName,
            String CustomersAddress, String PhoneNumber, String BornDate,
            String BornPlace, String CustomersIdentitas, String Gender,
            String CustomersWork, String[][] DataRecord) {
        Connex = new Rental_Connection();
        this.CustomersId = CustomersId;
        this.CustomersName = CustomersName;
        this.CustomersAddress = CustomersAddress;
        this.PhoneNumber = PhoneNumber;
        this.BornDate = BornDate;
        this.BornPlace = BornPlace;
        this.CustomersIdentitas = CustomersIdentitas;
        this.Gender = Gender;
        this.CustomersWork = CustomersWork;
        this.DataRecord = DataRecord;
    }

    public Customers_Model(String CustomersId) {
        Connex = new Rental_Connection();
        this.CustomersId = CustomersId;
    }
    
   
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getter and Setter Code">
    public String getCustomersId() {
        return CustomersId;
    }

    public void setCustomersId(String CustomersId) {
        this.CustomersId = CustomersId;
    }

    public String getCustomersName() {
        return CustomersName;
    }

    public void setCustomersName(String CustomersName) {
        this.CustomersName = CustomersName;
    }

    public String getCustomersAddress() {
        return CustomersAddress;
    }

    public void setCustomersAddress(String CustomersAddress) {
        this.CustomersAddress = CustomersAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getBornDate() {
        return BornDate;
    }

    public void setBornDate(String BornDate) {
        this.BornDate = BornDate;
    }

    public String getBornPlace() {
        return BornPlace;
    }

    public void setBornPlace(String BornPlace) {
        this.BornPlace = BornPlace;
    }

    public String getCustomersIdentitas() {
        return CustomersIdentitas;
    }

    public void setCustomersIdentitas(String CustomersIdentitas) {
        this.CustomersIdentitas = CustomersIdentitas;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getCustomersWork() {
        return CustomersWork;
    }

    public void setCustomersWork(String CustomersWork) {
        this.CustomersWork = CustomersWork;
    }

    public Rental_Connection getConnex() {
        return Connex;
    }

    public void setConnex(Rental_Connection Connex) {
        this.Connex = Connex;
    }

    public String[][] getDataRecord() {
        return DataRecord;
    }

    public void setDataRecord(String[][] DataRecord) {
        this.DataRecord = DataRecord;
    }
    
    // </editor-fold>
    
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Method Code">

    @Override
    public void showDataSet() {
        String Query;
        int i;
        getConnex().Connection();
        try {
            Query = "SELECT a.CustomersId, a.CustomersName, a.CustomersAddress,"
                    + "a.PhoneNumber"
                    + "a.BornPlace, a.BornDate,  a.CustomersIdentitas,"
                    + "a.Gender, a.CustomersWork"
                    + "FROM Customers a";
            System.out.println("[QUERY] - " + Query);
            Statement Stat = getConnex().getConnector().createStatement();
            ResultSet List = Stat.executeQuery(Query);
            List.last();
            DataRecord = new String[List.getRow()][9];
            List.beforeFirst();
            i = 0;
            while (List.next()){
                DataRecord[i][0] = List.getString(1);
                DataRecord[i][1] = List.getString(2);
                DataRecord[i][2] = List.getString(3);
                DataRecord[i][3] = List.getString(4);
                DataRecord[i][4] = List.getString(5);
                DataRecord[i][5] = List.getString(6);
                DataRecord[i][6] = List.getString(7);
                DataRecord[i][7] = List.getString(8);
                DataRecord[i][8] = List.getString(9);
                i++;
                    
                }
                List.close();
            } catch (Exception Ex) {
                System.out.println("[EROR] - Customers.DetailDataSet  " + Ex.getMessage().toString());
            }
        
    }

    @Override
    public void showSelectedDataSet(String Value, String Key) {
        String Query;
        String Parse;
        
        Connex.Connection();
        try {
            Query = "SELECT a.CustomersId, a.CustomersName, a.CustomersAddress,"
                    + "a.PhoneNumber,"
                    + "a.BornPlace, a.BornDate,  a.CustomersIdentitas,"
                    + "a.Gender, a.CustomersWork"
                    + "FROM Customers a";
            if (Key.equals("CustomersId")){
                Parse = "AND a.Customer = '"+ Value +"'";
            }else if (Key.equals("CustomersName")){
                Parse = "AND a.CustomersName = '"+ Value +"'";
            }else if (Key.equals("CustomersAddress")){
                Parse = "AND a.Customer = '"+ Value +"'";
            }else if (Key.equals("PhoneNumber")){
                Parse = "AND a.PhoneNumber = '"+ Value +"'";
            }else if (Key.equals("BornPlace")){
                Parse = "AND a.BornPlace = '"+ Value +"'";
            }else if (Key.equals("BornDate")){
                Parse = "AND a.BornDate = '"+ Value +"'";
            }else if (Key.equals("CustomersIdentitas")){
                Parse = "AND a.CustomersIdentitas = '"+ Value +"'";
            }else if (Key.equals("Gender")){
                Parse = "AND a.Gender = '"+ Value +"'";
            }else if (Key.equals("CustomersWork")){
                Parse = "AND a.CustomersWork = '"+ Value +"'";
            }else {
                Parse = "";
            }
            
            Query = Query + Parse;
            System.out.println("[Query] - " + Query);
            Statement Stat = Connex.getConnector().createStatement();
            ResultSet List = Stat.executeQuery(Query);
            while (List.next()){
                CustomersId = List.getString(1);
                CustomersName = List.getString(2);
                CustomersAddress = List.getString(3);
                PhoneNumber = List.getString(4);
                BornPlace = List.getString(5);
                BornDate = List.getString(6);
                CustomersIdentitas = List.getString(7);
                Gender = List.getString(8);
                CustomersWork = List.getString(9);
            }
            
            List.close();
            Stat.close();  
        } catch (Exception Ex) {
            System.out.println("[EROR] - Customers_Model.showSelectedDataSet()" + Ex.getMessage().toString());
        }
    }

    @Override
    public boolean addDataValue() {
        String Query;
        getConnex().Connection();
        try {
            Query = "INSERT INTO Customers VALUES('"+ CustomersId +"', '"+ CustomersName +"',"
                    + "'"+ CustomersAddress +"','"+ PhoneNumber +"','"+ BornPlace +"',"
                    + "'"+ BornDate +"', '"+ CustomersIdentitas +"', '"+ Gender +"',"
                    + "'"+ CustomersWork +"')";
            System.out.println("[QUERY] - " + Query);
            Statement Stat = Connex.getConnector().createStatement();
            Stat.executeQuery(Query);
            Stat.close();
            return true;
        } catch (SQLException Ex) {
            System.out.println("[ERROR] - Customers_Model.addDataValue() " + Ex.getMessage().toString());
            return false;
        }
        
    }

    @Override
    public boolean editDataValue() {
        String Query;
        
        Connex.Connection();
        try {
            Query = "UPDATE Customers SET CustomersName = '"+ CustomersName +"',"
                    + " CustomersAddress = '"+ CustomersAddress +"',PhoneNumber = '"+ PhoneNumber +"',"
                    + "BornPlace = '"+ BornPlace +"',"
                    + "BornDate = '"+ BornDate +"',CustomersIdentitas = '"+ CustomersIdentitas +"',Gender = '"+ Gender +"',"
                    + "CustomersWork = '"+ CustomersWork +"'";
            System.out.println("[QUERY] - " + Query);
            Statement Stat = Connex.getConnector().createStatement();
            Stat.executeUpdate(Query);
            Stat.close();
            return true;
        } catch (SQLException Ex) {
            System.out.println("[ERROR] - Customers.editDataValue() " + Ex.getMessage().toString());
            return false;
        }
    }

    @Override
    public boolean subDataValue() {
        String Query;

        Connex.Connection();
        try {
            Query = "DELETE FROM Customers WHERE CustomersId = '" + CustomersId + "'";
            System.out.println("[QUERY] - " + Query);
            Statement Stat = Connex.getConnector().createStatement();
            Stat.executeUpdate(Query);
            Stat.close();
            return true;
        } catch (SQLException Ex) {
            System.out.println("[ERROR] - Books_Model.subDataValue() " + Ex.getMessage().toString());
            return false;
        }
    }

    @Override
    public String genIdDataValue() {
        String Query;
        String Result;
        int hasil;

        Connex.Connection();
        try {
            Result = null;
            Query = "SELECT CustomersId FROM Customers ORDER BY CustomersId DESC LIMIT 1";
            System.out.println("[QUERY] - " + Query);
            Statement Stat = Connex.getConnector().createStatement();
            ResultSet List = Stat.executeQuery(Query);
            while (List.next()) {
                Result = List.getString(1).trim();
            }
            List.close();
            Stat.close();

            if (!Result.equals("")) {
                hasil = Integer.parseInt(Result) + 1;
                Result = String.valueOf(hasil);
                if (Result.length() == 1) {
                    Result = "0000" + Result;
                } else if (Result.length() == 2) {
                    Result = "000" + Result;
                } else if (Result.length() == 3) {
                    Result = "00" + Result;
                } else if (Result.length() == 4) {
                    Result = "0" + Result;
                }
            } else {
                Result = "00001";
            }
            return Result;
        } catch (Throwable Ex) {
            System.out.println("[ERROR] - Customers_Model.genIdDataValue() " + Ex.getMessage());
            return "00001";
        }
    }
     // </editor-fold>
}
