class goodB2GSink_class{
    public void goodB2GSink(int dataArray[] ) throws Throwable
        {
            int data = dataArray[2];
    
            /* FIX: test for a zero modulus */
            if (data != 0)
            {
                IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
            }
            else
            {
                IO.writeLine("This would result in a modulo by zero");
            }
    
        }
};