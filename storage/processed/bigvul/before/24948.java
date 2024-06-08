class badSink_class{
    public void badSink(Vector<Integer> dataVector ) throws Throwable
        {
            int data = dataVector.remove(2);
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Integer.MAX_VALUE, this will overflow */
                int result = (int)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};