import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.typeCompatibleWith;

public class AccountTest {
    @BeforeAll
    public static void init() {
        System.out.println("Running tests...");
    }

    @BeforeEach
    public void startOfTest() {
        System.out.println("---------------------------------------\n[START OF THE TEST]\ntesting...");
    }

    @Test
    @DisplayName("Проверка: CheckingAccount.class является подклассом Account.class)")
    public void CheckingAccount_inheritsFromAccount_thenCorrect() {
        assertThat(CheckingAccount.class, typeCompatibleWith(Account.class));
    }

    @Test
    @DisplayName("Проверка: CreditAccount.class является подклассом Account.class)")
    public void CreditAccount_inheritsFromAccount_thenCorrect() {
        assertThat(CreditAccount.class, typeCompatibleWith(Account.class));
    }

    @Test
    @DisplayName("Проверка: SavingsAccount.class является подклассом Account.class)")
    public void SavingsAccount_inheritsFromAccount_thenCorrect() {
        assertThat(SavingsAccount.class, typeCompatibleWith(Account.class));
    }

    @AfterEach
    public void endOfTest() {
        System.out.println("[END OF THE TEST]\n---------------------------------------");
    }
}
