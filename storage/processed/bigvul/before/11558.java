class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            Vector<String> dataVector = new Vector<String>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE134_Uncontrolled_Format_String__Environment_printf_72b()).goodB2GSink(dataVector  );
        }
};