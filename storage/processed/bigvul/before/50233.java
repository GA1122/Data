class bad_class{
    public void bad() throws Throwable
        {
            while(true)
            {
                /* FLAW: Math.random() is a known weak PRNG */
                IO.writeLine("" + Math.random());
                break;
            }
        }
};