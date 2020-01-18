package three.crud;

import three.Address;
import three.HibernateUtil;

import java.util.List;

public class Usage {

    public static void main(String[] args) {
        AddressDao addressDao = new AddressDao();

        // insert operation
        Address address = new Address("SuurAmerika", 4, "Tallinn", "10119");

        addressDao.insertAddress(address);

        address = addressDao.getAddress(address.getId());

        System.out.println(address.toString());
        System.out.println("---------------------------");

        // update operation

        address.setCity("Berlin");
        addressDao.updateAddress(address);

        address = addressDao.getAddress(address.getId());
        System.out.println(address.toString());
        System.out.println("---------------------------");

        // insert new address
        Address anotherAddress = new Address("Endla", 10, "Tallinn", "10000");

        addressDao.insertAddress(anotherAddress);

        anotherAddress = addressDao.getAddress(anotherAddress.getId());

        System.out.println(anotherAddress.toString());
        System.out.println("---------------------------");

        // delete an address

        //DELETE
        addressDao.deleteAddress(anotherAddress);

        //SELECT
        List< Address > addresses = addressDao.getAddresses();
        for(Address address1 : addresses){
            System.out.println(address1.toString());
        }

        HibernateUtil.shutdown();
    }

}
