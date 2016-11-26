package ChatBot.main.usecasefamilies.requestWorkout.interactors;

class Data {
    FaceBook facebook;

    Data(String message) {
        facebook = new FaceBook(message);
    }

    private class FaceBook {
        String text;

        public FaceBook(String text) {
            this.text = text;
        }
    }
}