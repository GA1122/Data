class badSink_class{
    public void badSink(int countArray[] ) throws Throwable
        {
            int count = countArray[2];
    
            int i = 0;
    
            /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
            for (i = 0; i < count; i++)
            {
                IO.writeLine("Hello");
            }
    
        }
};