package com.ketalo.play.playdown

import sbt._
import Keys._

object PlaydownPlugin extends Plugin with PlaydownKeys {
  override def settings: Seq[Setting[_]] = super.settings ++ Seq(
      markdownAssetsDir <<= (sourceDirectory in Compile)(src => (src / "assets")),
      markdownFileEnding := ".md",
      markdownAssetsGlob <<= (markdownAssetsDir)(assetsDir => assetsDir ** "*.md"))
}
