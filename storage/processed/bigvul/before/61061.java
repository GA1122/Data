class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int count = goodG2BSource();
    
            int i = 0;
    
            /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
            for (i = 0; i < count; i++)
            {
                IO.writeLine("Hello");
            }
    
        }
};