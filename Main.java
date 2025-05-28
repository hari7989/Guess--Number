import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        String input ;
        while (count!=0){
            System.out.print("guess the number '0-9' you have "+count+"Attempts :" );
            input=scanner.nextLine();
            if(input.equalsIgnoreCase("e")){
                System.out.println("Emergency Exit");
                return;
            } int num = Integer.parseInt(input);
            if(num>=0 && num<=9) {
                int gen = BasicsOfJava.generate();
                if(num!=gen){
                    int diff = (int) Math.ceil((double)Math.abs(num-gen)/2);
                    switch (diff){
                        case 1:
                            System.out.println("very close");
                            break;
                        case 2:
                            System.out.println("close");
                            break;
                        case 3:
                            System.out.println("average");
                            count--;
                            break;
                        default:
                            System.out.println("Bad and you lose your chance");
                            count--;
                            break;
                    }
                }else {
                    System.out.println("Perfect your accuracy is :");
                    return;
                }
            }else {
                System.out.println("Enter in range 0-9");
            }
        }
        scanner.close();
    }
}