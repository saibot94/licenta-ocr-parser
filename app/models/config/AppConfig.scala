package models.config

/**
  * Created by darkg on 03-Sep-16.
  */
object AppConfig {
  val rowDetectionPixelThreshold = scala.util.Properties.envOrElse("PIXEL_ROW_DETECT_THRESHOLD", "3").toInt
  val colDetectionPixelThreshold = scala.util.Properties.envOrElse("PIXEL_COL_DETECT_THRESHOLD", "3").toInt
  val xScaleSize = scala.util.Properties.envOrElse("XSCALE_RESIZE", "1280").toInt
  val yScaleSize = scala.util.Properties.envOrElse("YSCALE_RESIZE", "720").toInt
  val blackAndWhiteFactor = scala.util.Properties.envOrElse("BW_FACTOR", "1.3").toFloat
  val brightenOffset = scala.util.Properties.envOrElse("BRIGHTEN_OFFSET", "1.0").toFloat
  val boundingBoxExtraSpace = scala.util.Properties.envOrElse("BOUNDING_BOX_EXTRA_SPACE", "2").toInt
  val wordDetectPixelLimit = scala.util.Properties.envOrElse("WORD_DETECT_LIMIT", "2").toInt
  val resourcesFolder = scala.util.Properties.envOrElse("RESOURCE_FOLDER", "resources")
  val useCommandLineTesseract = scala.util.Properties.envOrElse("USE_COMMAND_LINE_TESSERACT", "false").toBoolean
  val preprocessImage = scala.util.Properties.envOrElse("PREPROCESS_IMAGE", "false").toBoolean
}
