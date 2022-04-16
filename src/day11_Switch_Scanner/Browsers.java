package day11_Switch_Scanner;

public class Browsers {

    public static void main(String[] args) {

        String BrowserName = "chrome";

        String result = "";

        boolean validBrowser = BrowserName == "chrome" || BrowserName =="firefox" || BrowserName == "opera"
                || BrowserName == "safari" || BrowserName == "edge";

        if(validBrowser){
            // 5 options
            if(BrowserName == "chrome"){
               result = "Chrome Browser is Selected";
            }else if (BrowserName =="firefox"){
                result = " Firefox Browser is Selected";
            }else if (BrowserName == "opera"){
                result = "Opera Browser is Selected";
            }else if (BrowserName == "safari"){
                result = "Safari Browser is Selected";
            }else{
                result = "Edge Browser is Selected";
            }
        }else{
            result = "Invalid Browser Name";
        }

        System.out.println(result);






    }



}
