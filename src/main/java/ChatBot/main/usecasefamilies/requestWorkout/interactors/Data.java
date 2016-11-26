package ChatBot.main.usecasefamilies.requestWorkout.interactors;

class Data {
    private final String message;
    FaceBook facebook = new FaceBook();

    Data(String message) {
        this.message = message;
    }

    private class FaceBook {
        String text = message;
    }
}