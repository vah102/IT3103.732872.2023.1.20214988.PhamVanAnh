package AIMSprj;

public class Aims {

    public static void main(String[] args) {
        // create a new cart
        Cart anOrder = new Cart();

        // create new dvd objects and add them to the cart
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
//                "Animation", "Roger Allers", 87, 19.95f);
//        anOrder.addDigitalVideoDisc(dvd1);
//
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
//                "Science Fiction", "George Lucas", 87, 24.95f);
//        anOrder.addDigitalVideoDisc(dvd2);
//
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
//                "Animation", 18.99f);
//        anOrder.addDigitalVideoDisc(dvd3);

        // Kết quả chạy thử overloading arguments
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Sherlock Holmes",
                "Detective", "Conan Doyle", 98, 18.37f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Dragon ball",
                "Animation", "Goku", 100, 25.31f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Peaky Blenders",
                "Animation", "Steven Knight", 320, 19.48f);

        anOrder.addDigitalVideoDisc(dvd1,dvd2,dvd3);

//        // Kết quả chạy thử overloading array
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Sherlock Holmes",
//                "Detective", "Conan Doyle", 98, 18.37f);
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Dragon ball",
//                "Animation", "Goku", 100, 25.31f);
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Peaky Blenders",
//                "Animation", "Steven Knight", 320, 19.48f);
//        DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
//
//        DigitalVideoDisc dvdList;
//        anOrder.addDigitalVideoDisc(dvdList);

        // print total cost of the items in the cart
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());
        System.out.println("Phạm Vân Anh 20214988");
    }
}

