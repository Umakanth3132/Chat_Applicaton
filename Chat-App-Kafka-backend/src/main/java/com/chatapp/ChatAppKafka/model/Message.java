package com.chatapp.ChatAppKafka.model;


public class Message {
	private String sender;
    private String content;
    private String timestamp;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Message(String sender, String content) {
		super();
		this.sender = sender;
		this.content = content;
	}
	@Override
	public String toString() {
		return "Message [sender=" + sender + ", content=" + content + ", timestamp=" + timestamp + "]";
	}
    
    

}
