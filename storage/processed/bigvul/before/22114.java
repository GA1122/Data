class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MAX_VALUE;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE190_Integer_Overflow__int_max_preinc_67b()).goodB2GSink(dataContainer  );
        }
};