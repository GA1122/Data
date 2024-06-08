class goodB2GSink_class{
    public void goodB2GSink(Object dataObject ) throws Throwable
        {
            String data = (String)dataObject;
    
            if (data != null)
            {
                /* FIX: explicitly defined string formatting */
                System.out.format("%s%n", data);
            }
    
        }
};