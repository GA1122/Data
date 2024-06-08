class goodG2BSink_class{
    public void goodG2BSink(CWE400_Resource_Exhaustion__PropertiesFile_for_loop_67a.Container countContainer ) throws Throwable
        {
            int count = countContainer.containerOne;
    
            int i = 0;
    
            /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
            for (i = 0; i < count; i++)
            {
                IO.writeLine("Hello");
            }
    
        }
};