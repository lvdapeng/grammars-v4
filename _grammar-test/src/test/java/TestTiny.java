import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class TestTiny {

    private static File [] ok = new File("../tiny/examples").listFiles(pathname -> pathname.isFile());

    private static File gfiles =  new File("../tiny/tiny.g4");

    @Test
    public void test(){
        Assert.assertTrue(GrammarTester.run(ok, "program", gfiles));
    }
}
