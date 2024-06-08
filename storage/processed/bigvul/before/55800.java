class goodB2GSink_class{
    private void goodB2GSink(int data ) throws Throwable
        {
    
            /* FIX: test for a zero denominator */
            if (data != 0)
            {
                IO.writeLine("100/" + data + " = " + (100 / data) + "\n");
            }
            else
            {
                IO.writeLine("This would result in a divide by zero");
            }
    
        }
};