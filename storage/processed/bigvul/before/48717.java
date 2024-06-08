class goodG2BSink_class{
    public void goodG2BSink(HashMap<Integer,String> passwordHashMap ) throws Throwable
        {
            String password = passwordHashMap.get(2);
    
            if (password != null)
            {
                KerberosPrincipal principal = new KerberosPrincipal("test");
                /* POTENTIAL FLAW: Use password directly in KerberosKey() */
                KerberosKey key = new KerberosKey(principal, password.toCharArray(), null);
                IO.writeLine(key.toString());
            }
    
        }
};