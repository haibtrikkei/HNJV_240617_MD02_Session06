package kieu_chuoi;

public class LopString {
    public static void main(String[] args) {
        String bien = "Hai Hai Hai Hai Hai";

        bien = bien.replaceFirst("Hai","Yen");

        System.out.println(bien);

        String[] mang = {"Yen","Yen","Yen","Yen","Yen"};

        for (String ten : mang){
            ten = ten.replaceFirst("Yen","Hai");
            System.out.print(ten+"\t");
        }
        System.out.println();


    }
}
