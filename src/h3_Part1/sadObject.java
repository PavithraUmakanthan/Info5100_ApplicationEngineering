package h3_Part1;

public class sadObject extends moodyObject{
    @Override
    public String getMood() {
        return ("sad");
    }
    @Override
    public void ExpressFeelings() {

        System.out.println("‘waah’  ‘boo hoo’  ‘weep’ ‘sob’");
    }

    public String toString(){
        return("Subject cries a lot");
    }
}