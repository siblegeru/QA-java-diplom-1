import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngridientTest {

    Ingredient ingredient;

    private final String name;
    private final float price;
    private static IngredientType type;

    public IngridientTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }
    @Parameterized.Parameters
    public static Object[][] getIngredientParams() {
        return new Object[][]{
                {type.SAUCE, "black bun", 100},
                {type.FILLING, "black bun", 100},
                {"", "black bun", 100},
                {10, "black bun", 100},
                {null, "black bun", 100},
                {type.SAUCE, "!!!?!", 100},
                {type.SAUCE, 100, 100},
                {type.FILLING, "black bunblack bunblack bunblack bunblack bunblack bunblack bun", 100},
                {type.FILLING, "B", 100},
                {type.FILLING, null, 100},
                {type.FILLING, "", 100},
                {type.SAUCE, "black bun", null},
                {type.SAUCE, "black bun", 24.5},
                {type.SAUCE, "black bun", -3},
                {type.SAUCE, "black bun", "seven"},
                {type.FILLING, "black bun", Float.MIN_VALUE},
                {type.FILLING, "black bun", Float.MAX_VALUE},
        };
    }

    @Test
    public void getNameIngredient(){
        ingredient = new Ingredient(type, name, price);
        String request = ingredient.getName();
        assertEquals("Введите корректное значение имени", name, request);
    }
    @Test
    public void getPriceIngredient(){
        ingredient = new Ingredient(type, name, price);
        String request = ingredient.getName();
        assertEquals("Введите корректное значение имени", name, request);
    }
    @Test
    public void getTypeIngredient(){
        ingredient = new Ingredient(type, name, price);
        IngredientType request = ingredient.getType();
        assertEquals("Введите корректное значение типа ингридиента", type, request);
    }

}
