package test.hk.ust.cse.TwitterClient.Views.User;
import hk.ust.cse.TwitterClient.Utils;
//import static org.junit.Assert.*;
import static org.junit.Assert.*;
import hk.ust.cse.TwitterClient.*;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.*;

import hk.ust.cse.TwitterClient.Controls.TwitterControl;
import hk.ust.cse.TwitterClient.Resources.Resources;
import hk.ust.cse.TwitterClient.Views.ControlBarItem;
import hk.ust.cse.TwitterClient.Views.NumberBar;
import hk.ust.cse.TwitterClient.Views.NumberBarItem;
import hk.ust.cse.TwitterClient.Views.Basic.ClickableComposite;
import hk.ust.cse.TwitterClient.Views.Basic.ClickableImageLabel;
import hk.ust.cse.TwitterClient.Views.Basic.HoverClickableComposite;
import hk.ust.cse.TwitterClient.Views.Basic.LinkLabel;
import hk.ust.cse.TwitterClient.Views.Home.MiniProfile;
import hk.ust.cse.TwitterClient.Views.User.*;

import org.junit.Test;
import org.w3c.dom.events.EventTarget;
import org.w3c.dom.views.AbstractView;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
//import test.hk.ust.cse.TwitterClient.Mocks.MockUser;
import org.eclipse.swt.widgets.Widget;

import test.hk.ust.cse.TwitterClient.Mocks.MockUser;

import com.sun.corba.se.impl.javax.rmi.CORBA.Util;
import com.sun.org.apache.bcel.internal.generic.NEW;

//import com.sun.org.apache.bcel.internal.generic.NEW;


public class UserMenuTest {
	//private static final org.eclipse.swt.events.MouseEvent MouseEvent = null;

