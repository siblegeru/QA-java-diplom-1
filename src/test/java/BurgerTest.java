import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Database;
import praktikum.Ingredient;

import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    //тут нужны мокки, подключаем список из датабазе
    private List<Ingredient> ingredients;
    Burger burger;
    Bun bun;
    @Mock
    Database database;

    @Before
    public void getListingredients(){
        database = new Database();
    }

//    @Test
//    public void setBunTest(){
//        Bun expected = new Database("black bun", 100);
//        Mockito.when(burger.setBuns(bun)).thenReturn(expected);
//        Mockito.verify(bun);
//    }


}
