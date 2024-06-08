class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int dataCopy;
            {
                int data;
    
                data = 0; /* POTENTIAL FLAW: data is set to zero */
    
                dataCopy = data;
            }
            {
                int data = dataCopy;
    
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
        }
};