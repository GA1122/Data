class badSink_class{
    public void badSink(Object countObject ) throws Throwable
        {
            int count = (Integer)countObject;
    
            int i = 0;
    
            /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
            for (i = 0; i < count; i++)
            {
                IO.writeLine("Hello");
            }
    
        }
};