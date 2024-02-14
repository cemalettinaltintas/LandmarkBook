package com.cemalettinaltinas.landmarkbook;

public class Singleton {
    private  Landmark sentLanmark;
    private static Singleton singleton;

    public Landmark getSentLanmark() {
        return sentLanmark;
    }

    public void setSentLanmark(Landmark sentLanmark) {
        this.sentLanmark = sentLanmark;
    }

    private Singleton(){

    }
    public  static Singleton getInstance(){
        if (singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
}
