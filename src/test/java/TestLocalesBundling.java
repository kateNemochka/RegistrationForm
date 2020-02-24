import org.junit.Before;
import org.junit.Test;
import view.View;
import view.ViewConstants;

import java.util.ResourceBundle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestLocalesBundling implements ViewConstants {
    View view;
    ResourceBundle ukr;
    ResourceBundle eng;


    @Before
    public void setTestEnvironment() {
        View view = new View();
        ukr = view.chooseLanguage(view.UKRAINIAN);
        eng = view.chooseLanguage(view.ENGLISH);
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

//    @Test
//    public void customStringWithBundle() {
//        assertNotEquals("a", eng.getString("a"));
//    }
    @Test
    public void firstNameRequest() {
        assertEquals("name", eng.getString(INPUT_FIRST_NAME));
    }

    @Test
    public void inputRequest() {
        assertEquals("Input", eng.getString(REQUEST_MESSAGE));
    }

}
