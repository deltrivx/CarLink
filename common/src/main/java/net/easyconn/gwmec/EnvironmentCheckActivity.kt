package net.easyconn.gwmec

import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.pm.PackageManager
import android.media.MediaCodecList
import android.media.MediaFormat
import android.net.ConnectivityManager
import android.os.Build
import android.os.Bundle
import android.os.StatFs
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import java.io.File
import java.net.DatagramSocket
import java.net.InetSocketAddress
import java.net.ServerSocket
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

/**
 * 环境检测（对齐 CarUp 2.0 的车机体检 HeadUnitCheck 通用检测项）：
 * 系统 / 蓝牙 / Wi-Fi / USB / 音视频 / CarPlay 环境 / CarLife 环境 / 屏幕。
 * 每项 GOOD(✓) / WARN(!) / BAD(✕) / INFO(i)，进页面自动跑一次，可手动重测。
 * 全部使用系统通用 API，无厂商假设；文案直接中文（对齐 CarLifeVideoActivity 先例）。
 */
class EnvironmentCheckActivity : ComponentActivity() {
    private enum class Mark(val glyph: String, val color: Int) {
        GOOD("✓", 0xFF3DDC84.toInt()), WARN("!", 0xFFFFB300.toInt()),
        BAD("✕", 0xFFFF5252.toInt()), INFO("i", 0xFF8AB4F8.toInt())
    }

    private data class Item(val group: String, val name: String, val mark: Mark, val detail: String)

    private var listHost: LinearLayout? = null
    @Volatile private var running = false

