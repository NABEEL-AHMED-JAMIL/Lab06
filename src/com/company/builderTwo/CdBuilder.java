package com.company.builderTwo;

/**
 * Created by Nabeel on 10/5/2017.
 */
public class CdBuilder {

    public Cd getPanaSonic(){
        return new PanaSonic();
    }

    public Cd getSony(){
        return new Sony();
    }
}
