import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String chekedName;
    private final boolean expected;

    public AccountTest(String chekedName, boolean expected) {
        this.chekedName = chekedName;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Тимоте Шаламе", true},
                {"ТимотеШаламе", false},
                {"Ти", false},
                {"Тимоте Шаламетесттес", false},
                {" Тимоте Шаламе", false},
                {"Тимоте Шаламе ", false},
        };
    }

    @DisplayName("Check user name on rules")
    @Description("This test is for check current user's name on rules.")
    @Test
    public void testCheckNameToEmbossWithTestData() {
        Account account = new Account(chekedName);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }
}