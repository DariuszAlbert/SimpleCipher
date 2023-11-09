import java.util.Scanner;

public class IOManager {
//    Class manage I/O from and to user

    private String orgText;
    public String inputManger(){
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź tekst do zaszyfrowania: ");
        orgText = input.nextLine();
        System.out.println("Wprowadzono: " + orgText);
        return orgText;
    }
}
