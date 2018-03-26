package pioneer.pictures

import pioneer.resource
import pioneer.pictures.Picture

import java.awt.Color
import java.awt.image.BufferedImage
import java.io._
import javax.imageio.ImageIO



object PictureProgram extends App {
  // flip a picture horizontally, grayscale it, and rotate it left
  val TestPicture = Picture.loadImage(resource("/image.png"))
  Picture.flipHorizontal(TestPicture)
  Picture.grayScale(TestPicture)
  Picture.rotateLeft(TestPicture)
  Picture.saveImage(TestPicture,"output2.png")

  // The final picture is now in the top folder of this project's directory,
  // in a file called "output2.png".
}
