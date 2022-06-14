package com.qa.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.qa.factory.Driver_Factory;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Generic_Functions extends Driver_Factory{

	
	
	public static byte[] takeScreenShotAsByte() throws IOException {
        return takeFullPageScreenShotAsByte();
    }
	
		
	
		
	private static byte[]takeFullPageScreenShotAsByte() throws IOException{
        Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
                .takeScreenshot(getDriver());

        BufferedImage originalImage = fpScreenshot.getImage();

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            ImageIO.write(originalImage, "png", baos);
            baos.flush();
            return baos.toByteArray();
        }
    }

}
