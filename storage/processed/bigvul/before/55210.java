class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data = (new CWE369_Divide_by_Zero__int_listen_tcp_divide_61b()).goodB2GSource();
    
            /* FIX: test for a zero denominator */
            if (data != 0)
            {
                IO.writeLine("100/" + data + " = " + (100 / data) + "\n");
            }
            else
            {
                IO.writeLine("This would result in a divide by zero");
            }
    
        }
};