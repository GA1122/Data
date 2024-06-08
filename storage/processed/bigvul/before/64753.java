class badSink_class{
    public void badSink() throws Throwable
        {
            String data = CWE470_Unsafe_Reflection__PropertiesFile_68a.data;
    
            /* POTENTIAL FLAW: Instantiate object of class named in data (which may be from external input) */
            Class<?> tempClass = Class.forName(data);
            Object tempClassObject = tempClass.newInstance();
    
            IO.writeLine(tempClassObject.toString()); /* Use tempClassObject in some way */
    
        }
};