class goodB2GSink_class{
    public void goodB2GSink(String dataArray[] ) throws Throwable
        {
            String data = dataArray[2];
    
            if (data != null)
            {
                /* FIX: explicitly defined string formatting */
                System.out.format("%s%n", data);
            }
    
        }
};