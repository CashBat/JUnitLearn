package lern;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ StringUtilsParameterizedTest.class, StringUtilsTest.class }) //можно в этих классах вызвать @SuiteClasses на другие тест классы, и получится такая цепочка которая будет постепенно запускаться 
public class FastTestSuite {

}
