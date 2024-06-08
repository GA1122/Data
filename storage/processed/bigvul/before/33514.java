class badSink_class{
    public void badSink(int dataArray[] ) throws Throwable
        {
            int data = dataArray[2];
    
            /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
            data--;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};