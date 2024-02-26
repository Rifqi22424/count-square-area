/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Persegi persegiA = new Persegi(10);
        double kellingPersegiBefore = persegiA.getKeliling();
        double luasPersegiBefore = persegiA.getLuas();

        System.out.println("Keliling Persegi Sebelum diubah: " + kellingPersegiBefore);
        System.out.println("Luas Persegi Sebelum diubah: " + luasPersegiBefore + "\n");

        persegiA.setSisi(5);
        double kellingPersegiAfter = persegiA.getKeliling();
        double luasPersegiAfter = persegiA.getLuas();

        System.out.println("Keliling Persegi sesudah diubah: " + kellingPersegiAfter);
        System.out.println("Luas Persegi sesudah diubah: " + luasPersegiAfter + "\n");


        Books book1 = new Books("Ilham", "Artificial Intelligence", 20000, 1);
        Books book2 = new Books("Junaidi", "Machine Learning", 10000, 2);
        
        double totalPrice = book1.buyBooks(2) + book2.buyBooks(3);
        System.out.println("\n" + "Total Harga yang harus dibayar Rp." + totalPrice);
    }
}