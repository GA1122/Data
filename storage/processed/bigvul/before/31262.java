class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MIN_VALUE;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE191_Integer_Underflow__byte_min_sub_67b()).goodB2GSink(dataContainer  );
        }
};