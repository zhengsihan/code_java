package zsh.dbc.practice.impl;

import zsh.dbc.practice.service.DBOService;

/**
 * Created by zhengsihan, on 2019-10-18
 */
public class DBOImpl implements DBOService {
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
