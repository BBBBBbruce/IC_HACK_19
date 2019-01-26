import java.util.Vector;
import java.util.Scanner;

public Vector<task> excution_array;
public Vector<task> urgent_task;
public Vector<task> dailySelection;
public Int max_task = 7;

public void add_to_EA(Vector<task> excution_array, task tmp){
    excution_array.push_back(tmp);
}

public void daily_update(Vector<task> excution_array, String day){
  for(int i =0;i < excution_array.size(); i++){
    if(due(day)){
      excution_array.removeElementAt(i);
    }else{
      excution_array[i].UpdatePriority(day);
    }
  }
}

public void daily_task_selection(Vector<task> excution_array, Vector<task> urgent_task){
  urgent_task.removeAllElement();
  for(int i =0;i < excution_array.size(); i++){
    if(excution_array[i].get_priority==7){
      urgent_task.push_back(excution_array[i]);
    }
  }
}

public void UserSelectrion(Vector<task> urgent_task,Vector<task> dailySelection){
  for(int i=0; i < urgent_task.size();i++){
    Scanner reader = new Scanner(System.in); 
    System.out.println("make a selection?[y/n]");
    String n = reader.nextInt();
    if(n == "y"){
      dailySelection.push_back(urgent_task[i])
    }
    reader.close();
  }
}
