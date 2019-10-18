package zsh.dbc.practice.bean;

/**
 * Created by zhengsihan, on 2019-10-18
 */
public class Target1 implements DBOImpl{
    public void save(){
        System.out.println("invoke save...");
    }
    public void delete(){
        System.out.println("invoke delete...");
    }
    public void update(){
        System.out.println("invoke update...");
    }
    public void get(){
        System.out.println("invoke get...");
    }
}
