package views

import play.api.Play
import java.io.InputStream
import com.ee.assets.deployment.{ContentInfo, Deployer}
import com.google.javascript.jscomp.CompilerOptions

object Helper{
  var compilerOptions = new CompilerOptions()
  compilerOptions.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5)
  compilerOptions.setLanguageOut(CompilerOptions.LanguageMode.ECMASCRIPT5)

  val loader = new com.ee.assets.Loader(None, Play.current.mode, Play.current.configuration, Some(compilerOptions))
}