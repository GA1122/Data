class badSink_class{
    public void badSink() throws Throwable
        {
            int count = CWE400_Resource_Exhaustion__PropertiesFile_for_loop_68a.count;
    
            int i = 0;
    
            /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
            for (i = 0; i < count; i++)
            {
                IO.writeLine("Hello");
            }
    
        }
};