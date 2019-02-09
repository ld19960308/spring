package timer;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Timer {
	@Scheduled(cron="0/5 * * * * ?")
	public void print(){
		Date nowTime=new Date(System.currentTimeMillis());
		SimpleDateFormat simple=new SimpleDateFormat("HH:mm:ss");
		String time=simple.format(nowTime);
		System.out.println(time);
	}

}
