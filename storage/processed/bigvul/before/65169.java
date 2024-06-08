class goodB2GSink_class{
    private void goodB2GSink() throws Throwable
        {
            Integer data = dataGoodB2G;
    
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