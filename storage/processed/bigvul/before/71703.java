class goodB2GSink_class{
    public void goodB2GSink(Vector<String> dataVector ) throws Throwable
        {
            String data = dataVector.remove(2);
    
            /* FIX: call equals() on string literal (that is not null) */
            if("CWE690".equals(data))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};