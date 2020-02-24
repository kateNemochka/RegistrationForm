import model.Model;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestModel {
    Model model;

    @Before
    public void setFirstAndLastNamesOnly() {
        model = new Model();
        model.setFirstName("Kate");
        model.setSecondName(null);
        model.setLastName("Nemochka");
    }

    @Before
    public void setAddressWithoutApartment() {
        model.setCity("Kyiv");
        model.setStreet("Volodymyrska");
        model.setHouseNumber("60A");
        model.setPostalCode("06144");
    }

    @Test
    public void fullNameWithoutSecondName() {
        assertEquals("Nemochka K.", model.formFullName());
    }


    @Test
    public void fullNameWithSecondName() {
        model.setSecondName("Yuriivna");
        assertEquals("Nemochka K.Y.", model.formFullName());
    }

    @Test
    public void fullAddressWithoutApartment() {
        assertEquals("Kyiv, Volodymyrska, 60A, 06144", model.formFullAddress());
    }

    @Test
    public void fullAddressWithApartment() {
        model.setApartmentNumber("15");
        assertEquals("Kyiv, Volodymyrska, 60A, 15, 06144", model.formFullAddress());
    }
}
