class good1_class{
    private void good1() throws Throwable
        {
            if (privateFive != 5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
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