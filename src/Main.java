import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("E");
        names.add("R");
        names.add("B");
        names.add("L");
        names.add("W");
        names.add("Y");

        int n = names.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String name1 = names.get(j);
                String name2 = names.get(j + 1);
                if (name1.compareTo(name2) > 0) {
                    names.set(j, name2);
                    names.set(j + 1, name1);
                }
            }
        }

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
