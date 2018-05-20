
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tools.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.sikuli.script.*;

/**
 *
 * @author Murtada
 */

public class TestSkuli {  
       public static void main(String[] args) {
                Screen s = new Screen();
                try{
                        s.click("imgs/spotlight.png");
                        s.wait("imgs/spotlight-input.png");
                        s.click();
                        s.write("hello world#ENTER.");
                }
                catch(FindFailed e){
                        e.printStackTrace();
                }
        }
}

