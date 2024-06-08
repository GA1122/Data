class goodB2GSink_class{
    public void goodB2GSink(Object dataObject ) throws Throwable
        {
            Integer data = (Integer)dataObject;
    
            /* FIX: validate that data is non-null */
            if (data != null)
            {
                IO.writeLine("" + data.toString());
            }
            else
            {
                IO.writeLine("data is null");
            }
    
        }
};