package io.kamel.core.utils

import platform.Foundation.NSURL


internal actual fun createURL(url: String): URL = URL(NSURL.URLWithString(url)!!)

internal actual fun createURI(url: String): URI = URI(url)