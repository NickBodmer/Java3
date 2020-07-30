import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"};
        String[] arrayOfStrings = {"A", "B", "C", "D"};

        over2(arr1, 0, 6);
        over2(arr2, 0, 1);
        asList(arrayOfStrings);


    }

    public static void over2(Object[] arr, int n1, int n2) {
        System.out.println("дано: " + Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = sw;
        System.out.println("результат замены: " + Arrays.toString(arr));
    }


    public static <T> void asList(T[] arr) {

        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("конвертация : " + alt);
    }
}
