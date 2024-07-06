import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BunNameTest {

    private final String name;
    private final float price;
    Bun bun;

    public BunNameTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getBunParams() {
        return new Object[][]{
                {"black bun", 100f},
                {"!!!?!", 100f},
                {"black bunblack bunblack bunblack bunblack bunblack bunblack bun", 100},
                {"B", 100f},
                {null, 100f},
                {"black bun", 95f},
                {"black bun", 100f},
                {"black bun", 100f},
        };
    }

    @Test
    public void getNameBun(){
        bun = new Bun(name, price);
        String request = bun.getName();
        assertEquals("Введите корректное значение имени", name, request);
    }

}
