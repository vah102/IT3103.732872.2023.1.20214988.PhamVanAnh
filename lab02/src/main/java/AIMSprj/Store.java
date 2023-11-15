package AIMSprj;

public class Store {
    public static final int MAX_NUMBER_DVD = 100;
    
    private DigitalVideoDisc itemInStore[] = new DigitalVideoDisc[MAX_NUMBER_DVD];
    
    private int qtyOrdered = 0;
    
    public int getQtyOrdered(){
        return qtyOrdered;
    }

    private void setQtyOrdered(int n) {
        qtyOrdered += n;
    }
    
    public void addDVD(DigitalVideoDisc disc){
        if(this.getQtyOrdered() != 100){
            itemInStore[this.getQtyOrdered()] = disc;
            setQtyOrdered(1);
            System.out.println("The disc has been added!");
        }
        else{
            System.out.println("The store is full!");
        }
    }



    public void removeDVD(DigitalVideoDisc disc){
        for(int i=0; i < qtyOrdered; i++){
            if(itemInStore[i].getTitle() == disc.getTitle()){
                for(int j = 1; j < qtyOrdered; j++){
                    itemInStore[j] = itemInStore[j+1];
                }
            }
            i--;
            setQtyOrdered(-1);
            System.out.println("The disc has been removed in the Store!");
        }
    }
}
