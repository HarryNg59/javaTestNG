
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Year;

public class PersonTest {

    private Person person;

    @BeforeMethod
    public void setUp() {
        person = new Person();
    }

    @Test
    public void testIsAdultTrue() {
        person.setyOB(Year.now().getValue() - 18);
        Assert.assertTrue(person.isAdult());
    }

    @Test
    public void testIsAdultFalse() {
        person.setyOB(Year.now().getValue() - 17);
        Assert.assertFalse(person.isAdult());
    }
 @Test
    public void testGetAge() {
        int yob = 1990;
        person.setyOB(yob);
        int expectedAge = Year.now().getValue() - yob;
        Assert.assertEquals(person.getAge(), expectedAge);
    }

    @Test
    public void testValidEmailTrue() {
        person.setEmail("test@example.com");
        Assert.assertTrue(person.isValidEmail());
    }

    @Test
    public void testValidEmailFalse() {
        person.setEmail("invalid-email");
        Assert.assertFalse(person.isValidEmail());
    }

    @Test public void testIsVietnamPhoneTrue() {
        person.setPhoneNumber("+84123456789");
        Assert.assertTrue(person.isVietnamPhone());
    }

    @Test
    public void testIsVietnamPhoneFalse() {
        person.setPhoneNumber("0123456789");
        Assert.assertFalse(person.isVietnamPhone());
    }

    @Test
    public void testIsVietnameseTrue() {
        person.setNationality("Vietnam");
        Assert.assertTrue(person.isVietnamese());
    }

    @Test
    public void testIsVietnameseFalse() {
        person.setNationality("USA");
        Assert.assertFalse(person.isVietnamese());
    }

    @Test public void testPersonDefaultConstructor() {
        Assert.assertNotNull(person);
        Assert.assertNull(person.getFullName());
        Assert.assertNull(person.getEmail());
        Assert.assertNull(person.getPhoneNumber());
        Assert.assertNull(person.getPlaceOfBirth());
        Assert.assertNull(person.getGender());
        Assert.assertNull(person.getNationality());
        Assert.assertEquals(person.getyOB(), 0);
        Assert.assertEquals(person.getPersonID(), 0);
    }

    @Test
    public void testPersonAllArgsConstructor() {
        Person person = new Person(1, "John Doe", 1990, "Hanoi", "Male", "john@example.com", "+84123456789", "Vietnam");
        
        Assert.assertEquals(person.getPersonID(), 1);
        Assert.assertEquals(person.getFullName(), "John Doe");
        Assert.assertEquals(person.getyOB(), 1990);
        Assert.assertEquals(person.getPlaceOfBirth(), "Hanoi");
        Assert.assertEquals(person.getGender(), "Male");
        Assert.assertEquals(person.getEmail(), "john@example.com");
        Assert.assertEquals(person.getPhoneNumber(), "+84123456789");
        Assert.assertEquals(person.getNationality(), "Vietnam");
    }
}
