package ChatBot.main.usecasefamilies.requestWorkout.interactors;

class Data {
    FaceBook facebook = new FaceBook();

    Data(String message) {
        facebook.text = message.substring(0, 200);
    }

    private class FaceBook {
        String text;
    }
}