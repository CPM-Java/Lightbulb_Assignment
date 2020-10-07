/** Indicate what each numbered line or word, does or remembers in the program.   
 *  Scroll to the bottom there is space for your answers. 
 *  Make a jar file and submit your answers                                       NAMES:__________________________________
 * @author Mr_Coyner    
 * @version 8/8/2017                                                                    __________________________________
 */
//          1.
public class LightBulb_fillIns
{                                                              
    // 2.     3.     4.          5.
    private String myStateStr = "off";
    private int mySwitchCount = 0;
    
    /**  6. what should this comment say? 
     * 
     * @return a String indicating the state of the light.
     */
    // 7.    8.      9.
    public String lightOn()
    { // 10. (the curly braces { } )
    
        mySwitchCount = mySwitchCount + 1;
        myStateStr = "on"; 
        return myStateStr;
    }
    
    /** 11. There are two types of comments. Which type is this?
     *  @return a String indicating the state of the light.
     */
    public String lightOff()
    {
        mySwitchCount++;
        myStateStr = "off"; // 12. semicolon
        
        // 13.
        return myStateStr;  
    }
    
    /** 14. What does a toString method do?
     * 
     *  @return a String indicating the state of the light.
     */    
    public String toString()
    {
        return "The light is " + myStateStr + " and has been switched " + mySwitchCount + " times.";        
    }
}

// 1. class LightBulb_fillIns _______________________________________
    
// 2. private _______________________________________________________
                                
// 3. String and int __________________________________________________
                                
// 4. myStateStr and mySwitchCount ____________________________________

// 5. "off"  __________________________________________________________ 

// 6. comment should say: _____________________________________________

// 7. public ________________________________________________________

// 8. String ________________________________________________________

// 9. lightOn() _____________________________________________________

// 10. { } __________________________________________________________

// 11. comment type _______________________________________________

// 12. ;_____________________________________________________________

// 13. return _______________________________________________________

// 14. toString() ___________________________________________________
