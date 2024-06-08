class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            String data;
    
            goodG2B2_private = true;
            data = goodG2B2_source();
    
            /* POTENTIAL FLAW: Instantiate object of class named in data (which may be from external input) */
            Class<?> tempClass = Class.forName(data);
            Object tempClassObject = tempClass.newInstance();
    
            IO.writeLine(tempClassObject.toString()); /* Use tempClassObject in some way */
    
        }
};