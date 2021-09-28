package h1;

public class Third {

    public static int firstNonRepeated() {

        int[] arr = {2, 3, 4, 2, 2, 3, 5, 7};

        int result ;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length; j++) {

                if (arr[j] != arr[i]) {

                    if (j == arr.length - 1) {

                        return arr[i];

                    }
                }
            }
        }
        return -1;
    }
}
