class goodB2GSink_class{
    public void goodB2GSink(CWE369_Divide_by_Zero__int_PropertiesFile_modulo_67a.Container dataContainer ) throws Throwable
        {
            int data = dataContainer.containerOne;
    
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