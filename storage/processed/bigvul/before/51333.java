class bad_class{
    public void bad() throws Throwable
        {
            float data;
    
            data = -1.0f; /* Initialize data */
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            {
                String stringNumber = System.getenv("ADD");
                if (stringNumber != null)
                {
                    try
                    {
                        data = Float.parseFloat(stringNumber.trim());
                    }
                    catch (NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                    }
                }
            }
    
            HashMap<Integer,Float> dataHashMap = new HashMap<Integer,Float>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE369_Divide_by_Zero__float_Environment_divide_74b()).badSink(dataHashMap  );
        }
};