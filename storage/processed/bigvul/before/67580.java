class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
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