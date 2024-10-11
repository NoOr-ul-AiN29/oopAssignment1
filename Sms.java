import java.time.LocalDateTime;
public class Sms{
    private Receiver receiver;
    private LocalDateTime receiverTime;
    private String textStatus;
    private String senderName="Noor";
    private LocalDateTime senderTime;

    public Sms(Receiver receiver,String textStatus) {
        this.receiver = receiver;
        this.textStatus=textStatus;
        this.senderTime=LocalDateTime.now();
    }

    public void setSenderTime(LocalDateTime senderTime){
        this.senderTime=senderTime;
    }
    public LocalDateTime getSenderTime(){
        return senderTime;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
    public Receiver getReceiver() {
        return receiver;
    }

    public String getTextStatus() {
        return textStatus;
    }

    public void setTestStatus(String textStatus) {
        this.textStatus = textStatus;
    }

    public LocalDateTime getReceiverTime() {
        return receiverTime;
    }

    public void setReceiverTime(LocalDateTime receiverTime) {
        this.receiverTime = receiverTime;
    }
    public void display(){
        receiver.display();
        System.out.println("Status: "+textStatus+"\nSent time:"+senderTime+"\nSender Name:"+senderName+"\n");
       
    }

    
    
}