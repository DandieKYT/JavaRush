package tests.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTest  extends TestBase{
    @Test
    @DisplayName("Поиск пользователя по имени")
    public void searchUser(){
        basePage.openPage();
        searchPage.users()
                .searchUser()
                .checkoutResult();
    }
}
