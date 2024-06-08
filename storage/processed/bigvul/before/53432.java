class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            float data;
    
            data = 0.0f; /* POTENTIAL FLAW: data is set to zero */
    
            LinkedList<Float> dataLinkedList = new LinkedList<Float>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE369_Divide_by_Zero__float_zero_divide_73b()).goodB2GSink(dataLinkedList  );
        }
};