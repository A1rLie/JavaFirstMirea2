package ru.mirea.task22.Task2;

public class OperationController {
    private OperationModel model;

    private OperationView view;

    public OperationController(OperationModel model, OperationView view){
        this.model=model;
        this.view=view;
    }

    public void setOperationSymbol(String symbol){
        model.setOperationSymbol(symbol);
    }
    public String getOperationSymbol(){return  model.getOperationSymbol();}

    public void setOperationDig1(int dig1){
        model.setOperationDig1(dig1);
    }
    public int getOperationDig1(){return  model.getOperationDig1();}

    public void setOperationDig2(int dig2){
        model.setOperationDig2(dig2);
    }
    public int getOperationDig2(){return  model.getOperationDig2();}
}
