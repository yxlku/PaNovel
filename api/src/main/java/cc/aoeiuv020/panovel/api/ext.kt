@file:Suppress("unused")

package cc.aoeiuv020.panovel.api

import cc.aoeiuv020.base.jar.pick
import java.net.MalformedURLException
import java.net.URL

/**
 * Created by AoEiuV020 on 2017.10.02-16:01:09.
 */

/**
 * 结尾不要斜杆/，因为有的地址可能整数后面接文件后缀.html,
 * 开头要有斜杆/，因为有的网站可能host有整数，
 */
const val firstIntPattern: String = "/(\\d+)"

fun findFirstOneInt(url: String): String = path(url).pick(firstIntPattern).first()

const val firstTwoIntPattern: String = "/(\\d+/\\d+)"
fun findFirstTwoInt(url: String): String = url.pick(firstTwoIntPattern).first()

const val firstThreeIntPattern: String = "/(\\d+/\\d+/\\d+)"
fun findThreeTwoInt(url: String): String = url.pick(firstTwoIntPattern).first()

/**
 * 地址仅路径，斜杆/开头，
 */
fun path(url: String): String = try {
    URL(url).path
} catch (e: MalformedURLException) {
    url
}

inline fun <T> tryOrNul(block: () -> T?): T? = try {
    block()
} catch (e: Exception) {
    null
}