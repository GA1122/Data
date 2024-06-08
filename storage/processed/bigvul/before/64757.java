class goodG2BSink_class{
    public void goodG2BSink(Object dataObject ) throws Throwable
        {
            String data = (String)dataObject;
    
            /* POTENTIAL FLAW: Instantiate object of class named in data (which may be from external input) */
            Class<?> tempClass = Class.forName(data);
            Object tempClassObject = tempClass.newInstance();
    
            IO.writeLine(tempClassObject.toString()); /* Use tempClassObject in some way */
    
        }
};