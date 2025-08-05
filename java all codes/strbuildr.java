public class strbuildr {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Ironman");
        System.out.println(str1);
        str1.setCharAt(0,'G');
        System.out.println(str1);
        str1.insert(0, 'I');
        System.out.println(str1);
        str1.delete(1, 2);
        System.out.println(str1);
        str1.append(" ");
        System.out.println(str1);
        str1.append("Stark");
        System.out.println(str1);
    }
}
