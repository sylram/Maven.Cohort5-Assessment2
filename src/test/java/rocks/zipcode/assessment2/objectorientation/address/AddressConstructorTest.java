package rocks.zipcode.assessment2.objectorientation.address;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.objectorientation.Address;

/**
 * @author leon on 29/11/2018.
 */
public class AddressConstructorTest {
    @Test
    public void testNullaryConstructor() {
        // given
        String expectedLine1 = "";
        String expectedLine2 = "";
        String expectedCity = "";
        String expectedState = "";
        String expectedZipcode = "";

        // when
        Address address = new Address();

        // then
        Assert.assertEquals(expectedLine1, address.getAddressLine1());
        Assert.assertEquals(expectedLine2, address.getAddressLine2());
        Assert.assertEquals(expectedCity, address.getCity());
        Assert.assertEquals(expectedState, address.getState());
        Assert.assertEquals(expectedZipcode, address.getZipcode());
    }

    @Test
    public void testNonNullaryConstructor() {
        // given
        String expectedLine1 = "gh45efdsa";
        String expectedLine2 = "vsg34sw";
        String expectedCity = "H53EGVDSAF";
        String expectedState = "Y56HEAGA";
        String expectedZipcode = "489648";

        // when
        Address address = new Address(expectedLine1, expectedLine2, expectedCity, expectedState, expectedZipcode);

        // then
        Assert.assertEquals(expectedLine1, address.getAddressLine1());
        Assert.assertEquals(expectedLine2, address.getAddressLine2());
        Assert.assertEquals(expectedCity, address.getCity());
        Assert.assertEquals(expectedState, address.getState());
        Assert.assertEquals(expectedZipcode, address.getZipcode());
    }
}
