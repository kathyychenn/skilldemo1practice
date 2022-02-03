import java.beans.Transient;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test.*;
import org.junit.*;
import java.util.*;

public class Demo1JUnitTest {
    @Test
    public void test1{
        assertEquals("happy 49th birthday", Demo1Test2.birthday(50));
    }
}