	@Test(timeout=10000)
	public void testConstructor() throws Throwable {
		 Display display = new Display();
		 Shell shell = new Shell(display);
		 UserMenu userMenu=new UserMenu(shell, 10, 10, "tweets", shell);
		 UserMenu userMenu1=new UserMenu(shell, 10, 10, null, userMenu);
		 assertNotNull(userMenu);
		 assertNotNull(userMenu1);
		 
		 userMenu.setCurrentSelected(0);
		 userMenu.getCurrentSelected();
		 userMenu.getMenuItems();
		 
		 UserMenuItem userMenuItem1=userMenu.getMenuItems().get(0);
		 UserMenuItem userMenuItem11=userMenu1.getMenuItems().get(0);
		 
		 UserMenuItem userMenuItem=new UserMenuItem(shell, "tweets", 10, 10, Resources.FONT11, Resources.FONT11B);
		 //UserMenuItem userMenuItem1=new UserMenuItem(shell, "lists", 10, 10, Resources.FONT11, Resources.FONT11B);
		 assertNotNull(userMenuItem);
		 //assertNotNull(userMenuItem1);
		 userMenuItem.getTitle();
		 
		
		 Event event=new Event();
		 //Button button=new Button(shell, SWT.MouseEnter);
		// Button button=new Button(shell, 0);
		 Button button2=new Button(userMenuItem1, 0);
		 //button.notifyListeners(SWT.MouseEnter, event);
		 event.widget=button2;
		 
        
		 org.eclipse.swt.events.MouseEvent mouseEvent=new org.eclipse.swt.events.MouseEvent(event);
		 userMenu.onMenuItemClicked(mouseEvent);
		    
		        
		    
		    Event event1=new Event();
			 //Button button=new Button(shell, SWT.MouseEnter);
			// Button button=new Button(shell, 0);
			 Button button21=new Button(userMenuItem11, 0);
			 //button.notifyListeners(SWT.MouseEnter, event);
			 event1.widget=button21;
			 
	        
			org.eclipse.swt.events.MouseEvent mouseEvent1=new org.eclipse.swt.events.MouseEvent(event1);
		    userMenu1.onMenuItemClicked(mouseEvent1);
		    

		   ClickableImageLabel clickableImageLabel=new ClickableImageLabel(shell, 10, null, null, "aaa", shell);
		    Event event2=new Event();
		    event2.widget=clickableImageLabel;
		    
		    event2.type=SWT.MouseHover;
		    Listener listener[]=clickableImageLabel.getListeners(SWT.MouseHover);
		    for (Listener i:listener)
		    {
				i.handleEvent(event2);
			}
		    
		    event2.type=SWT.MouseExit;
		    Listener listener1[]=clickableImageLabel.getListeners(SWT.MouseExit);
		    for (Listener i:listener1)
		    {
				i.handleEvent(event2);
			}
		    
		    event2.type=SWT.MouseEnter;
		    Listener listener11[]=clickableImageLabel.getListeners(SWT.MouseEnter);
		    for (Listener i:listener11)
		    {
				i.handleEvent(event2);
			}
		    
		    event2.type=SWT.MouseUp;
		    Listener listener111[]=clickableImageLabel.getListeners(SWT.MouseUp);
		    for (Listener i:listener111)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseDown;
		    Listener listener1111[]=clickableImageLabel.getListeners(SWT.MouseDown);
		    for (Listener i:listener1111)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseDoubleClick;
		    Listener listener11111[]=clickableImageLabel.getListeners(SWT.MouseDoubleClick);
		    for (Listener i:listener11111)
		    {
				i.handleEvent(event2);
			}
		    
		    ClickableComposite clickableComposite=new ClickableComposite(shell);
            event2.widget=clickableComposite;
		    
		    event2.type=SWT.MouseHover;
		    Listener listener111111[]=clickableComposite.getListeners(SWT.MouseHover);
		    for (Listener i:listener111111)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseEnter;
		    Listener listener1111111[]=clickableComposite.getListeners(SWT.MouseEnter);
		    for (Listener i:listener1111111)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseExit;
		    Listener listener11111111[]=clickableComposite.getListeners(SWT.MouseExit);
		    for (Listener i:listener11111111)
		    {
				i.handleEvent(event2);
			}
		    
		    HoverClickableComposite hoverClickableComposite=new HoverClickableComposite(shell, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.WHITE_COLOR);
            event2.widget=hoverClickableComposite;
		    
		    event2.type=SWT.MouseHover;
		    Listener listener2[]=hoverClickableComposite.getListeners(SWT.MouseHover);
		    for (Listener i:listener2)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseEnter;
		    Listener listener21[]=hoverClickableComposite.getListeners(SWT.MouseEnter);
		    for (Listener i:listener21)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseExit;
		    Listener listener211[]=hoverClickableComposite.getListeners(SWT.MouseExit);
		    for (Listener i:listener211)
		    {
				i.handleEvent(event2);
			}
		    
		    hoverClickableComposite.setClicked();
		    event2.type=SWT.MouseHover;
		    Listener listener2x[]=hoverClickableComposite.getListeners(SWT.MouseHover);
		    for (Listener i:listener2x)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseEnter;
		    Listener listener21x[]=hoverClickableComposite.getListeners(SWT.MouseEnter);
		    for (Listener i:listener21x)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseExit;
		    Listener listener211x[]=hoverClickableComposite.getListeners(SWT.MouseExit);
		    for (Listener i:listener211x)
		    {
				i.handleEvent(event2);
			}
		    
		    
		    LinkLabel linkLabel=new LinkLabel(shell, 10, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.FONT11, Resources.FONT11B);
            event2.widget=linkLabel;
		    
		    event2.type=SWT.MouseHover;
		    Listener listener3[]=linkLabel.getListeners(SWT.MouseHover);
		    for (Listener i:listener3)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseEnter;
		    Listener listener31[]=linkLabel.getListeners(SWT.MouseEnter);
		    for (Listener i:listener31)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseExit;
		    Listener listener311[]=linkLabel.getListeners(SWT.MouseExit);
		    for (Listener i:listener311)
		    {
				i.handleEvent(event2);
			}
		    
		    MockUser mockUser=new MockUser("", "screenName", true, "description");
		    MiniProfile miniProfile=new MiniProfile(shell, mockUser, 0, 0);
            event2.widget=miniProfile;
		    
		    event2.type=SWT.MouseHover;
		    Listener listener4[]=miniProfile.getListeners(SWT.MouseHover);
		    for (Listener i:listener4)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseEnter;
		    Listener listener41[]=miniProfile.getListeners(SWT.MouseEnter);
		    for (Listener i:listener41)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseExit;
		    Listener listener411[]=miniProfile.getListeners(SWT.MouseExit);
		    for (Listener i:listener411)
		    {
				i.handleEvent(event2);
			}
		    
		 
				
		    org.eclipse.swt.graphics.Image image = Utils.loadImageFromUrl("https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png");
		    ControlBarItem controlBarItem=new ControlBarItem(shell, "", image, image);
		    
            event2.widget=controlBarItem;
		    
		    event2.type=SWT.MouseHover;
		    Listener listener5[]=controlBarItem.getListeners(SWT.MouseHover);
		    for (Listener i:listener5)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseEnter;
		    Listener listener51[]=controlBarItem.getListeners(SWT.MouseEnter);
		    for (Listener i:listener51)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseExit;
		    Listener listener511[]=controlBarItem.getListeners(SWT.MouseExit);
		    for (Listener i:listener511)
		    {
				i.handleEvent(event2);
			}
		    
		    NumberBarItem numberBarItem=new NumberBarItem(shell, 10, "", 10, 10, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.WHITE_COLOR, Resources.FONT11, Resources.FONT11B);
            event2.widget=numberBarItem;
		    
		    event2.type=SWT.MouseHover;
		    Listener listener6[]=numberBarItem.getListeners(SWT.MouseHover);
		    for (Listener i:listener6)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseEnter;
		    Listener listener61[]=numberBarItem.getListeners(SWT.MouseEnter);
		    for (Listener i:listener61)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseExit;
		    Listener listener611[]=numberBarItem.getListeners(SWT.MouseExit);
		    for (Listener i:listener611)
		    {
				i.handleEvent(event2);
			}
		    
            event2.widget=userMenuItem;
		    
		    event2.type=SWT.MouseHover;
		    Listener listener7[]=userMenuItem.getListeners(SWT.MouseHover);
		    for (Listener i:listener7)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseEnter;
		    Listener listener71[]=userMenuItem.getListeners(SWT.MouseEnter);
		    for (Listener i:listener71)
		    {
				i.handleEvent(event2);
			}
		    event2.type=SWT.MouseExit;
		    Listener listener711[]=userMenuItem.getListeners(SWT.MouseExit);
		    for (Listener i:listener711)
		    {
				i.handleEvent(event2);
			}
		    
		
		    
		    
		 shell.dispose();
		 display.dispose();
		 userMenu.dispose();
		 userMenu1.dispose();
	}

}
