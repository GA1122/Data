class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            (new CWE23_Relative_Path_Traversal__Property_71b()).badSink((Object)data  );
        }
};