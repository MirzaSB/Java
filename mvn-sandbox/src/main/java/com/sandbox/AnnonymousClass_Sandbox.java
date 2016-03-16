package com.sandbox;

/**
 * Created by mbaig on 3/15/16.
 */

class ProgrammerInterview {
    public void read() {
        System.out.println("Programmer Interview !");
    }
}

class Website {
    ProgrammerInterview pi = new ProgrammerInterview() {
        public void read() {
            System.out.println("Anonymous Programmer interview!!!");
        }

        public void learn() {
            System.out.println("anonymous, learn ProgrammerInterview");
        }
    };

    public void readIt() {
        pi.read();
        //pi.learn();
    }
}
public class AnnonymousClass_Sandbox {

    public static void main(String[] args) {

        ProgrammerInterview pi = new ProgrammerInterview();
        pi.read();

        Website w = new Website();
        w.pi.read();
        //w.pi.learn();

    }
}
