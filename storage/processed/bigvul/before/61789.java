class badSink_class{
    private void badSink() throws Throwable
        {
            int count = countBad;
    
            int i = 0;
    
            /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
            for (i = 0; i < count; i++)
            {
                IO.writeLine("Hello");
            }
    
        }
};