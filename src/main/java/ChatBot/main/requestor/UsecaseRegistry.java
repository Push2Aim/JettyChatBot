package ChatBot.main.requestor;

import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Interactor;
import org.jusecase.executors.manual.Factory;
import org.jusecase.executors.manual.ManualUsecaseExecutor;

public class UsecaseRegistry extends ManualUsecaseExecutor {
    public static final UsecaseRegistry USECASE = new UsecaseRegistry();

    private UsecaseRegistry() {
        //TODO   addUsecase(() -> new RequestWorkout_Interactor());
        addUsecase(new Factory<RequestWorkout_Interactor>() {
            public RequestWorkout_Interactor create() {
                return new RequestWorkout_Interactor();
            }
        });
    }

}
