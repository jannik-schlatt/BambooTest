package jannikschlatt.bamboo_test.test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class MainTest {
    private Main myTarget;
    
    @Before
    public void before() {
	myTarget = new Main();
    }
    
    @Test
    public void testReturnZero() {
	assertThat(myTarget.returnZero(), is(0));
    }
}