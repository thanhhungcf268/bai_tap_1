import java.util.Date;

public class StopWatch {
    private Date starTime;
    private Date endTime;

    StopWatch(){
        this.starTime = new Date();
        this.endTime = new Date();
    }
    public Date getStarTime(){
        return starTime;
    }
    public Date getEndTime(){
        return endTime;
    }
    public void setStarTime(Date starTime){
        this.starTime = starTime;
    }
    public void setEndTime(Date endTime){
        this.endTime = endTime;
    }
    public Date start(){
       return starTime = new Date();
    }
    public Date stop(){
       return endTime = new Date();
    }
    public long getElapsedTime(){
        return endTime.getTime() - starTime.getTime();
    }
}
