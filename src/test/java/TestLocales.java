import org.junit.Before;
import org.junit.Test;
import view.View;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.assertEquals;

public class TestLocales {
    ResourceBundle ukr;
    ResourceBundle eng;

    /*@Before
    public void setTestEnvironment() {
        ukr = ResourceBundle.getBundle("resources", new Locale("uk", "UA"));
        eng = ResourceBundle.getBundle("resources", new Locale("en", "US"));
    }*/

    @Before
    public void setTestEnvironment() {
        ukr = View.Bundles.UKRAINIAN.getBundle();
        eng = View.Bundles.ENGLISH.getBundle();
    }

    @Test
    public void ukrGroupNamesAll() {
        assertEquals("усі контакти", ukr.getString("group.all"));
    }

    @Test
    public void ukrGroupNamesFam() {
        assertEquals("родина", ukr.getString("group.family"));
    }

    @Test
    public void ukrGroupNamesWork() {
        assertEquals("робота", ukr.getString("group.work"));
    }

    @Test
    public void ukrGroupNamesEm() {
        assertEquals("критична ситуація", ukr.getString("group.emergency"));
    }


    @Test
    public void engGroupNames() {
        assertEquals("all contacts", eng.getString("group.all"));
    }

}
