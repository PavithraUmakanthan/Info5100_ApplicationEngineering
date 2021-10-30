package h3_Part1;

public class psychiatrist {

    public void examine(moodyObject moodyObject){
        System.out.println("How are you feeling today?");
        moodyObject.queryMood();
    }

    public void observe(moodyObject moodyObject){
        moodyObject.ExpressFeelings();
        System.out.println("Observation: " + moodyObject.toString());
    }
}


