import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        int idx = 1;
        while (idx < 10) {
            System.out.print(idx++);
            System.out.println(" : " + Objects.hashCode(String.valueOf(idx)));
        }

        System.out.println(Objects.hash("one", "two", "three"));
        System.out.println(Objects.hash("one", "two"));
        System.out.println(Objects.hash("one"));
    }
}
