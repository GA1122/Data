class badSink_class{
    public void badSink(CWE606_Unchecked_Loop_Condition__PropertiesFile_67a.Container dataContainer ) throws Throwable
        {
            String data = dataContainer.containerOne;
    
            int numberOfLoops;
            try
            {
                numberOfLoops = Integer.parseInt(data);
            }
            catch (NumberFormatException exceptNumberFormat)
            {
                IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                numberOfLoops = 1;
            }
    
            for (int i=0; i < numberOfLoops; i++)
            {
                /* POTENTIAL FLAW: user supplied input used for loop counter test */
                IO.writeLine("hello world");
            }
    
        }
};