class badSink_class{
    private void badSink(int count ) throws Throwable
        {
            if (badPrivate)
            {
                /* POTENTIAL FLAW: Use count as the input to Thread.sleep() */
                Thread.sleep(count);
            }
        }
};