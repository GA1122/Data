class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            String data;
    
            goodG2B2PublicStatic = true;
            data = (new CWE470_Unsafe_Reflection__PropertiesFile_22b()).goodG2B2Source();
    
            /* POTENTIAL FLAW: Instantiate object of class named in data (which may be from external input) */
            Class<?> tempClass = Class.forName(data);
            Object tempClassObject = tempClass.newInstance();
    
            IO.writeLine(tempClassObject.toString()); /* Use tempClassObject in some way */
    
        }
};