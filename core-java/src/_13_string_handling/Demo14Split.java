package _13_string_handling;

public class Demo14Split {
    public static void main(String[] args) {
        String str = "vishnu,suyash,rutuja,vaishnawi,niktia";
        String[] arrayOfStrings = str.split(",");
        //delimiter ---> ,

        for (String temp : arrayOfStrings) {
            System.out.println(temp);
        }
    }
}
