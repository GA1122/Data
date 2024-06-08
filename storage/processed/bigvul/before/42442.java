class goodG2BSink_class{
    public void goodG2BSink(Vector<Short> dataVector ) throws Throwable
        {
            short data = dataVector.remove(2);
    
            /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
            data--;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};