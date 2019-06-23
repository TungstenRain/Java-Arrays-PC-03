package ch07pc03;

/**
 *
 * @author Frank
 */
public class ChargeAccount {
    //fields
    private int[] validAccountNumbers;
    
    //constructor
    public ChargeAccount()
    {
        validAccountNumbers = new int[18];
        setAccountNumbers();
    }
    
    //methods
    public boolean validAccount (int acctNum)
    {
        //variable
        boolean valid = false;
        int i;
        
        for (i = 0; i < validAccountNumbers.length; i++)
        {
            if (validAccountNumbers[i] == acctNum)
            {
                valid = true;
            }
        }
        
        return valid;
    }
    
    private void setAccountNumbers()
    {
        int[] validAccountNumbers = {
            5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
            8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
            1005231, 6545231, 3852085, 7576651, 7881200, 4581002
        };
    }
}
