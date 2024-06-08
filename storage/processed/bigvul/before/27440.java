class goodG2BSink_class{
    public void goodG2BSink(Vector<Long> dataVector ) throws Throwable
        {
            long data = dataVector.remove(2);
    
            /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
            data++;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};