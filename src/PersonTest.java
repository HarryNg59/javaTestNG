
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonTest {

    private Person person;

    @BeforeMethod
    public void setUp() {
        person = new Person();
    }

    @Test
    public void testDefaultConstructor() {
        Assert.assertEquals(person.getPersonID(), 0);
        Assert.assertNull(person.getFullName());
        Assert.assertEquals(person.getyOB(), 0);
        Assert.assertNull(person.getPlaceOfBirth());
        Assert.assertNull(person.getGender());
    }

    @Test
    public void testParameterizedConstructor() {
        Person newPerson = new Person(1, "John Doe", 1990, "New York", "Male");
        Assert.assertEquals(newPerson.getPersonID(), 1);
        Assert.assertEquals(newPerson.getFullName(), "John Doe");
        Assert.assertEquals(newPerson.getyOB(), 1990);
        Assert.assertEquals(newPerson.getPlaceOfBirth(), "New York");
        Assert.assertEquals(newPerson.getGender(), "Male");
    }

    @Test public void testSetPersonID() {
        person.setPersonID(5);
        Assert.assertEquals(person.getPersonID(), 5);
    }

    @Test
    public void testSetFullName() {
        person.setFullName("Alice Wonderland");
        Assert.assertEquals(person.getFullName(), "Alice Wonderland");
    }

    @Test
    public void testSetyOB() {
        person.setyOB(1985);
        Assert.assertEquals(person.getyOB(), 1985);
    }

    @Test
    public void testSetPlaceOfBirth() {
        person.setPlaceOfBirth("Wonderland");
        Assert.assertEquals(person.getPlaceOfBirth(), "Wonderland");
    }

    @Test
    public void testSetGender() {
        person.setGender("Female");
        Assert.assertEquals(person.getGender(), "Female");
    }

    @Test
    public void testNegativePersonID() {
        person.setPersonID(-1);
        Assert.assertEquals(person.getPersonID(), -1);
    }

    @Test public void testEmptyFullName() {
        person.setFullName("");
        Assert.assertEquals(person.getFullName(), "");
    }

    @Test
    public void testLeapYearYOB() {
        person.setyOB(2000);
        Assert.assertEquals(person.getyOB(), 2000);
    }

    @Test
    public void testNonLeapYearYOB() {
        person.setyOB(1999);
        Assert.assertEquals(person.getyOB(), 1999);
    }

    @Test
    public void testPlaceOfBirthSpecialCharacters() {
        person.setPlaceOfBirth("@Wonderland!");
        Assert.assertEquals(person.getPlaceOfBirth(), "@Wonderland!");
    }

    @Test
    public void testGenderCaseSensitivity() {
        person.setGender("MALE");
        Assert.assertEquals(person.getGender(), "MALE");
    }

    @Test
    public void testNullGender() {
        person.setGender(null);
        Assert.assertNull(person.getGender());
    }
}
