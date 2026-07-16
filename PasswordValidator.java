// ดูโจทย์ spec และวิธีทำใน README.md
public class PasswordValidator {

    static final int MIN_LEN = 8;
    static final int MAX_LEN = 20;

    static boolean validate(String pw) {

        if(pw == null) throw new IllegalArgumentException();

        if(pw.length()<8 || pw.length()>20) return false;
        // TODO: implement ตาม spec ใน README.md (R1-R6)
        boolean hasUpper = false ;
        boolean hasLower = false ;
        boolean hasDigit = false;
        boolean has67 = false;
        for (int i = 0; i < pw.length(); i++) {
            if (Character.isUpperCase(pw.charAt(i))) hasUpper = true ;
            else if (Character.isLowerCase(pw.charAt(i))) hasLower = true ;
            else if (Character.isDigit(pw.charAt(i))) hasDigit = true ;
            
        }

        for (int i = 0; i < pw.length(); i++){
        if(Character.isDigit(pw.charAt(i))) has67 = true;
        }
        return hasLower&&hasUpper&&hasDigit&&has67;
    }
}
