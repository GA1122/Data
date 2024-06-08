class goodB2GSink_class{
    private void goodB2GSink() throws Throwable
        {
            String data = dataGoodB2G;
    
            if (data != null)
            {
                /* FIX: explicitly defined string formatting */
                System.out.format("%s%n", data);
            }
    
        }
};