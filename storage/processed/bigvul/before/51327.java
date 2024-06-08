class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            float data;
    
            /* FIX: Use a hardcoded number that won't a divide by zero */
            data = 2.0f;
    
            Vector<Float> dataVector = new Vector<Float>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE369_Divide_by_Zero__float_Environment_divide_72b()).goodG2BSink(dataVector  );
        }
};