import java.util.Scanner;

public class Str_cnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter a character you want to be counted: ");
        char cha = sc.next().charAt(0);

        int count = 0;
        for (int i=0; i<str.length();i++){
            if (str.charAt(i) == cha){
                count ++;
            }
        }
        System.out.println("There are " + count + " '" + cha + "'" + " found in " + str);
    }
}
