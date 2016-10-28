package ChatBot.test.requestor;

import ChatBot.main.requestor.UsecaseRegistry;
import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Interactor;
import org.junit.Test;
import org.jusecase.UsecaseExecutorTest;

public class UsecaseRegistryTest extends UsecaseExecutorTest {
    @Test
    public void requestsCanBeExecuted() {
        givenExecutor(UsecaseRegistry.USECASE);

        thenUsecaseCanBeExecuted(RequestWorkout_Interactor.class);
    }

}
