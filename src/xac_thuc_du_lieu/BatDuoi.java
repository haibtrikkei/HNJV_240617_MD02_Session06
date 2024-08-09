package xac_thuc_du_lieu;

import java.util.regex.Pattern;

public class BatDuoi {
    public static void main(String[] args) {
        String address1 = "Ha Noi";
        String address2 = "Ba Dinh - Ha Noi";
        String address3 = "Soc Son - Ha Noi";
        String address4 = "Hoan Kiem - Ha Noi - Viet Nam";

        Pattern p1 = Pattern.compile("Ha Noi");

        if(p1.matcher(address1).find()){
            System.out.println(address1);
        }

        if(p1.matcher(address2).find()){
            System.out.println(address2);
        }

        if(p1.matcher(address3).find()){
            System.out.println(address3);
        }

        if(p1.matcher(address4).find()){
            System.out.println(address4);
        }
    }
}
