package Nov1;

public class Email {
	private String sender;
	private String receiver;
	private String recipient;
	private String subject;

	public Email(String aSender, String aReceiver, String aRecipient, String aSubject) {
		super();
		sender = aSender;
		receiver = aReceiver;
		recipient = aRecipient;
		subject = aSubject;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String aSender) {
		sender = aSender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String aReceiver) {
		receiver = aReceiver;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String aRecipient) {
		recipient = aRecipient;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String aSubject) {
		subject = aSubject;
	}

}
