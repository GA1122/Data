class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data = (new CWE369_Divide_by_Zero__int_File_modulo_61b()).goodB2GSource();
    
            /* FIX: test for a zero modulus */
            if (data != 0)
            {
                IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
            }
            else
            {
                IO.writeLine("This would result in a modulo by zero");
            }
    
        }
};