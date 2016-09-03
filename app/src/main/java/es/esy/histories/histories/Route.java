package es.esy.histories.histories;

import java.util.ArrayList;

/**
 * Created by nick on 8/26/16.
 */
public class Route {


    public String name;
    public String description;
    public ArrayList<String> tasks;
    public ArrayList<Sight> checkpoints;


    public Route(String description, ArrayList<String> tasks, ArrayList<Sight> checkpoints, String name) {
        this.description = description;
        this.tasks = tasks;
        this.checkpoints = checkpoints;
        this.name = name;
    }

    public Route() {

        ArrayList<String> tasks = null;

        for (int i=0; i<50; i++) {
            tasks.add(i, "test");
        }

        this.description = "Lorem ipsum dolor sit amet";
        this.tasks = tasks;
        this.checkpoints = new ArrayList<>();
        this.name = "Test";
    }

    public ArrayList<Sight> getCheckpoints() {
        return checkpoints;
    }

    public void setCheckpoints(ArrayList<Sight> checkpoints) {
        this.checkpoints = checkpoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<String> tasks) {
        this.tasks = tasks;
    }


}
