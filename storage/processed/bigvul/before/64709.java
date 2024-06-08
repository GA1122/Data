class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Use a hardcoded class name */
                data = "Testing.test";
            }
            else
            {
    
                /* FIX: Use a hardcoded class name */
                data = "Testing.test";
    
            }
    
            /* POTENTIAL FLAW: Instantiate object of class named in data (which may be from external input) */
            Class<?> tempClass = Class.forName(data);
            Object tempClassObject = tempClass.newInstance();
    
            IO.writeLine(tempClassObject.toString()); /* Use tempClassObject in some way */
    
        }
};