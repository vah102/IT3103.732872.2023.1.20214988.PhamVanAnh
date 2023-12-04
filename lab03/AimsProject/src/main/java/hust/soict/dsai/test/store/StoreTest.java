package hust.soict.dsai.test.store;

import hust.soict.dsai.disc.DigitalVideoDisc;
import hust.soict.dsai.store1.Store;

public class StoreTest {

    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",
                "Roger Allers",87,19.95f);
        // Khoi tao doi tuong dvd 1 voi cac gia tri nhu tren

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction",
                "Geogre Lucas",84,24.95f);
        // Khoi tao doi tuong dvd 2 voi cac gia tri nhu tren

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        // Khoi tao doi tuong dvd 3 voi cac gia tri nhu tren

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Bird King","Animation",
                "Roger Allers",87,19.95f);
        // Khoi tao doi tuong dvd 1 voi cac gia tri nhu tren
        store.removeDvd(dvd3);  // no disc
        store.addDvd(dvd1);    //add
        store.addDvd(dvd2);//add
        store.addDvd(dvd3);//add
        store.removeDvd(dvd3);// remove success
        store.removeDvd(dvd4); // not found to remove
    }


}
