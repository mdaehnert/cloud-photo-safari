package de.mdaehner.cloud_photo_safari.model

import com.googlecode.jmapper.annotations.JGlobalMap


@JGlobalMap(excluded = ["sizes"])
class PhotoData {
    lateinit var id: String

    val sizes: MutableMap<String, PhotoSize> = HashMap()

}

/**
 * Manually filled with an extra request.
 * No automatic mapping a.t.m.
 */
data class PhotoSize(val name: String, val url: String, val height: Int, val width: Int) {

}