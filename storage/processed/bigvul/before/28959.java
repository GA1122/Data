class goodG2BSink_class{
    private void goodG2BSink() throws Throwable
        {
            short data = dataGoodG2B;
    
            /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
            data++;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};