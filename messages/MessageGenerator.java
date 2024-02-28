package rus.nsk.softaria.demo.shtang.messages;

import rus.nsk.softaria.demo.shtang.Consts;

public class MessageGenerator {
    public String generateMessage(String receiverName, String compareResult, String senderName) {
        return String.format(Consts.EMAIL_MESSAGE_TEMPLATE, receiverName, compareResult, senderName);
    }
}
