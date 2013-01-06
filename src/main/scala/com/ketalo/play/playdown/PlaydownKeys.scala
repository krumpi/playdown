package com.ketalo.play.playdown

import sbt._

trait PlaydownKeys {
  lazy val markdownAssetsGlob = SettingKey[PathFinder]("play-markdown-assets-glob")
  lazy val markdownAssetsDir = SettingKey[File]("play-markdown-assets-dir")
  lazy val markdownFileEnding = SettingKey[String]("play-markdown-file-ending")
}
