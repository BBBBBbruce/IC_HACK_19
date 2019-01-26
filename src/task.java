// Plan_Management

import java.util.Date;
import java.text.SimpleDataFormat;
import java.lang.Math;

public abstract class task{

  protected String task_name;
  protected String begin;
  protected String end;
  protected float worklength;
  protected Int priority;


  public task(String task_name, String begin, String end, Int priority){
    this.task_name = task_name;
    this.begin = begin;
    this.end = end;
    this.priority = priority;
    this.worklength=count_date(begin, end);
  }

  public task(String task_name, String begin, String end){
    this.task_name = task_name;
    this.begin = begin;
    this.end = end;
    this.priority = 1;
    this.worklength=count_date(begin, end);
  }

  public void UpdatePriority(String day){
    if(this.priority<7){
      float tmp = count_date(begin, day);
      float stage = (tmp/worklength)*7;

      if(Math.round(stage)>priority){
        priority++;
      }
    }
  }

  public boolean due(String day){
    if(count_date(day, end) == 0){
      return true;
    }else{
      return false;
    }
  }


  public Int get_priority(){
    return priority;
  }

}
