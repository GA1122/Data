class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            badPublicStatic = true;
            data = (new CWE470_Unsafe_Reflection__Environment_22b()).badSource();
    
            /* POTENTIAL FLAW: Instantiate object of class named in data (which may be from external input) */
            Class<?> tempClass = Class.forName(data);
            Object tempClassObject = tempClass.newInstance();
    
            IO.writeLine(tempClassObject.toString()); /* Use tempClassObject in some way */
    
        }
};