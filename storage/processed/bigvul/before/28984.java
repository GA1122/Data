class goodG2BSink_class{
    public void goodG2BSink(Object dataObject ) throws Throwable
        {
            short data = (Short)dataObject;
    
            /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
            data++;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};