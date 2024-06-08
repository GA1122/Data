class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            Vector<String> dataVector = new Vector<String>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE476_NULL_Pointer_Dereference__String_72b()).goodB2GSink(dataVector  );
        }
};