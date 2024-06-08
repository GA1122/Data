class goodG2BSink_class{
    private void goodG2BSink() throws Throwable
        {
            int count = countGoodG2B;
    
            int i = 0;
    
            /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
            for (i = 0; i < count; i++)
            {
                IO.writeLine("Hello");
            }
    
        }
};