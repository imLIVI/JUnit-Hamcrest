import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SavingsAccountTest {
    private Account accountSaving;

    @BeforeAll
    public static void init() {
        System.out.println("Running tests...");
    }

    @BeforeEach
    public void startOfTest() {
        System.out.println("---------------------------------------\n[START OF THE TEST]");
        accountSaving = new SavingsAccount();
    }

    @Test
    @DisplayName("Проверка: с Savings Account нельзя платить")
    public void testPaySavingsAccount_cannotPay_fail() {
        // Arrange
        int amount = 45;
        // Act
        boolean result = accountSaving.pay(amount);
        // Assert
        Matchers.is(false);
    }

    @Test
    @DisplayName("Проверка: Savings Account всегда можно пополнить")
    public void testAddSavingsAccount_success() {
        // Arrange
        int amount = 50, expected = 100;
        // Act
        accountSaving.addMoney(amount);
        accountSaving.addMoney(amount);
        int result = accountSaving.getBalance();

        // Assert
        assertThat(expected, is(equalTo(result)));
    }

    @Test
    @DisplayName("Проверка: Savings Account не должен быть < 0")
    public void testTransferSavingsAccount_minusValue_fail() {
        // Arrange
        int amount = 500, transferAmount = 1000, expected = 500;
        Account accountChecking = new CheckingAccount();

        // Act
        accountSaving.addMoney(amount);
        accountSaving.transfer(accountChecking, transferAmount);
        int result = accountSaving.getBalance();

        // Assert
        assertThat(expected, is(equalTo(result)));
    }

    @Test
    @DisplayName("Проверка: успешный перевод с Savings Account на Checking Account")
    public void testTransferSavingsAccount_success() {
        // Arrange
        int amount = 500, transferAmount = 200, expected = 300;
        Account accountChecking = new CheckingAccount();

        // Act
        accountSaving.addMoney(amount);
        accountSaving.transfer(accountChecking, transferAmount);
        int result = accountSaving.getBalance();

        // Assert
        assertThat(expected, is(equalTo(result)));
    }

    @AfterEach
    public void endOfTest() {
        System.out.println("[END OF THE TEST]\n---------------------------------------");
    }
}
