import java.time.LocalDateTime;
public class Receiver {
    private String name;
    private String no;
    private String email;
    private String text;
    private int textCount;
    private LocalDateTime receiverTime;



    public Receiver(String email, String name, String no,String text) {
        this.email = email;
        this.name = name;
        this.no = no;
        this.text = text;
        
    }
    
    public Receiver(String email, String name, String no){
        this.email = email;
        this.name = name;
        this.no = no;
        this.text="null";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTextCount() {
        return textCount;
    }

    public void setTextCount(int textcount) {
        this.textCount = textcount;
    }

    public LocalDateTime getReceiverTime() {
        return receiverTime;
    }

    public void setReceiverTime(LocalDateTime receiverTime) {
        this.receiverTime = receiverTime;
    }
    public void display(){
        System.out.println("\t\t....................................");
        System.out.println("TEXT DETAILS:\nReceiver Name: "+name+"\nPhone number: "+no+"\nEmail: "+email+"\nText: "+text+"\nReceived time: "+receiverTime);
    }


    
}
