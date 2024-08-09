package xac_thuc_du_lieu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaoMau {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^C");

        String name1 = "Cuong";
        String name2 = "Cuong Nguyen";
        String name3 = "Nguyen Van Cuong";

        Matcher mat1 = p.matcher(name1);
        Matcher mat2 = p.matcher(name2);
        Matcher mat3 = p.matcher(name3);

        if(mat1.find()){
            System.out.println(name1);
        }
        if(mat2.find()){
            System.out.println(name2);
        }
        if(mat3.find()){
            System.out.println(name3);
        }
    }
}
/*
    cuong@gmail.com
    123cuong@gmail.com

 */
