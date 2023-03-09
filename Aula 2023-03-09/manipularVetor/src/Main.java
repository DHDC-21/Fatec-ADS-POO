import java.util.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i] + " ");
        }
        int[] b = {3, 5, 6, 8, 9};
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }

        int va[] = {3,5,7,9,11,13,15,17};
        int vb[] = new int[8];
        System.out.println();
        System.arraycopy(va, 4, vb,4,8);
        for (int i = 0; i < vb.length; i++) {
            System.out.println(vb[i] + " ");
        }

        int vc[] = new int[30];
        Arrays.fill(vc, 18);
        System.out.println();


        int vd[] = {34,51,11,9,56,1};
        List<Integer> lista = new ArrayList<>();
        lista.add(43);
        lista.add(1);
        lista.add(52);
        Collections.sort(lista);
    }
}