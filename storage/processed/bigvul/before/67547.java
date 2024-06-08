class good2_class{
    private void good2() throws Throwable
        {
            if (privateTrue)
            {
                IO.writeLine("good() Main thread name is: " + Thread.currentThread().getName());
                Thread threadTwo = new Thread()
                {
                    public void run()
                    {
                        IO.writeLine("good() In thread: " + Thread.currentThread().getName());
                    }
                };
                threadTwo.start(); /* FIX: Correctly called Thread.start() */
            }
        }
};