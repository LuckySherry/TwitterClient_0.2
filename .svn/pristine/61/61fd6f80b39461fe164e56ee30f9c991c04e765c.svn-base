package test.hk.ust.cse.TwitterClient;

//import java.awt.geom.RoundRectangle2D;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

import junit.framework.TestCase;
import hk.ust.cse.TwitterClient.Utils;
import hk.ust.cse.TwitterClient.Views.ListView;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
//import org.eclipse.swt.graphics.Rectangle;
//import org.eclipse.swt.graphics.Region;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.UserDataHandler;


//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;


public class UtilsTest extends TestCase {
	
  Utils u=new Utils();
 
  
 @Test(timeout=10000)
  public void testGetColorFromString() throws Throwable {
    assertEquals(new Color(null, 171, 205, 239), Utils.getColorFromString("ABCDEF"));
  } 
 
 @Test(timeout=10000)
 public void testIsNullOrEmpty() throws Throwable {
	   assertEquals(true, Utils.isNullOrEmpty(null));
	   assertEquals(true, Utils.isNullOrEmpty(""));
	   assertEquals(false, Utils.isNullOrEmpty("aaaa"));
  }
  
 
 @SuppressWarnings("static-access")
@Test(timeout=10000)
 public void testSelectImageVersion() throws Throwable {
	 String a = new String("aa_normal.png");
	 String b = new String("aa_bigger.png");

     assertEquals("aa_normal.png", Utils.selectImageVersion(a, 0, 0));
     assertEquals("aa_normal.png", Utils.selectImageVersion(b, 0, 0));
     assertEquals("aa_bigger.png", Utils.selectImageVersion(a, 0, 73));
     assertEquals("aa_bigger.png", Utils.selectImageVersion(b, 0, 73));
     assertEquals("aa_bigger.png", Utils.selectImageVersion(a, 73, 73));
     assertEquals("aa_bigger.png", Utils.selectImageVersion(b, 73, 73));
     assertEquals("aa.png", Utils.selectImageVersion(a, 0, 74));
     assertEquals("aa.png", Utils.selectImageVersion(b, 0, 74));
     assertEquals("aa.png", Utils.selectImageVersion(a, 74, 74));
     assertEquals("aa.png", Utils.selectImageVersion(b, 74, 74));
     assertEquals("aa.png", Utils.selectImageVersion(new String("aa.png"), 74, 74));
     
     Utils utils=new Utils();
     utils.loadImageFromUrl(null);
     utils.loadImageFromUrlAndScale("https://si0.twimg.com/a/1356725833/t1/img/grey_header_web.png", 520, 200);
     
     Image image = Utils.loadImageFromUrl("http://images4.wikia.nocookie.net/__cb20120211102016/sonic/images/d/de/SonicBigAni.gif");
     utils.darkGradually(image, 0);
     ImageData srcData = image.getImageData();
     //System.out.println(srcData.depth);
     
    /* java.awt.Composite composite=new java.awt.Composite() {
		
		@Override
		public CompositeContext createContext(ColorModel arg0, ColorModel arg1,
				RenderingHints arg2) {
			// TODO Auto-generated method stub
			return null;
		}
	};*/
	
    //org.eclipse.swt.widgets.Text text=new org.eclipse.swt.widgets.Text((Composite) composite, 0);
    //Utils.addEnterListener(text, "", new Object());
 }
 
	  
@Test(timeout=10000)
 public void testCutRoundCorner() throws Throwable{
	
	//Display display = new Display();
    Shell shell = new Shell();
	ListView c = new ListView(shell,-1);
	
	Utils.cutRoundCorner(c, true, false, false, false);
	Utils.cutRoundCorner(c, false, true, false, false);
	Utils.cutRoundCorner(c, false, false, true, false);
	Utils.cutRoundCorner(c, false, false, false, true);
    Utils.dispose(c);
    
    Shell shell2 = new Shell();
	ListView c2 = new ListView(shell2,200);
	Utils.cutRoundCorner(c2, true, false, false, false);
	Utils.cutRoundCorner(c2, false, true, false, false);
	Utils.cutRoundCorner(c2, false, false, true, false);
	Utils.cutRoundCorner(c2, false, false, false, true);
    Utils.dispose(c2);
    
	Shell shell3 = new Shell();
	ListView c3 = new ListView(shell3,20000000);
	Utils.cutRoundCorner(c3, true, false, false, false);
	Utils.cutRoundCorner(c3, false, true, false, false);
	Utils.cutRoundCorner(c3, false, false, true, false);
	Utils.cutRoundCorner(c3, false, false, false, true);
    Utils.dispose(c3);
	
	
    ListView c1=null;
    Utils.dispose(c1);
    shell.dispose();
    shell2.dispose();
    shell3.dispose();
 }

 
  @Test
  public void testAddClickListener() throws Throwable{
	  Shell shell = new Shell();
	  ListView control = new ListView(shell,20);
	  final String methodName=new String("method_name");
	  final Object o=new Object();
	  Utils.addClickListener(control, methodName, o);
  }
  
  @Test
  public void testLoadImageFromUrl() throws Throwable{
	  String s = "";
	 // assertEquals(true, Utils.isNullOrEmpty(s));
	  Image im = Utils.loadImageFromUrl(s);
	  Image ii=null;
	  assertEquals(ii, im);
	  //im.dispose();  
  }
  
  
}

