import java.util.*;

public class hewan {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList();
        Hewan.add("Sapi");
        Hewan.add("Kucing");
        Hewan.add("Domba");
        Hewan.add("Gajah");
        Hewan.add("Jerapah");
        
        ArrayList<String> DeleteHewan = new ArrayList();
        DeleteHewan.add("Kucing");
        DeleteHewan.add("Domba");
        DeleteHewan.add("Jerapah");
        
        String[] hew = Arrays.copyOf(Hewan.toArray(), Hewan.size(), String[].class);
        System.out.println("Hewan : "+Arrays.toString(hew));
        System.out.println("Hewan yang Dihapus: ");
        String[] dhew = Arrays.copyOf(DeleteHewan.toArray(), DeleteHewan.size(), String[].class);
        System.out.println(Arrays.toString(dhew));
        System.out.println("Output Hewan: ");
        for (String outp : DeleteHewan) {
            Hewan.removeIf(item -> item.equals(outp));
        }
        
        System.out.println(Hewan);
    }
}