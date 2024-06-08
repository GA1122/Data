class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MAX_VALUE;
    
            Vector<Byte> dataVector = new Vector<Byte>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE190_Integer_Overflow__byte_max_square_72b()).goodB2GSink(dataVector  );
        }
};