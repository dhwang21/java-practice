/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.Test;



import java.nio.file.FileSystems;
import java.nio.file.Path;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void checkDimensionOfAllImages() {


        Path imagePathVerticalFlip = FileSystems.getDefault().getPath("resources", "test_vertical.bmp");
        Path imagePathHorizontalFlip = FileSystems.getDefault().getPath("resources", "test_horizontal.bmp");
        Path imagePathInverse = FileSystems.getDefault().getPath("resources", "test_inverse.bmp");
        Path imagePathBorder = FileSystems.getDefault().getPath("resources", "test_border.bmp");

        Bitmap bmpVertical = new Bitmap(imagePathVerticalFlip);
        Bitmap bmpHorizontal = new Bitmap(imagePathHorizontalFlip);
        Bitmap bmpInverse = new Bitmap(imagePathInverse);
        Bitmap bmpBorder = new Bitmap(imagePathBorder);


        assertEquals("Check that image has 512 width", 512, bmpVertical.imageData.getWidth());
        assertEquals("Check that image has 512 width", 512, bmpHorizontal.imageData.getWidth());
        assertEquals("Check that image has 512 width", 512, bmpInverse.imageData.getWidth());
        assertEquals("Check that image has 512 width", 512, bmpBorder.imageData.getWidth());

        assertEquals("Check that image has 512 height", 512, bmpVertical.imageData.getHeight());
        assertEquals("Check that image has 512 height", 512, bmpHorizontal.imageData.getHeight());
        assertEquals("Check that image has 512 height", 512, bmpInverse.imageData.getHeight());
        assertEquals("Check that image has 512 height", 512, bmpBorder.imageData.getHeight());

    }




}
