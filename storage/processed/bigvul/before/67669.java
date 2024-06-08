class good1_class{
    private void good1() throws Throwable
        {
            switch (8)
            {
            case 7:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            default:
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
                break;
            }
        }
};