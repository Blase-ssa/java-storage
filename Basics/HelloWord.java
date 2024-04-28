/**
 * A program that prints <code>HJello word!</code>
 * @author Sergei Silantev
 * @category trash
 * @version 1.0
 */
public class HelloWord {
    /**
     * Program entry point
     * @param cliargs - CLI arguments
     */
    public static void main (String[] cliargs) {
        System.out.println("Hello word!");
        System.out.println("A" + 12);
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println('A' + '1' + "2");
        System.out.println('A' + "12");
    }
}
