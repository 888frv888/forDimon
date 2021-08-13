public class StringMagic {
    public static void main(String[] args) {
        String startString = "kj12n44 prom669j0f kjn55lk893kj234";
        char[] charArray = new char[startString.length()];
        for (byte i =0; i < charArray.length; i++) {
            charArray[i] = startString.charAt(i);
            if (Character.isLetter(charArray[i])) {
                System.out.println("символ " + charArray[i] + " по индексу " + i + " является буквой");
            }
            else if (Character.isDigit(charArray[i])) {
                System.out.println("символ " + charArray[i] +  " по индексу " + i + " является цифрой");
            }
            else {
                System.out.println("символ "+charArray[i]+ " по индексу " + i + " скорее всего пробел");
            }
        }
    }
}
