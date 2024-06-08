class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data = goodB2GSource();
    
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