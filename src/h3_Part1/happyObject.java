package h3_Part1;

public class happyObject extends moodyObject{
    @Override
    public String getMood() {

        return ("happy");
    }
    @Override
    public void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString(){
        return ("Subject laughs a lot");
    }
}




