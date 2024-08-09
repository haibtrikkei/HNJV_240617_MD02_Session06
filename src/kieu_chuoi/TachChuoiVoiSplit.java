package kieu_chuoi;

import java.util.StringTokenizer;

public class TachChuoiVoiSplit {
    public static void main(String[] args) {
        String bien = "Hom     nay hoc    ve kieu   du lieu chuoi";

        String[] arr = bien.split(" ");
        for(String value : arr){
            System.out.println(value);
        }

        System.out.println("Tach voi StringTokenizer: ");
        StringTokenizer stk = new StringTokenizer(bien);
        while(stk.hasMoreElements()){
            System.out.println(stk.nextToken());
        }
    }
}
