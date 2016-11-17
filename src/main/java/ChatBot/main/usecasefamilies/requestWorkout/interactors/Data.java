package ChatBot.main.usecasefamilies.requestWorkout.interactors;

class Data {
    Attachment attachment = new Attachment();

    //Payload payload = new Payload();
    //int type = 4;

    private class Payload {
        Message facebook = new Message();
    }

    private class Message {
        Attachment attachment = new Attachment();
    }

    private class Attachment {
        String type = "image";
        Content payload = new Content();
    }

    private class Content {
        String url = "https://raw.githubusercontent.com/Push2Aim/JettyChatBot/master/src/main/webapp/content%20pillar%20system%202.png";
        boolean is_reusable = true;
    }
}

