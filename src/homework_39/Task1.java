package homework_39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Collection<Integer> ar1 = new ArrayList<>(List.of(5, 6, 7, 10, 11, 2, 3));
        Collection<Integer> ar2 = new ArrayList<>(List.of(3, 4, 5, 6, 0, 1));
        System.out.println("Result = " + homework(ar1, ar2));

    }

    public static Collection homework(Collection col1, Collection col2) {
        Collection result = new ArrayList();
        result.addAll(col1);
        result.retainAll(col2);
        return result;
    }
}

