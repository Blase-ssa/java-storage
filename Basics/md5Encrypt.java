import java.security.MessageDigest;

public class md5Encrypt {
    public static void main(String[] args) throws Exception {
        String encryptThis = "T3st 5t!ng";
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(encryptThis.getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
        System.out.println();
    }
}
