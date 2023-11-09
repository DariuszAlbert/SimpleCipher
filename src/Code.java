public class Code {
//    Class responsible for text coding
    public String code(String text){
    char[] splitedOrg = text.toCharArray();
    StringBuffer sb = new StringBuffer();
        for (char letter: splitedOrg){
        sb.append((int) letter);
    }
        return sb.toString();
}}
