package test.org.eclipse.wb.swt;

import static org.junit.Assert.*;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.wb.swt.SWTResourceManager;
import org.junit.Test;

public class SWTResourceManagerTest {

	@Test
	public void testConstructor() {
		SWTResourceManager tester = new SWTResourceManager();
		assertNotNull(tester);
		//SWTResourceManager.getColor(0);
		SWTResourceManager.getColor(155, 155, 155);
		RGB rgb = new RGB(155,155,155);
		SWTResourceManager.getColor(rgb);
		SWTResourceManager.disposeColors();
		SWTResourceManager.getImage("testing");
		//SWTResourceManager.decorateImage(null, null, 0);
		//SWTResourceManager.decorateImage(null, null, 1);
		
		//comments here
	}

}
