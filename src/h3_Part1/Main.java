package h3_Part1;

public class Main {

    public static void main(String[] args) {

        psychiatrist psychObj = new psychiatrist();
        happyObject happyObj = new happyObject();
        sadObject sadObj = new sadObject();

        psychObj.examine(happyObj);
        System.out.println();
        psychObj.observe(happyObj);
        System.out.println();

        psychObj.examine(sadObj);
        System.out.println();
        psychObj.observe(sadObj);

    }
}
