package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object CategoryName
     
    /**
     * <p></p>
     */
    public static Object NewCategoryName
     
    /**
     * <p></p>
     */
    public static Object Quote
     
    /**
     * <p></p>
     */
    public static Object Author
     
    /**
     * <p></p>
     */
    public static Object LockedCategory
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            CategoryName = selectedVariables['CategoryName']
            NewCategoryName = selectedVariables['NewCategoryName']
            Quote = selectedVariables['Quote']
            Author = selectedVariables['Author']
            LockedCategory = selectedVariables['LockedCategory']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
