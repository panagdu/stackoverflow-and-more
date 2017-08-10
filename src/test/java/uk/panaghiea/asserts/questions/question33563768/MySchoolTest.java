package uk.panaghiea.asserts.questions.question33563768;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class MySchoolTest extends TestCase {

    public void testTwoEventsAreEquals() throws Exception {
        List<MySchool> schoolList1 = Arrays.asList(new MySchool(SchoolEvent.CEREMONY), new MySchool(SchoolEvent.HOLIDAY));
        List<MySchool> schoolList2 = Arrays.asList(new MySchool(SchoolEvent.CEREMONY), new MySchool(SchoolEvent.HOLIDAY));

        assertThat(schoolList1, containsInAnyOrder(schoolList2.toArray()));
    }
}