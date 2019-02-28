package rocks.zipcode.assessment2.objectorientation.address;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.objectorientation.Address;

/**
 * @author leon on 28/11/2018.
 */
public class SetAddressLine1 {
    @Test
    public void test1() {
        // Given
        Address address = new Address();
        String expected = "f3w4fewafewf";

        // when
        address.setAddressLine1(expected);
        String actual = address.getAddressLine1();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // Given
        Address address = new Address();
        String expected = "2t32tfdsag43h";

        // when
        address.setAddressLine1(expected);
        String actual = address.getAddressLine1();

        // then
        Assert.assertEquals(expected, actual);
    }
}
