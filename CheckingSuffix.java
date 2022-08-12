package reviewMaterials;

public class CheckingSuffix {
	
	 //"\033[3mText goes here\033[0m"
    public static void main(String[] args) {
        String[] urls = {"https://javarush.us", "https://google.com", "http://wikipedia.org",
                "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domainExtension = checkDomainExtension(url);

            System.out.println("URL address: " + url + ", network protocol - " +
                    protocol + ", domain extension - " + domainExtension);
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("http") ) {
            return "\"http\"";
        } else if (url.startsWith("https")){
            //System.out.println("Unknown format");
            return "\"https\"";
        }
        else
            return "\"unknown\"";
    }

    //com, net, org, or us,
    public static String checkDomainExtension(String url) {
        if (url.endsWith(".com") ) {
            return "\"com\"";
        } else if (url.endsWith(".org") ) {
            //System.out.println("This is an HTML page");
            return "\"org\"";
        }
         else if (url.endsWith(".net") ) {
        //System.out.println("This is an HTML page");
        return "\"net\"";
         }
         else if (url.endsWith(".us") ) {
            return "\"us\"";
        }
        else {
            //System.out.println("Unknown format");
        	
            return "\"033[0;1munknown\"";
        }
    }


}
