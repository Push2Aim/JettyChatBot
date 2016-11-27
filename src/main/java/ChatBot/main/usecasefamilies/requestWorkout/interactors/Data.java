package ChatBot.main.usecasefamilies.requestWorkout.interactors;

class Data {
    FaceBook facebook = new FaceBook();

    Data(String message) {
        facebook.text = "Under construction";
    }

    private class FaceBook {
        String text;
    }
}