    private val dp get() = resources.displayMetrics.density

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, window.decorView).apply {
            hide(WindowInsetsCompat.Type.systemBars())
            systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
        val bg = 0xFF0B1020.toInt()
        val root = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setBackgroundColor(bg); setPadding((16 * dp).toInt(), (12 * dp).toInt(), (16 * dp).toInt(), (12 * dp).toInt()) }
        val header = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL; gravity = Gravity.CENTER_VERTICAL }
        header.addView(TextView(this).apply {
            text = "环境检测"; setTextColor(0xFFFFFFFF.toInt()); textSize = 22f
            typeface = android.graphics.Typeface.create("sans-serif-medium", android.graphics.Typeface.NORMAL)
        }, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))
        val recheck = Button(this).apply {
            text = "重新检测"; setTextColor(0xFF8AB4F8.toInt())
            setBackgroundResource(android.R.color.transparent)
            setOnClickListener { runChecks() }
        }
        header.addView(recheck)
        root.addView(header)
        root.addView(TextView(this).apply {
            text = "对齐 CarUp 车机体检 · 检测投屏环境是否就绪"; setTextColor(0xFF9AA3B2.toInt()); textSize = 13f
            setPadding(0, (4 * dp).toInt(), 0, (10 * dp).toInt())
        })
        val scroll = ScrollView(this)
        val host = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        scroll.addView(host)
        root.addView(scroll, LinearLayout.LayoutParams(-1, -1))
        setContentView(root)
        listHost = host
        runChecks()
    }

    private fun runChecks() {
        if (running) return
        running = true
        val host = listHost ?: return
        runOnUiThread {
            host.removeAllViews()
            host.addView(TextView(this).apply { text = "检测中…"; setTextColor(0xFF9AA3B2.toInt()); textSize = 15f })
        }
        thread(name = "env-check") {
            val items = buildList {
                addAll(systemChecks())
                addAll(bluetoothChecks())
                addAll(wifiChecks())
                addAll(usbChecks())
                addAll(mediaChecks())
                addAll(carplayChecks())
                addAll(carlifeChecks())
                addAll(screenChecks())
            }
            runOnUiThread {
                render(host, items)
                running = false
            }
        }
    }

    private fun render(host: LinearLayout, items: List<Item>) {
        host.removeAllViews()
        var lastGroup: String? = null
        for (it in items) {
            if (it.group != lastGroup) {
                lastGroup = it.group
                host.addView(TextView(this).apply {
                    text = it.group; setTextColor(0xFF8AB4F8.toInt()); textSize = 16f
                    typeface = android.graphics.Typeface.create("sans-serif-medium", android.graphics.Typeface.NORMAL)
                    setPadding(0, (14 * dp).toInt(), 0, (4 * dp).toInt())
                })
            }
            val row = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL; gravity = Gravity.CENTER_VERTICAL; setPadding(0, (5 * dp).toInt(), 0, (5 * dp).toInt()) }
            row.addView(TextView(this).apply {
                text = it.mark.glyph; setTextColor(it.mark.color); textSize = 16f
                typeface = android.graphics.Typeface.DEFAULT_BOLD
                gravity = Gravity.CENTER
            }, LinearLayout.LayoutParams((24 * dp).toInt(), (24 * dp).toInt()))
            val textCol = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding((10 * dp).toInt(), 0, 0, 0) }
            textCol.addView(TextView(this).apply { text = it.name; setTextColor(0xFFE8EAED.toInt()); textSize = 15f })
            textCol.addView(TextView(this).apply { text = it.detail; setTextColor(0xFF9AA3B2.toInt()); textSize = 13f })
            row.addView(textCol, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))
            host.addView(row)
        }
    }

    // ---- 检测项实现（对齐 CarUp HeadUnitCheck 通用项） ----

    private fun memTotalKb(): Long = try {
        File("/proc/meminfo").readLines().firstOrNull { it.startsWith("MemTotal") }
            ?.split(Regex("\\s+"))?.get(1)?.toLong() ?: -1
    } catch (_: Exception) { -1 }

    private fun systemChecks() = listOf(
        Item("系统", "Android 版本", Mark.INFO,
            "Android ${Build.VERSION.RELEASE} (API ${Build.VERSION.SDK_INT}) · ${Build.VERSION.INCREMENTAL}"),
        Item("系统", "机型", Mark.INFO, "${Build.MANUFACTURER} ${Build.MODEL} · ${Build.HARDWARE}"),
        Item("系统", "CPU ABI", if (Build.SUPPORTED_ABIS.firstOrNull()?.contains("arm") == true) Mark.GOOD else Mark.WARN,
            Build.SUPPORTED_ABIS.joinToString(" / ")),
        Item("系统", "CPU 核数", if (Runtime.getRuntime().availableProcessors() >= 2) Mark.GOOD else Mark.WARN,
            "${Runtime.getRuntime().availableProcessors()} 核"),
        Item("系统", "NEON", run {
            val cpuinfo = try { File("/proc/cpuinfo").readText() } catch (_: Exception) { "" }
            if (Regex("\\bneon\\b|\\basimd\\b", RegexOption.IGNORE_CASE).containsMatchIn(cpuinfo)) Mark.GOOD else Mark.WARN
        }, "视频软解依赖"),
        Item("系统", "内存", if (memTotalKb() > 1_000_000) Mark.GOOD else Mark.WARN,
            if (memTotalKb() > 0) "总内存 ${memTotalKb() / 1024} MB" else "无法读取"),
        Item("系统", "可用存储", run {
            val freeMb = try { StatFs(filesDir.path).availableBytes / (1024 * 1024) } catch (_: Exception) { -1L }
            when { freeMb < 0 -> Mark.INFO; freeMb < 50 -> Mark.WARN; else -> Mark.GOOD }
        }, run {
            val freeMb = try { StatFs(filesDir.path).availableBytes / (1024 * 1024) } catch (_: Exception) { -1L }
            if (freeMb >= 0) "剩余 $freeMb MB" else "无法读取"
        }),
    )

    private fun bluetoothChecks(): List<Item> {
        val items = mutableListOf<Item>()
        val hasFeature = packageManager.hasSystemFeature(PackageManager.FEATURE_BLUETOOTH)
        items += Item("蓝牙", "蓝牙功能", if (hasFeature) Mark.GOOD else Mark.BAD,
            if (hasFeature) "系统支持蓝牙" else "系统没有蓝牙功能")
        val adapter: BluetoothAdapter? = (getSystemService(Context.BLUETOOTH_SERVICE) as? BluetoothManager)?.adapter
        items += Item("蓝牙", "蓝牙适配器", if (adapter != null) Mark.GOOD else Mark.BAD,
            if (adapter != null) "可用" else "不可用")
        if (adapter != null && !adapter.isEnabled) {
            items += Item("蓝牙", "蓝牙开关", Mark.WARN, "蓝牙关着：无线 CarPlay 与 CarLife 蓝牙配对需要蓝牙")
        } else if (adapter != null) {
            items += Item("蓝牙", "蓝牙开关", Mark.GOOD, "已打开")
            // RFCOMM 实测（对齐 CarUp CarRfcommCheck：能 listen 即认为可用）
            val latch = CountDownLatch(1)
            var verdict = "unknown"
            thread(name = "rfcomm-check") {
                try {
                    val server = adapter.listenUsingInsecureRfcommWithServiceRecord(
                        "CarLink check", java.util.UUID.fromString("3c9e8f2a-5b71-4d0e-9a52-1f0f7a0e2711"))
                    try { server.close() } catch (_: Exception) {}
                    verdict = "listen ok"
                } catch (e: SecurityException) {
                    verdict = "not permitted"
                } catch (e: Throwable) {
                    verdict = "failed: ${e.javaClass.simpleName}"
                }
                latch.countDown()
            }
            latch.await(3, TimeUnit.SECONDS)
            items += Item("蓝牙", "应用 RFCOMM 通道", when {
                verdict == "listen ok" -> Mark.GOOD
                verdict.startsWith("failed") || verdict == "hung" -> Mark.BAD
                else -> Mark.INFO
            }, verdict)
            items += Item("蓝牙", "已配对设备", Mark.INFO, run {
                val n = try { adapter.bondedDevices?.size ?: 0 } catch (_: Exception) { 0 }
                "$n 台（CarPlay/CarLife 走蓝牙通道）"
            })
        }
        return items
    }

    private fun wifiChecks(): List<Item> {
        val items = mutableListOf<Item>()
        items += Item("Wi-Fi", "Wi-Fi 功能", if (packageManager.hasSystemFeature(PackageManager.FEATURE_WIFI)) Mark.GOOD else Mark.BAD,
            if (packageManager.hasSystemFeature(PackageManager.FEATURE_WIFI)) "系统支持" else "缺失")
        val wifi = applicationContext.getSystemService(Context.WIFI_SERVICE) as? android.net.wifi.WifiManager
        items += Item("Wi-Fi", "5 GHz 频段", run {
            val supported = try { wifi?.is5GHzBandSupported } catch (_: Exception) { null }
            when { supported == true -> Mark.GOOD; supported == false -> Mark.WARN; else -> Mark.INFO }
        }, when {
            try { wifi?.is5GHzBandSupported } catch (_: Exception) { null } == true -> "支持 5 GHz，投屏画质更好"
            try { wifi?.is5GHzBandSupported } catch (_: Exception) { null } == false -> "仅 2.4 GHz：可用，画质延迟略差"
            else -> "无法判断"
        })
        // 热点支持（对齐 CarUp：tetherable wifi regexs 反射）
        val tether = try {
            val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager
            val m = ConnectivityManager::class.java.getMethod("getTetherableWifiRegexs")
            (m.invoke(cm) as? Array<*>)?.size ?: 0
        } catch (_: Exception) { 0 }
        items += Item("Wi-Fi", "系统热点", if (tether > 0) Mark.GOOD else Mark.WARN,
            if (tether > 0) "支持开启热点（无线 CarPlay 路线）" else "无法通过系统接口开热点")
        items += Item("Wi-Fi", "Wi-Fi Direct", if (packageManager.hasSystemFeature(PackageManager.FEATURE_WIFI_DIRECT)) Mark.GOOD else Mark.WARN,
            if (packageManager.hasSystemFeature(PackageManager.FEATURE_WIFI_DIRECT)) "支持（无线 CarPlay 备选路线）" else "不支持")
        val hasWlan = try {
            java.net.NetworkInterface.getNetworkInterfaces().toList().any { it.name.startsWith("wlan") }
        } catch (_: Exception) { false }
        items += Item("Wi-Fi", "网络接口", if (hasWlan) Mark.GOOD else Mark.WARN, if (hasWlan) "存在 wlan 接口" else "未发现 wlan 接口")
        return items
    }

    private fun usbChecks(): List<Item> {
        val usbManager = getSystemService(Context.USB_SERVICE) as? android.hardware.usb.UsbManager
        val devices = usbManager?.deviceList?.values ?: emptyList()
        val hasHost = packageManager.hasSystemFeature(PackageManager.FEATURE_USB_HOST)
        val apple = devices.any { it.vendorId == 0x05AC }
        val accessory = devices.any { it.vendorId == 0x18D1 && it.productId in 0x2D00..0x2D05 }
        return listOf(
            Item("USB", "USB 主机", if (hasHost) Mark.GOOD else Mark.WARN,
                if (hasHost) "支持 USB 主机模式（有线连接手机的前提）" else "系统未声明 USB 主机"),
            Item("USB", "USB 设备", Mark.INFO, "当前 ${devices.size} 台"),
            Item("USB", "iPhone 接入", if (apple) Mark.GOOD else Mark.INFO,
                if (apple) "检测到 Apple 设备（有线 CarPlay 就绪）" else "未接入 iPhone"),
            Item("USB", "CarLife 配件", if (accessory) Mark.GOOD else Mark.INFO,
                if (accessory) "手机处于 AOA 配件模式（CarLife 会话可复用）" else "手机未处于配件模式（首次连接会触发 AOA 切换）"),
        )
    }

    private fun hardwareDecoders(mime: String): List<String> = try {
        MediaCodecList(MediaCodecList.REGULAR_CODECS).codecInfos
            .filter { it.isEncoder.not() && it.supportedTypes.any { t -> t.equals(mime, true) } }
            .filter { info -> !info.name.contains("sw.") && !info.name.contains("OMX.google") && !info.name.contains("c2.android") }
            .map { it.name }
    } catch (_: Exception) { emptyList() }

    private fun mediaChecks(): List<Item> {
        val avc = hardwareDecoders(MediaFormat.MIMETYPE_VIDEO_AVC)
        val hevc = hardwareDecoders(MediaFormat.MIMETYPE_VIDEO_HEVC)
        val micFeature = packageManager.hasSystemFeature(PackageManager.FEATURE_MICROPHONE)
        val micGranted = checkSelfPermission(android.Manifest.permission.RECORD_AUDIO) ==
            PackageManager.PERMISSION_GRANTED
        return listOf(
            Item("音视频", "H.264 硬解", if (avc.isNotEmpty()) Mark.GOOD else Mark.BAD,
                if (avc.isNotEmpty()) avc.joinToString(" / ") else "没有硬件 H.264 解码器：出不了画面"),
            Item("音视频", "H.265 硬解", if (hevc.isNotEmpty()) Mark.GOOD else Mark.INFO,
                if (hevc.isNotEmpty()) hevc.joinToString(" / ") else "不支持（可选）"),
            Item("音视频", "麦克风", when {
                !micFeature -> Mark.INFO
                micGranted -> Mark.GOOD
                else -> Mark.WARN
            }, when {
                !micFeature -> "无麦克风：Siri/通话用手机端"
                micGranted -> "已授权"
                else -> "还没允许使用麦克风"
            }),
        )
    }

    private fun portFree(port: Int): Boolean = try {
        val ss = ServerSocket(); ss.reuseAddress = true
        ss.bind(InetSocketAddress(port)); ss.close(); true
    } catch (_: Exception) { false }

    private fun udpFree(port: Int): Boolean = try {
        val ds = DatagramSocket(null); ds.reuseAddress = true
        ds.bind(InetSocketAddress(port)); ds.close(); true
    } catch (_: Exception) { false }

    private fun carplayChecks(): List<Item> {
        val mfiDir = File(noBackupFilesDir, "offline-mfi")
        val competitors = listOf(
            "DrivePlay" to "com.juyou.app", "AutoKit" to "cn.manstep.phonemirrorBox",
            "Carletter" to "com.carletter.car", "Zlink" to "com.zjinnova.zlink",
            "EasyConnection" to "com.ex.carplayapp", "Amap Auto" to "com.autonavi.amapauto",
        )
        val installed = competitors.filter {
            try { packageManager.getPackageInfo(it.second, 0) != null } catch (_: Exception) { false }
        }
        return listOf(
            Item("CarPlay 环境", "MFi 离线认证资产", if (mfiDir.exists()) Mark.GOOD else Mark.WARN,
                if (mfiDir.exists()) "offline-mfi 已安装（启动时自动装载）" else "未找到（调试构建正常；正式包由 CI 注入，启动时装入）"),
            Item("CarPlay 环境", "入口端口 7000", if (portFree(7000)) Mark.INFO else Mark.WARN,
                if (portFree(7000)) "空闲；连接时才开始监听" else "被占用：连接时自动改用附近空闲端口"),
            Item("CarPlay 环境", "其他投屏应用", if (installed.isEmpty()) Mark.GOOD else Mark.WARN,
                if (installed.isEmpty()) "未发现竞品（DrivePlay/AutoKit/Zlink 等）"
                else "已安装：${installed.joinToString("、") { it.first }}（可能与本应用抢手机）"),
        )
    }

    private fun carlifeChecks() = listOf(
        Item("CarLife 环境", "发现端口 7999", if (udpFree(7999)) Mark.INFO else Mark.WARN,
            if (udpFree(7999)) "空闲；连接时才开始监听" else "被占用：若有残留会话请从主页断开后再试"),
    )

    private fun screenChecks(): List<Item> {
        val metrics = resources.displayMetrics
        val minSide = minOf(metrics.widthPixels, metrics.heightPixels)
        return listOf(
            Item("屏幕", "分辨率", if (minSide >= 480) Mark.GOOD else Mark.WARN,
                "${metrics.widthPixels}x${metrics.heightPixels} @ ${metrics.densityDpi}dpi"),
        )
    }
}
