package JavaDasar;

public class PrintF {
    public static void main(String[] args) {
        String nama = "Mar";
        float ipk = 3.54f;

        //cara biasa (
        System.out.println("saya " + nama + " dapat Ipk " + ipk);
        //cara print formats
        System.out.printf("saya %1$s dan saya %1$s dapat nilai ipk %2$.2f",nama,ipk);
        System.out.println("\n");
        System.out.printf("saya %1$s dan saya %1$s dapat nilai ipk %2$f",nama,ipk);

    }
}
