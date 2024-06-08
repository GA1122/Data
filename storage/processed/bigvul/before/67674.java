class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
            {
                CWE586_Explicit_Call_to_Finalize__basic_Helper goodObj = new CWE586_Explicit_Call_to_Finalize__basic_Helper();
                try
                {
                    goodObj.sayHello();
                }
                catch (Exception exception)
                {
                    IO.writeLine("An error occurred.");
                }
                finally
                {
                    /* cleanup */
                    /* FIX: set reference to null and garbage collector will eventually finalize the object */
                    goodObj = null;
                }
            }
        }
};