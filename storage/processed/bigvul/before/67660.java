class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                CWE586_Explicit_Call_to_Finalize__basic_Helper badObj = new CWE586_Explicit_Call_to_Finalize__basic_Helper();
                try
                {
                    badObj.sayHello();
                }
                catch (Exception exception)
                {
                    IO.writeLine("An error occurred.");
                }
                finally
                {
                    /* cleanup */
                    /* FLAW: avoid explicitly invoking the finalize method on an object */
                    badObj.finalize();
                }
            }
            else
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