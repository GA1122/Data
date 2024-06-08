class goodG2BSink_class{
    public void goodG2BSink(short dataArray[] ) throws Throwable
        {
            short data = dataArray[2];
    
            /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
            data--;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};