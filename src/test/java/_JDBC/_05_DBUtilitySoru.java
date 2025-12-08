package _JDBC;

import java.util.ArrayList;

public class _05_DBUtilitySoru extends JDBCParent{

    // Gönderilen sorgu sonucundaki tüm datayı bir List olarak döndüren metodu yazınız.
    public static void main(String[] args) {

        String sorguSql="select first_name, last_name from customer";
        ArrayList<ArrayList<String>> donenData= getListData(sorguSql);

    }


    // metodu yazınız


}
