class goodB2GSink_class{
    public void goodB2GSink(Object dataObject ) throws Throwable
        {
            int [] data = (int [])dataObject;
    
            /* FIX: validate that data is non-null */
            if (data != null)
            {
                IO.writeLine("" + data.length);
            }
            else
            {
                IO.writeLine("data is null");
            }
    
        }
};