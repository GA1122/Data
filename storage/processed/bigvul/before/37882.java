class badSink_class{
    public void badSink(int dataArray[] ) throws Throwable
        {
            int data = dataArray[2];
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Integer.MIN_VALUE, this will underflow */
                int result = (int)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};