class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            data = 0; /* POTENTIAL FLAW: data is set to zero */
    
            Vector<Integer> dataVector = new Vector<Integer>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE369_Divide_by_Zero__int_zero_modulo_72b()).badSink(dataVector  );
        }
};