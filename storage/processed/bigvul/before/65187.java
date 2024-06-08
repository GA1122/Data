class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            Integer data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            Vector<Integer> dataVector = new Vector<Integer>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE476_NULL_Pointer_Dereference__Integer_72b()).goodB2GSink(dataVector  );
        }
};