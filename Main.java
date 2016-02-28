import sun.misc.Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Locphan on 2/28/2016.
 */
public class Main {

    public static void main(String[] args) {
        String a= "this is a web site: http://sdfdsfds.com";

        //cat chuoi
        String s[]=a.split(" ");
        int l=s.length;
        for (String element:s) {
            System.out.println(element);

            //Regular expression
            String pattern ="(http|ftp|https):\\/\\/([\\w+?\\.\\w+])+([a-zA-Z0-9\\~\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)_\\-\\=\\+\\\\\\/\\?\\.\\:\\;\\'\\,]*)?";
            Pattern r = Pattern.compile(pattern);
            Matcher m =r.matcher(element);
            int count = 0;

            String stringToGet="";
            while(m.find()) {
                count++;
                System.out.println("Match number "+count);
                System.out.println("start(): "+m.start());
                System.out.println("end(): "+m.end());
                stringToGet=element.substring(m.start(),m.end());
                System.out.println("url:"+stringToGet);
            }

        }
    }
}
