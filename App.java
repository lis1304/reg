package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class App {

    public static void main(String[] args) {
        //String ip1 = "168.1.1.1";
        //String ip2 = "900.1.1.1";


        String tel1= "+7 (890) 612 75-25";
        String tel2= "8 (245) 251 2121";


        //System.out.println(isIp(ip1));
        //System.out.println(isIp(ip2));

        System.out.println(isIp(tel1));
        System.out.println(isIp(tel2));

    }

    public static boolean isIp(String ip){
        //Pattern pattern = Pattern.compile("^\\d");
        /*Pattern pattern = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
                                           "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
                                           "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
                                           "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"

        );*/


        Pattern pattern = Pattern.compile("^(8|\\+7) (\\([1-9][0-9]{2}\\) )(([1-9][0-9]{2})) ([0-9]{4}|[0-9]{2}-[0-9]{2})$"


        );


        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

}

