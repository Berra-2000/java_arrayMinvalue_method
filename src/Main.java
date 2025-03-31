public class Main {
    public static void main(String[] args) {
        int[] dizi = {5, 3, 8, 1, 2};
        int enKucuk = enKucukEleman(dizi);
        System.out.println("Dizideki en küçük eleman: " + enKucuk);
    }

    public static int enKucukEleman(int[] dizi) {
        int min = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] < min) {
                min = dizi[i];
            }
        }
        return min;
    }
}