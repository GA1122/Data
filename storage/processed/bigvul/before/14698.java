class badSink_class{
    public void badSink(Vector<Byte> dataVector ) throws Throwable
        {
            byte data = dataVector.remove(2);
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Byte.MAX_VALUE, this will overflow */
                byte result = (byte)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};