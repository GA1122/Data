class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            int data = CWE369_Divide_by_Zero__int_database_divide_68a.data;
    
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