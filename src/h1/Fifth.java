package h1;

public class Fifth {

    public static void main(String args[]){

        String str1 = "A2bb2d4";

        if(Character.isDigit(str1.charAt(0))){
            for (int i = 0; i < str1.length(); i++) {
                if (i%2 != 0 && Character.isDigit(str1.charAt(i))) {
                    //return false
                    System.out.println("false is digit1");
                }
                else if (i%2 == 0 && Character.isLetter(str1.charAt(i))){
                    //return false
                    System.out.println("false is letter1");
                }
            }
            //return true
            System.out.println("true1");
        }else if(Character.isLetter(str1.charAt(0))){

            for(int i=0; i<str1.length();i++){
                if(i%2 != 0 && Character.isLetter(str1.charAt(i))){
                    //return false
                    System.out.println("false is leter2");
                }
                if(i%2 == 0 && Character.isDigit(str1.charAt(i))){
                    //return false
                    System.out.println("false is digit2");
                }

            }
            //return true
            System.out.println("true2");
        }
    }
}
