package org.salesforce.apexdoc;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Set of all Utility methods to be used
 * @author : Jitendra Zaa
 */
public class Utility {
    
    /**
     * This method would be used to log message on different applications
     * like Console, Eclipse Console, Logger etc
     */
    public static void logMessage(String msg){
        System.out.println(msg); 
    }
    
    public static void logMessage(Exception e){
        logMessage(stackTraceToString(e)); 
    }
    
    /**
     * Get String equivalent to PrintStackTrace
     *
     * @param e
     * @return
     */
    private static String stackTraceToString(Exception e) {
        String retVal = "";
        if (e != null) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            retVal = sw.toString();
        }
        return retVal;
    }

}
