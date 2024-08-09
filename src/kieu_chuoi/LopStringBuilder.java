package kieu_chuoi;

public class LopStringBuilder {
    public static void main(String[] args) {
        StringBuilder sbl = new StringBuilder("Yen Yen Yen Yen Yen");
        sbl.replace(0,3,"Hai");

        System.out.println(sbl.toString());
    }
}
