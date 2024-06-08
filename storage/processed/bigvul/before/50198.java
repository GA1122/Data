class bad_class{
    public void bad() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                /* FLAW: Math.random() is a known weak PRNG */
                IO.writeLine("" + Math.random());
            }
        }
};