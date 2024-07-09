import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;


public class IngridientTest {

    Ingredient ingredient;
    private IngredientType type;
    private static final float DELTA = 0.001f;

    @Test
    public void getSauceIngredient(){
        ingredient = new Ingredient(type.SAUCE, "hot sauce", 100);
        String request = "SAUCE";
        assertEquals(request, ingredient.getType().toString());
    }
    @Test
    public void getFillingIngredient(){
        ingredient = new Ingredient(type.FILLING, "dinosaur", 200);
        String request = "FILLING";
        assertEquals(request, ingredient.getType().toString());
    }
    @Test
    public void getNameIngredient(){
        String name = RandomStringUtils.randomAlphabetic(10);
        ingredient = new Ingredient(type.FILLING, name, 100);
        String request = name;
        assertEquals(request, ingredient.getName());
    }

    @Test
    public void getPriceIngredient(){
        float price = 50f;
        ingredient = new Ingredient(type.FILLING, "dinosaur", price);
        float request = price;
        assertEquals(request, ingredient.getPrice(), DELTA);
    }

}
