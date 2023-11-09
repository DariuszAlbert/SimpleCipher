public class MainClass {
//    Creata simple sipher
    public static void main(String[] args) {
        IOManager input = new IOManager();
        String orgText = input.inputManger();
        Code szyfruj = new Code();
        String codedText = szyfruj.code(orgText);
        System.out.println(codedText);
    }
}

