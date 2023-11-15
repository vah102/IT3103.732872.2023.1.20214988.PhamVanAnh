package AIMSprj;

import java.util.ArrayList;
import java.util.List;


public class Store {
    private List<DigitalVideoDisc> list = new ArrayList<DigitalVideoDisc>();
    public void addDvd(DigitalVideoDisc disc) {
        list.add(disc); // Them Dvd
        System.out.println("disc has been added in store \n");
    }
    public void removeDvd(DigitalVideoDisc disc) {
        if(list.isEmpty()) {
            System.out.println("No disc in list \n");  //Truong hop khong co disc trong list
        }
        else {
            if(list.remove(disc)) {
                System.out.println("Remove successfuly \n "); // xoa thanh cong
            }
            else {
                System.out.println("Not found disc to remove \n"); // khong tim duoc de xoa
            }
        }
    }
}
