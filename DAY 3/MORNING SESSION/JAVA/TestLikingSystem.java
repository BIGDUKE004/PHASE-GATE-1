import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLikingSystem{

    @Test
        public void TestThatNoOneLikesThis(){
        String [] list = new String[5];
        String actual = LikingSystem.noLikes(list);
        String expected = "no one like this";
        assertEquals(actual, expected);
}

    @Test
        public void TestThatOneLikesThis(){
        String [] list = new String[5];
        String actual = LikingSystem.oneLikes(list);
        String expected = "peter liked this";
        assertEquals(actual, expected);
}

}
