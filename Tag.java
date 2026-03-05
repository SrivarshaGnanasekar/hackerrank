import java.util.Scanner;
import java.util.regex.*;

public class Tag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        
        while (n-- > 0) {
            String line = sc.nextLine();
            Pattern p = Pattern.compile("<([^/][^>]*)>([^<>]+)</\\1>");
            Matcher m = p.matcher(line);
            
            boolean found = false;
            while (m.find()) {
                System.out.println(m.group(2));
                found = true;
            }
            if (!found) {
                System.out.println("None");
            }
        }
    }
}
