/*
 * Utils class 
 * contains utility method used by the motes.packet package
 */
package rtpmt.sensor.util;

/**
 *
 * @author Kumar
 */
public class Utils {
    
    //compare two integer arrays and return boolean
    public static boolean compare(byte[] first, int[] second){
        boolean isEqual = true;
        
        if( first.length > 0 && second.length > 0 && first.length ==  second.length){
            
            for (int i = 0; i < second.length; i++) {
                if( (first[i]&0xff) != second[i]){
                    isEqual = false;
                    break;
                }
            }
        }else{
            isEqual = false;
        }
        return isEqual;
    }
    
}
