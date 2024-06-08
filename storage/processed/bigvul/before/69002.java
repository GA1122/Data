class goodB2GSink_class{
    public void goodB2GSink(CWE606_Unchecked_Loop_Condition__PropertiesFile_67a.Container dataContainer ) throws Throwable
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
    
            /* FIX: loop number thresholds validated */
            if (numberOfLoops >= 0 && numberOfLoops <= 5)
            {
                for (int i=0; i < numberOfLoops; i++)
                {
                    IO.writeLine("hello world");
                }
            }
    
        }
};