
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<Integer> strings = new ArrayList<>();
    }
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            
        } else {
            strings.remove(strings.size() - 1);
        }
    }
}
