
import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;


public class IngridientTypeTest {

    //проверка длинны массива
    @Test
    public void lengthMassiveTest() {
        IngredientType[] values = IngredientType.values();
        assertEquals(2, values.length);
    }
    //проверка имени Соус
    @Test
    public void souceNameTest() {
        IngredientType sauce = IngredientType.SAUCE;
        assertEquals("SAUCE", sauce.name());
    }
    //проверка имени Начинка
    @Test
    public void fillingNameTest() {
        IngredientType filling = IngredientType.FILLING;
        assertEquals("FILLING", filling.name());
    }

}