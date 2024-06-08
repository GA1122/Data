class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MIN_VALUE;
    
            Vector<Integer> dataVector = new Vector<Integer>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE191_Integer_Underflow__int_min_sub_72b()).goodB2GSink(dataVector  );
        }
};