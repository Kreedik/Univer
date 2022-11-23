
package sumdu.edu.ua.test;

import com.mycompany.univer.University;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


public class UniversityTest {
    @Test
    @BeforeEach
    public void annotInform(){
        System.out.println("Before each reached!");
    }
    @Test
    public void toStringTest(){
        University a=new University(21,"SumDPU","Romenskaya");
        System.out.print("21 SumDPU Romenskaya ?="+a.toString());
        assertEquals("21 SumDPU Romenskaya",a.toString());
    }
    @Test
    public void getTitleTest(){
        University a=new University(21,null,"Romenskaya");
        assertEquals(null,a.getTitle());
    }
}
